package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Person;
import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Prisoner;

import java.util.ArrayList;

public class CourtYard extends Room {

    public ArrayList<Prisoner> prisonersInCourtYard;

    public CourtYard() {
        this.prisonersInCourtYard = new ArrayList<>();
    }

    public ArrayList<Prisoner> getPrisonersInCourtYard() {
        return prisonersInCourtYard;
    }

    public void setPrisonersInCourtYard(ArrayList<Prisoner> prisonersInCourtYard) {
        this.prisonersInCourtYard = prisonersInCourtYard;
    }
}
