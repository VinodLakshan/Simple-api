package com.example.sampleaws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @PostMapping
    public ResponseEntity getDemo(@RequestBody String name){

        return ResponseEntity.ok("Helloo " + name + "!!");
    }
}
