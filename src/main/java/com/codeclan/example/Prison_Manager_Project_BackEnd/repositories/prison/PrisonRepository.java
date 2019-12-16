package com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prison;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface PrisonRepository extends JpaRepository<Prison, Long> {



}
