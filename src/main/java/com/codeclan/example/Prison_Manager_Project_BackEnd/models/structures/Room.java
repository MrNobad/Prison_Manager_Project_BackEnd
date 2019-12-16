package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import com.codeclan.example.Prison_Manager_Project_BackEnd.models.people.Person;

import java.util.ArrayList;

public abstract class Room {

    public ArrayList<Person> people;

    public Room(ArrayList<Person> people) {
        this.people = people;
    }

    public Room() {
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}
