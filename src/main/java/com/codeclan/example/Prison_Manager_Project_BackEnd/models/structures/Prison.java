package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import java.util.ArrayList;

public class Prison {

    private ArrayList<Cell> cells;

    public Prison(){
        this.cells = new ArrayList<>();
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }
}
