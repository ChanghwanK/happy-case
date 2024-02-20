package org.example.exceptionhappycase.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HappyController {
    
    private final HappyService happyService;
    
    public HappyController(final HappyService happyService) {
        this.happyService = happyService;
    }
    
    public void happyMethod() {
        log.info("Happy method called");
    }
}
