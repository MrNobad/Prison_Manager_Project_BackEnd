package com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prisoner;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
public interface PrisonerRepository extends JpaRepository<Prisoner, Long> {
}
