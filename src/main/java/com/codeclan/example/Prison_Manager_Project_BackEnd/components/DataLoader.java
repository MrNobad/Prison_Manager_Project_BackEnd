package com.codeclan.example.Prison_Manager_Project_BackEnd.components;


import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Guard;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Room;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repository.Cell.CellRepository;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repository.guard.GuardRepository;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repository.prisoner.PrisonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PrisonerRepository prisonerRepository;

    @Autowired
    CellRepository cellRepository;

    @Autowired
    GuardRepository guardRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        DateFormat sfd = new SimpleDateFormat("dd-MM-yy");
        String newDate = "24-07-2018";
        Date date = null;
        try {
            date = sfd.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Cell cell1 = new Cell();
        cellRepository.save((cell1));


        Cell cell2 = new Cell();
        cellRepository.save((cell2));


        Cell cell3 = new Cell();
        cellRepository.save((cell3));


        Cell cell4 = new Cell();
        cellRepository.save((cell4));

        Prisoner bob = new Prisoner("Bob", 12, "Crips", 10, cell1);
        prisonerRepository.save(bob);

        Guard vince = new Guard("Vince");
        vince.addCellToAllocatedCells(cell1);
        vince.addCellToAllocatedCells(cell2);
        guardRepository.save(vince);


    }




}
