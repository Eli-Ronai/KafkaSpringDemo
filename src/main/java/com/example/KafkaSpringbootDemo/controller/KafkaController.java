package com.example.KafkaSpringbootDemo.controller;

import com.example.KafkaSpringbootDemo.TutorialspediaConsumer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KafkaController {

    private KafkaTemplate<String, String> template;
    private TutorialspediaConsumer tutorialspediaConsumer;

    public KafkaController(KafkaTemplate<String, String> template, TutorialspediaConsumer tutorialspediaConsumer) {
        System.out.println("constructed");
        this.template = template;
        this.tutorialspediaConsumer = tutorialspediaConsumer;
    }

    @GetMapping("/kafka/produce")
    public void produce(@RequestParam String message) {
        template.send("tutorialspedia", message);
    }

    @GetMapping("/kafka/messages")
    public List<String> getMessages() {
        return tutorialspediaConsumer.getMessages();
    }

}