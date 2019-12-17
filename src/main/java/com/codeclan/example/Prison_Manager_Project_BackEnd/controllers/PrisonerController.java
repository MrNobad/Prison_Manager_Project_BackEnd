package com.codeclan.example.Prison_Manager_Project_BackEnd.controllers;


import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prisoner.PrisonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/prisoners")

public class PrisonerController {

    @Autowired
    PrisonerRepository prisonerRepository;

    @GetMapping
    public List<Prisoner> getAllPrisoners(){
        return prisonerRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Prisoner> getPrisoner(@PathVariable long id) {
        return prisonerRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePrisoner(@PathVariable long id){
        prisonerRepository.deleteById(id);
    }

    @PostMapping( consumes = "application/json", produces = "application/json")
    public void addPrisoner(@Valid @RequestBody Prisoner prisoner){
             prisonerRepository.save(prisoner);

    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public void updatePrisoner(@Valid @RequestBody Prisoner prisoner){
        prisonerRepository.save(prisoner);

    }




}
