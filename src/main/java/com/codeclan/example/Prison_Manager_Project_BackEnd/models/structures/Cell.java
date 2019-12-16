package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;


import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;

import java.util.ArrayList;

public class Cell {

    private ArrayList<Prisoner> prisoners;

    public Cell() {
        this.prisoners = new ArrayList<>();
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(ArrayList<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }

}
