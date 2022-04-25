package com.pluralsight.secureui;

import com.dk.tollrateservice.TollRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Controller
public class ReportController {


    @Autowired
    private WebClient webClient;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private ReactiveCircuitBreakerFactory reactiveCircuitBreakerFactory;

    @RequestMapping("/")
    public String loadHome(){
        return "home";
    }

    @RequestMapping("/string")
    public String loadString(){

        //call downstream service
        String response = this.webClient.get()
                .uri("http://localhost:9091/v1/resource/string")
                .exchange()
                .block()
                .bodyToMono(String.class)
                .block();


        System.out.println(response);



        return "string";
    }

    @RequestMapping("/report")
    public String loadReport(Model m){

        //call downstream service
        Flux<TollData> response = this.webClient.get()
                .uri("http://localhost:8081/api/tolldata")
                .retrieve()
                .bodyToFlux(TollData.class);


        List<TollData> tolldata = response.collectList().block();

        m.addAttribute("tolldata", tolldata);

        return "report";
    }







}
