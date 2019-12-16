package com.codeclan.example.Prison_Manager_Project_BackEnd.repository.guard;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Guard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GuardRepository extends JpaRepository<Guard, Long>, GuardRepositoryCustom {
}
