package com.codeclan.example.Prison_Manager_Project_BackEnd.repositories.cell;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CellRepository extends JpaRepository<Cell, Long> {

}
