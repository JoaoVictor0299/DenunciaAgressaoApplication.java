package br.com.LadyPower.controllers;

import br.com.LadyPower.Entities.Testimony;
import br.com.LadyPower.services.TestimonyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestimonyController {

    private final TestimonyService TestimonyService;

    public TestimonyController(br.com.LadyPower.services.TestimonyService testimonyService) {
        TestimonyService = testimonyService;
    }

    @GetMapping(value = "/testimony")
   ResponseEntity<Testimony> GetTestimony() {
        return ResponseEntity.ok(TestimonyService.getTestimony());
   }


    @PostMapping(value = "/testimony")
    ResponseEntity<Testimony> CreateTestimony(@RequestBody Testimony testimony) {
        return new ResponseEntity<>(TestimonyService.createTestimony(testimony), HttpStatus.CREATED);
    }
}

