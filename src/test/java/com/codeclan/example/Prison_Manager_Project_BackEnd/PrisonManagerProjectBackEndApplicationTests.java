package com.codeclan.example.Prison_Manager_Project_BackEnd;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.cell.CellRepository;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prison.PrisonRepository;
import com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prisoner.PrisonerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class PrisonManagerProjectBackEndApplicationTests {

	@Autowired
	PrisonerRepository prisonerRepository;

	@Autowired
	CellRepository cellRepository;

	@Autowired
	PrisonRepository prisonRepository;



	@Test
	void contextLoads() {
	}

	@Test
	public void createPrisonerAndSave(){
		Prison codeClan = new Prison("codeClan");
		prisonRepository.save(codeClan);

		Cell cell1 = new Cell(codeClan);
		cellRepository.save(cell1);

		Prisoner steve = new Prisoner("Steve2", 5, "Alliance", cell1);
		prisonerRepository.save(steve);



	}

}
