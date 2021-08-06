package com.abury.mono.rest;

import com.abury.mono.model.Payload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebHookController {

    @PostMapping("/")
    public HttpStatus callback(@RequestBody Payload payload) {
        log.info("Webhook received push event: {}", payload);
        return HttpStatus.OK;
    }
}
