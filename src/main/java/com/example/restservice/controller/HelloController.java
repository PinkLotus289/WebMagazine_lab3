package com.example.restservice.controller;

import com.example.restservice.dto.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для обработки запросов приветствия.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * Возвращает приветственное сообщение по имени.
     *
     * @param name имя пользователя (по умолчанию "Гость")
     * @return ответ с приветствием
     */
    @GetMapping
    public GreetingResponse sayHello(
            @RequestParam(name = "name", defaultValue = "Гость") String name) {
        return new GreetingResponse("Привет, " + name + "!");
    }

    /**
     * Возвращает приветственное сообщение с использованием path параметра.
     *
     * @param name имя пользователя
     * @return ответ с приветствием
     */
    @GetMapping("/{name}")
    public GreetingResponse sayHelloPath(@PathVariable String name) {
        return new GreetingResponse("Привет, " + name + "!");
    }
}
