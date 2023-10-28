package com.jobsystem.schedule;
import org.springframework.web.bind.annotation.*;
@RestController
public class ScheduleController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}