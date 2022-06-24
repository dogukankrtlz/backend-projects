package com.dk;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics ="dk-topic",
            groupId = "dk"
    )
    void listener(String data){
        System.out.println("Listener Received: " +data);

    }


}
