package net.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class Sample {

    @GetMapping("/test")
    public ResponseEntity<String> sample() {
        try {
            return ResponseEntity.status(HttpStatus
                    .OK).body("Success.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Error.");
        }
    }
}
