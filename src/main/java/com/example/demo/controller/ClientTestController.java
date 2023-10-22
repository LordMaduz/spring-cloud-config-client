package com.example.demo.controller;

import com.example.demo.config.NotificationConfig;
import com.example.demo.config.PersonConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class ClientTestController {

    private final PersonConfig personConfig;
    private final NotificationConfig notificationConfig;

    @GetMapping("/{entity}")
    public Mono<String> getProperty(@PathVariable final String entity) {
        if (entity.equals("person")) {
            return Mono.justOrEmpty(personConfig.getName());
        } else {
            return Mono.justOrEmpty(notificationConfig.getProfile());
        }
    }
}
