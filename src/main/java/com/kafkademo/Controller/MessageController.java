package com.kafkademo.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafkademo.KafkaProducers.ProducerService;
import com.kafkademo.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private ProducerService producerService;

    @PostMapping("/publish")
    public void publishMessage(@RequestBody MessageDto message) throws JsonProcessingException {
        producerService.publishMessage(message);
    }
}
