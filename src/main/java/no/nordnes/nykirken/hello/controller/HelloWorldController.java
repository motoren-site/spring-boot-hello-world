package no.nordnes.nykirken.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RequestMapping("/")
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        log.info("Hello......");
        String hostName = System.getenv("HOSTNAME");
        return "<html><body><h1>Hallo fra " + hostName +".. (Spring Boot!)</h1>" +
                "<p>Klokken er: " + getTime() +"</p>" +
                "<p>" + LocalDate.now() +"</p></body></html>";
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
    }

}
