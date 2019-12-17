package com.codeclan.example.Prison_Manager_Project_BackEnd.controllers;


import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.cell.CellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cells")

public class CellController {

    @Autowired
    CellRepository cellRepository;

    @GetMapping
    public List<Cell> getAllCells(){
        return cellRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Cell> getCell(@PathVariable long id) {
        return cellRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCell(@PathVariable long id){
        cellRepository.deleteById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addCell(@Valid @RequestBody Cell cell){
        cellRepository.save(cell);

    }


    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public void updateCell(@Valid @RequestBody Cell cell){
        cellRepository.save(cell);

    }

}
