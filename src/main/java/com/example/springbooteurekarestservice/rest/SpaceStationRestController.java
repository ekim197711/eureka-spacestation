package com.example.springbooteurekarestservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spacestation")
public class SpaceStationRestController {

    @GetMapping("/destination")
    public String destination(){
        return "Mars";
    }
}
