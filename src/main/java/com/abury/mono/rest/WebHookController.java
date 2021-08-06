package com.abury.mono.rest;

import com.abury.mono.model.Payload;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebHookController {

    @GetMapping("/")
    public String get() {
        return "Hello!";
    }

    @PostMapping("/")
    public HttpStatus callback(@RequestBody Payload payload) {
        System.err.println(payload);
        return HttpStatus.OK;
    }
}
