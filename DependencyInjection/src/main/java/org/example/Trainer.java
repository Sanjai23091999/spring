package org.example;

public class Trainer {
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void getTrainerInfo() {
        System.out.println("Experience=="+getExperience());
    }
}
