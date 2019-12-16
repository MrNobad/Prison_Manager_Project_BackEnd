package com.codeclan.example.Prison_Manager_Project_BackEnd.repository.prisoner;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface PrisonerRepository extends JpaRepository<Prisoner, Long>, PrisonerRepositoryCustom {
}
