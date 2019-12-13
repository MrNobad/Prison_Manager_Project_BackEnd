package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;

import java.sql.Array;
import java.util.ArrayList;

public class Cell extends Building {

    private ArrayList<Prisoner> prisonersInCell;

    public Cell(){
        this.prisonersInCell = new ArrayList();
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
