package com.example.demoBoot.repository;

import com.example.demoBoot.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository  extends JpaRepository<Trainee, Integer> {


}
