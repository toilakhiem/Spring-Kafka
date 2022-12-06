package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.net.http.WebSocket;

@Component
public class KafkaListeners{
    @KafkaListener(topics = "khiem", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: "  + data + "! Done.");
    }
}
