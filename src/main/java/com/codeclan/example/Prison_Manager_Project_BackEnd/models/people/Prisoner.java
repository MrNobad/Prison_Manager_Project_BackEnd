package com.codeclan.example.Prison_Manager_Project_BackEnd.models.people;


public class Prisoner  {

    private String name;
    private int morale;
    private String gang;

    public Prisoner(String name, int morale, String gang) {
        this.name = name;
        this.morale = morale;
        this.gang = gang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public String getGang() {
        return gang;
    }

    public void setGang(String gang) {
        this.gang = gang;
    }
}


