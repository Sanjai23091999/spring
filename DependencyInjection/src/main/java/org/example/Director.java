package org.example;

import org.springframework.stereotype.Component;


public class Director {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void getDirectorInfo() {
        System.out.println("Specialization=="+getSpecialization() );
    }
}
