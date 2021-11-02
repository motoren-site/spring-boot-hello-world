package no.nordnes.nykirken.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RequestMapping("/")
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello......");
        return "<html><body><h1>Hallo....klokken er: " + LocalDateTime.now() +"</h1></body></html>";
    }



}
