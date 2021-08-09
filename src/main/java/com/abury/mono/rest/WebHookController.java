package com.abury.mono.rest;

import com.abury.mono.model.MonoPayloadDto;
import com.abury.mono.service.PersonalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebHookController {

    @Autowired
    public PersonalService personalService;

    @PostMapping("/")
    public HttpStatus callback(@RequestBody MonoPayloadDto monoPayloadDto) {
        log.info("Webhook received push event: {}", monoPayloadDto);
        personalService.save(monoPayloadDto.getData());
        return HttpStatus.OK;
    }
}
