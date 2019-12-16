package com.codeclan.example.Prison_Manager_Project_BackEnd.models.structures;

import java.util.ArrayList;

public abstract class Building {

    private ArrayList<Room> rooms;

    public Building(){
        this.rooms = new ArrayList<>();
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
