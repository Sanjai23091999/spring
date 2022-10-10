package com.example.demoBoot.service;

import com.example.demoBoot.model.Trainee;
import com.example.demoBoot.model.Trainer;
import com.example.demoBoot.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TrainerService {

    public void saveTrainer(Trainer trainer);

    public Trainer getTrainerById(int employeeId);

    public List<Trainer> getAllTrainers();


}
