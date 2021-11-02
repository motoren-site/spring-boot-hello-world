package no.nordnes.nykirken.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@Slf4j
@RequestMapping("/")
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello......");
        String hostName = System.getenv("HOSTNAME");
        return "<html><body><h1>Halloen fra " + hostName +"...</h1>" +
                "<p>Klokken er: " + LocalTime.now() +"</p></body></html>";
    }

}
