package com.example.demoBoot.service;

import com.example.demoBoot.model.Trainee;
import com.example.demoBoot.model.Trainer;
import com.example.demoBoot.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    TrainerRepository trainerRepository;

    @Override
    public void saveTrainer(Trainer trainer)
        {
            trainerRepository.save(trainer);
        }

    @Override
    public Trainer getTrainerById(int employeeId) {
        return trainerRepository.findById(employeeId).get();
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

}
