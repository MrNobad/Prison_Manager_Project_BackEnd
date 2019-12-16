package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;

@Entity
@Table(name = "cells")
public class Cell extends Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "cell", fetch = FetchType.LAZY)
    private ArrayList<Prisoner> prisonersInCell;

    public Cell(){
        this.prisonersInCell = new ArrayList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Prisoner> getPrisonersInCell() {
        return prisonersInCell;
    }

    public void setPrisonersInCell(ArrayList<Prisoner> prisonersInCell) {
        this.prisonersInCell = prisonersInCell;
    }

    public void addPrisonerToCell(Prisoner prisoner){
        this.prisonersInCell.add(prisoner);
    }

    public void releasePrisoner(Prisoner prisoner){
        if(prisoner.getSentenceLeft() == 0){
            this.prisonersInCell.remove(prisoner);
        }
    }

    public void movePrisoner(Prisoner prisoner){
        this.prisonersInCell.remove(prisoner);
    }

}
