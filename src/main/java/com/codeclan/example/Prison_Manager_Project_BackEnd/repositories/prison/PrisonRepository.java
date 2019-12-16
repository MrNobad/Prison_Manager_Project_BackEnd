package com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.prison;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Prison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrisonRepository extends JpaRepository<Prison, Long> {



}
