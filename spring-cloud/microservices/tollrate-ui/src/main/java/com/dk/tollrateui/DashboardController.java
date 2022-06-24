package com.dk.tollrateui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Controller
public class DashboardController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private ReactiveCircuitBreakerFactory reactiveCircuitBreakerFactory;



    @RequestMapping("/dashboard")
    public String GetTollRate(@RequestParam(defaultValue = "1000") Integer stationId, Model m) {

        ReactiveCircuitBreaker reactiveCircuitBreaker = reactiveCircuitBreakerFactory.create("tollrate-circuit-breaker");


        Mono<TollRate> rate = reactiveCircuitBreaker.run( webClientBuilder.build().get()
                .uri("http://tollrate-service/tollrateslow/" + stationId)
                .retrieve()
                .bodyToMono(TollRate.class),
                throwable -> getDefaultRate());

        System.out.println("stationId: " + stationId);
        m.addAttribute("rate", rate.block());
        return "dashboard";
    }

    /*throws this when the error occur*/
    private Mono<TollRate> getDefaultRate(){
        System.out.println("Fallback method called");
        return Mono.just(new TollRate(0,2.00f,""));
    }


}
