package com.codeclan.example.Prison_Manager_Project_BackEnd.models.people;

public class Prisoner extends Person {

    private int sentenceLeft;
    private String gang;
    private int morale;

    public Prisoner(String name, int sentenceLeft, String gang, int morale) {
        super(name);
        this.sentenceLeft = sentenceLeft;
        this.gang = gang;
        this.morale = morale;
    }

    public int getSentenceLeft() {
        return sentenceLeft;
    }

    public void setSentenceLeft(int sentenceLeft) {
        this.sentenceLeft = sentenceLeft;
    }

    public String getGang() {
        return gang;
    }

    public void setGang(String gang) {
        this.gang = gang;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

}


