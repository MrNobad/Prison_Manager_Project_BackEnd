package com.codeclan.example.Prison_Manager_Project_BackEnd.models.people;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "prisoners")

public class Prisoner extends Person implements Serializable  {


    @Column(name = "name")
    private String name;


    @Column(name = "sentenceLeft")
    private int sentenceLeft;

    @Column(name = "gang")
    private String gang;

    @Column(name = "morale")
    private int morale;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JsonIgnoreProperties("prisoners")
    @ManyToOne
    @JoinColumn(name = "cell_id", nullable = false)
    private Cell cell;


    public Prisoner(String name, int sentenceLeft, String gang, int morale, Cell cell) {
        super(name);
        this.sentenceLeft = sentenceLeft;
        this.gang = gang;
        this.morale = morale;
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

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSentenceLeft() {
        return sentenceLeft;
    }

    public void setSentenceLeft(int sentenceLeft) {
        this.sentenceLeft = sentenceLeft;
    }

    public String getGang() {
        return gang;
    }

    public void setGang(String gang) {
        this.gang = gang;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

}


