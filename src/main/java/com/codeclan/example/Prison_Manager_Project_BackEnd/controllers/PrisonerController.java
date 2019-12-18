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


}
