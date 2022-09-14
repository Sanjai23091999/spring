package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private Trainee trainee;

    private Trainer trainer;
    private Director director;

    public Employee(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    @Autowired
    private Architect architect;

    public Employee(Trainee trainee){
        this.trainee = trainee;
    }

    public Employee(Trainer trainer){
        this.trainer = trainer;
    }
  private int id;
  private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void getTraineeInfo() {
        System.out.println("Employee Name=="+getName());
        System.out.println("Employee Id=="+getId());
        trainee.getTraineeDetails();
    }

    public void getTrainerInfo() {
        System.out.println("Employee Name=="+getName());
        System.out.println("Employee Id=="+getId());
        trainer.getTrainerInfo();
    }

    public void getDirectorInfo() {
        System.out.println("Employee Name=="+getName());
        System.out.println("Employee Id=="+getId());
        director.getDirectorInfo();
    }

    public void getArchitectInfo() {
        System.out.println("Employee Name=="+getName());
        System.out.println("Employee Id=="+getId());
        architect.getArchitectInfo();
    }
}
