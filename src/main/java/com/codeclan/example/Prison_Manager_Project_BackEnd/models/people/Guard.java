package com.codeclan.example.Prison_Manager_Project_BackEnd.models.people;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures.Cell;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "guards")
public class Guard extends Person implements Serializable {

    @JsonIgnoreProperties("prisoners")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @OneToMany(mappedBy = "guard", fetch = FetchType.LAZY)
    private ArrayList<Cell> allocatedCells;

    public Guard(String name) {
        super(name);
        this.allocatedCells = new ArrayList<>();

    }

    public ArrayList<Cell> getAllocatedCells() {
        return allocatedCells;
    }

    public void setAllocatedCells(ArrayList<Cell> allocatedCells) {
        this.allocatedCells = allocatedCells;
    }

    public void addCellToAllocatedCells(Cell cell){
        allocatedCells.add(cell);
    }

}
