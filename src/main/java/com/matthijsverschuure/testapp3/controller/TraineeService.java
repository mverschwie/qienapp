package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TraineeService {
    @Autowired
    TraineeRepository traineeRepository;

    @Autowired
    LeerdoelRepository leerdoelRepository;

    public Iterable<Trainee> haalAlleTrainees() {
        return traineeRepository.findAll();
    }
    public Trainee nieuweTrainee(Trainee trainee) {
        return traineeRepository.save(trainee);
    }
    public Trainee haalTraineeBijID(long id) {
        if (traineeRepository.existsById(id)) {
            return traineeRepository.findById(id).get();
        }
        return null;
    }

    //Nakijken >>>
    public void koppelLeerdoel(Long traineeId, Long leerdoelId) {
        Trainee trainee = traineeRepository.findById(traineeId).get();
        Leerdoel leerdoel = leerdoelRepository.findById(leerdoelId).get();
        leerdoel.addTrainee(trainee);
        trainee.addLeerdoel(leerdoel);
        traineeRepository.save(trainee);

        System.out.println("Leerdoel gekoppeld aan trainee.");
    }


    public void verwijderTraineeBijID(long id) {
        traineeRepository.deleteById(id);
    }

}