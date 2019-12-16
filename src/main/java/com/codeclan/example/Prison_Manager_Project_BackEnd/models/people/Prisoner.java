package com.codeclan.example.Prison_Manager_Project_BackEnd.models.people;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "prisoners")

public class Prisoner  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "morale")
    private int morale;

    @Column(name = "gang")
    private String gang;

    @JsonIgnoreProperties(value = "prisoners")
    @ManyToOne
    @JoinColumn(name = "cell_id", nullable = false)
    private Cell cell;

    public Prisoner(String name, int morale, String gang, Cell cell) {
        this.name = name;
        this.morale = morale;
        this.gang = gang;
        this.cell = cell;
    }

    public Prisoner(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public String getGang() {
        return gang;
    }

    public void setGang(String gang) {
        this.gang = gang;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}


