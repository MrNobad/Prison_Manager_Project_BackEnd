package com.codeclan.example.Prison_Manager_Project_BackEnd.controllers;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prison.PrisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/prisons")

public class PrisonController {

    @Autowired
    PrisonRepository prisonRepository;

    @GetMapping
    public List<Prison> getAllPrisons(){
        return prisonRepository.findAll();
    }

}
