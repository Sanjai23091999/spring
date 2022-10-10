package com.example.demoBoot.service;

import com.example.demoBoot.model.Trainee;
import com.example.demoBoot.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraineeServiceImpl  implements TraineeService{

    @Autowired
    private  TraineeRepository traineeRepository;



    @Override
    public void saveTrainee(Trainee trainee) {

        traineeRepository.save(trainee);
    }

    public Trainee getTraineeById(int employeeId){

        return traineeRepository.findById(employeeId).get();

    }

    @Override
    public List<Trainee> getAllTrainees() {
        return traineeRepository.findAll();
    }

    @Override
    public void updateTrainee(Trainee trainee) {
        traineeRepository.save(trainee);

    }


}
