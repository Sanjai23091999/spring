package org.example;

public class Trainee {
    private int yearOfPassOut;

    public int getYearOfPassOut() {
        return yearOfPassOut;
    }

    public void setYearOfPassOut(int yearOfPassOut) {
        this.yearOfPassOut = yearOfPassOut;
    }

    public void getTraineeDetails() {
        System.out.println("yearOfPass=="+getYearOfPassOut());
    }

}
