package com.kafka.demo.controller;

import com.kafka.demo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    //http://localhost:8080/api/v1/kafka/publish?message=helloworld
    @GetMapping("/publish")
    public ResponseEntity<String> publish(String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent");
    }
}
