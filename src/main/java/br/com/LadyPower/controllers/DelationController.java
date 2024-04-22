package br.com.LadyPower.controllers;

import br.com.LadyPower.Entities.Delation;
import br.com.LadyPower.services.DelationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelationController {

   private final DelationService delationService;

    public DelationController(DelationService delationService) {
        this.delationService = delationService;
    }

    @PostMapping (value = "/delation", produces = "application/json")
    public ResponseEntity<Delation> createDelation(@RequestBody Delation delation) {
        return new ResponseEntity<>(delationService.createDelation(delation), HttpStatus.CREATED);
    }
}
