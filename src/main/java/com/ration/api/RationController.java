package com.ration.api;


import com.ration.service.LoadService;
import com.ration.service.RationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RationController {

    private final RationService rationService;

    private final LoadService loadService;

    public RationController(RationService rationService, LoadService loadService) {
        this.rationService = rationService;
        this.loadService = loadService;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/ration")
    public String getRation() {
        return rationService.getRation();
    }

    @GetMapping("/load")
    public String importFile() {
        try {
            return loadService.importFile();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
