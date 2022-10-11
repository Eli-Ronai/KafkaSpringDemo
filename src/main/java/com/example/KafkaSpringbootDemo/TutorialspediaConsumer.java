package com.example.KafkaSpringbootDemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TutorialspediaConsumer {

    private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = "tutorialspedia", groupId = "kafka-sandbox")
    public void listen(String message) {
        synchronized (messages) {
            messages.add(message);
        }
    }

    public List<String> getMessages() {
        return messages;
    }

}
