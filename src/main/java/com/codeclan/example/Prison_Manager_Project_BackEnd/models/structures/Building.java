package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import java.util.ArrayList;

public abstract class Building {

    private ArrayList<ArrayList<Cell>> cellBlock;

    public Building(){
        this.cellBlock = new ArrayList<>();
    }

    public ArrayList<ArrayList<Cell>> getCellBlock() {
        return cellBlock;
    }
}
