package me.seun.ghactionsgcpsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GhActionsGcpSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhActionsGcpSampleApplication.class, args);
    }

    @GetMapping("/api/check")
    public String checkApi() {
        return "green";
    }
}
