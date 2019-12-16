package com.codeclan.example.Prison_Manager_Project_BackEnd.components;



import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.cell.CellRepository;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prison.PrisonRepository;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prisoner.PrisonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PrisonerRepository prisonerRepository;

    @Autowired
    CellRepository cellRepository;

    @Autowired
    PrisonRepository prisonRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Prison codeClan = new Prison("codeClan");
        prisonRepository.save(codeClan);

        Cell cell1 = new Cell(codeClan);
        cellRepository.save(cell1);

        Cell cell2 = new Cell(codeClan);
        cellRepository.save(cell2);

        Cell cell3 = new Cell(codeClan);
        cellRepository.save(cell3);

        Cell cell4 = new Cell(codeClan);
        cellRepository.save(cell4);

        Prisoner prisoner1 = new Prisoner("Freezer", 1, "Horde", cell1);
        prisonerRepository.save(prisoner1);

        Prisoner prisoner2 = new Prisoner("Charlie", 1, "Horde", cell1);
        prisonerRepository.save(prisoner2);

        Prisoner prisoner3 = new Prisoner("Rossie", 1, "Alliance", cell2);
        prisonerRepository.save(prisoner3);

        Prisoner prisoner4 = new Prisoner("Lewis", 10, "Alliance", cell2);
        prisonerRepository.save(prisoner4);

        Prisoner prisoner5 = new Prisoner("Louis", 3, "Alliance" , cell3);
        prisonerRepository.save(prisoner5);

        Prisoner prisoner6 = new Prisoner("Stevie", 7, "Horde", cell4);
        prisonerRepository.save(prisoner6);

        Prisoner prisoner7 = new Prisoner("Zsolt", 2, "", cell4);
        prisonerRepository.save(prisoner7);


    }



//    public void run(ApplicationArguments args) {
//        DateFormat sfd = new SimpleDateFormat("dd-MM-yy");
//        String newDate = "24-07-2018";
//        Date date = null;
//        try {
//            date = sfd.parse(newDate);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//
//    }




}
