package com.codeclan.example.Prison_Manager_Project_BackEnd.controllers;


import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.cell.CellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cells")

public class CellController {

    @Autowired
    CellRepository cellRepository;

}
