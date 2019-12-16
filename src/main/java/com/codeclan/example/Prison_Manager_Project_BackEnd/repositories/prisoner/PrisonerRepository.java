package com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prisoner;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PrisonerRepository extends JpaRepository<Prisoner, Long> {
}
