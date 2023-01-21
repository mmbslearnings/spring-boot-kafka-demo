package com.kafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicCofig {

    @Bean
    public NewTopic myFirstTopic() {
        return TopicBuilder.name("myFirstTopic")
                .build();
    }
}
