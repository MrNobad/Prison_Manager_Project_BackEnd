package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "prisons")

public class Prison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonIgnoreProperties(value = "prison")
    @OneToMany(mappedBy = "prison")
    private List<Cell> cells;

    @Column(name = "name")
    private String name;

    public Prison(String name){
        this.cells = new ArrayList<>();
        this.name = name;
    }

    public Prison(){

    }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
}
