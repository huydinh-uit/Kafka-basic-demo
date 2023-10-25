package com.kafkademo.KafkaProducers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.kafkademo.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishMessage(@RequestBody MessageDto message) throws JsonProcessingException {
        /**
         * This is the code to publish a message to Kafka
         * The topic name is "giahuy"
         * The message is a JSON string
         */
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(message);
        kafkaTemplate.send("giahuy", json);
    }
}
