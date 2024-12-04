package com.multitap.feedback.kafka.config;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;  // 올바른 StringSerializer
import org.springframework.kafka.support.serializer.JsonSerializer;  // 올바른 JsonSerializer
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public ProducerFactory<String, Object> defaultProducerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        // todo: 나중에 main push 할 때 서버용으로 변경하기
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-1:19092,kafka-2:19092,kafka-3:19092");
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() {
        return new KafkaTemplate<>(defaultProducerFactory());
    }
}