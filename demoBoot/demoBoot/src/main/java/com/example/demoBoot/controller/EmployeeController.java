package com.example.demoBoot.controller;

import com.example.demoBoot.model.Trainee;
import com.example.demoBoot.model.Trainer;
import com.example.demoBoot.service.TraineeService;
import com.example.demoBoot.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    TraineeService traineeService;

    @Autowired
    TrainerService trainerService;

    @GetMapping("/start")
    public ModelAndView showHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("HomePage");
        return modelAndView;
    }

    @GetMapping("/saveTraineeForm")
    public  ModelAndView saveTrainee(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("saveTrainee");
        modelAndView.addObject("trainee",new Trainee());
        return modelAndView;
    }

    @PostMapping("/saveTrainee")
    public ModelAndView addTrainee(@ModelAttribute("trainee") Trainee trainee){
        traineeService.saveTrainee(trainee);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return  modelAndView ;
    }


    @GetMapping("/saveTrainerForm")
    public  ModelAndView saveTrainer(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("saveTrainer");
        modelAndView.addObject("trainer",new Trainer());
        return modelAndView;
    }

    @PostMapping("/saveTrainer")
    public ModelAndView addTrainer(@ModelAttribute("trainer") Trainer trainer){

        trainerService.saveTrainer(trainer);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return  modelAndView ;
    }


    @GetMapping("/displayTraineeById")
    public ModelAndView displayTraineeById(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("getTraineeById");
        modelAndView.addObject("trainee",new Trainee());
        return modelAndView;
    }

    @PostMapping("/displayTrainee")
    public ModelAndView getTraineeById(@ModelAttribute("trainee") Trainee displayTrainee){
        Trainee trainee = traineeService.getTraineeById(displayTrainee.getEmployeeId());
        return new ModelAndView("DisplayTraineeById","trainee",trainee);
    }

    @GetMapping("/displayTrainerById")
    public ModelAndView displayTrainerById(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("getTrainerById");
        modelAndView.addObject("trainer",new Trainer());
        return modelAndView;
    }

    @PostMapping("/displayTrainer")
    public ModelAndView getTrainerById(@ModelAttribute("trainer") Trainer displayTrainer){
        Trainer trainer = trainerService.getTrainerById(displayTrainer.getEmployeeId());
        return new ModelAndView("DisplayTrainerById","trainer",trainer);
    }

    @RequestMapping("/DisplayAllTrainees")
    public ModelAndView displayAllTrainee(){
        List<Trainee> trainees = traineeService.getAllTrainees();
        return new ModelAndView("DisplayAllTrainees","trainees",trainees);
    }

    @RequestMapping("/DisplayAllTrainers")
    public ModelAndView displayAllTrainer(){
        List<Trainer> trainers = trainerService.getAllTrainers();
        return new ModelAndView("DisplayAllTrainers","trainers",trainers);
    }

    @RequestMapping("/updateTraineeForm")
    public ModelAndView updateTraineeForm(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updateTraineeForm");
        modelAndView.addObject("trainee",new Trainee());
        return modelAndView;
    }

    @PostMapping ("/updateTrainee")
    public ModelAndView updateTrainee(@ModelAttribute("trainee") Trainee updateTrainee){
        Trainee trainee = traineeService.getTraineeById(updateTrainee.getEmployeeId());
        traineeService.saveTrainee(trainee);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        return  modelAndView ;
    }

    @RequestMapping("/updateTrainer")
    public ModelAndView updateTrainerForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updateTrainerForm");
        modelAndView.addObject("trainer",new Trainer());
        return modelAndView;
    }

    @PostMapping ("/updateTrainer")
    public ModelAndView updateTrainer(@ModelAttribute("trainer") Trainer updateTrainer){
        Trainer trainer = trainerService.getTrainerById(updateTrainer.getEmployeeId());
        trainer.setEmployeeEmail(updateTrainer.getEmployeeEmail());
        trainerService.saveTrainer(trainer);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view2");
        return  modelAndView ;
    }

}

