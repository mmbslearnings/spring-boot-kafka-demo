package com.kafka.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "myFirstTopic", groupId = "myconsumergrp")
    public void consume(String message) {
        LOGGER.info("Message received at consumer is -> {}", message);
    }
}
