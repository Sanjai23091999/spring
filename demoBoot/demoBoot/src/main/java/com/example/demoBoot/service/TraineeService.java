package com.example.demoBoot.service;

import com.example.demoBoot.model.Trainee;
import com.example.demoBoot.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface TraineeService {

    public void saveTrainee(Trainee Trainee);

    public Trainee getTraineeById(int employeeId);

    public List<Trainee> getAllTrainees();

    public void updateTrainee(Trainee trainee);



}
