package no.nordnes.nykirken.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

@Slf4j
@RequestMapping("/")
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello......");
        String hostName = System.getenv("HOSTNAME");
        return "<html><body><h1>Hallo fra " + hostName +"...</h1>" +
                "<p>Klokken er: " + LocalTime.now() +"</p></body></html>";
    }

}
