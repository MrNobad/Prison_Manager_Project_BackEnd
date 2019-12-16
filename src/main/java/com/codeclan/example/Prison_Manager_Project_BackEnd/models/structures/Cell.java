package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;


import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "cells")

public class Cell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonIgnoreProperties(value = "cells")
    @ManyToOne
    @JoinColumn(name = "prison_id", nullable = false)
    private Prison prison;

    @JsonIgnoreProperties(value = "cell")
    @OneToMany(mappedBy = "cell")
    private List<Prisoner> prisoners;

    public Cell(Prison prison) {
        this.prisoners = new ArrayList<>();
        this.prison = prison;
    }

    public Cell(){

    }

    public List<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(List<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prison getPrison() {
        return prison;
    }

    public void setPrison(Prison prison) {
        this.prison = prison;
    }
}
