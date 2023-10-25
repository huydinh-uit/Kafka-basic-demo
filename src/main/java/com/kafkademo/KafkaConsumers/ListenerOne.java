package com.kafkademo.KafkaConsumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerOne {

    @KafkaListener(topics = "giahuy", groupId = "group_id 111")
    public void listen(String message) {
        System.out.println("Received Message in group 111: " + message);
    }
}
