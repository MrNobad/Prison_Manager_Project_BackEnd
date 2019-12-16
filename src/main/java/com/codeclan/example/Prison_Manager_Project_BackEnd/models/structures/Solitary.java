package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Person;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;

import java.util.ArrayList;

public class Solitary extends Room {

    private ArrayList<Prisoner> prisonersInSolitary;

    public Solitary() {
        this.prisonersInSolitary = new ArrayList<>();
    }

    public ArrayList<Prisoner> getPrisonersInCourtYard() {
        return prisonersInSolitary;
    }

    public void setPrisonersInCourtYard(ArrayList<Prisoner> prisonersInCourtYard) {
        this.prisonersInSolitary = prisonersInCourtYard;
    }

    }

