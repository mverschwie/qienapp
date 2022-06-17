package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Coach;
import com.matthijsverschuure.testapp3.model.LeerdoelHardskill;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TraineeService {
    @Autowired
    TraineeRepository traineeRepository;

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


    public void verwijderTraineeBijID(long id) {
        traineeRepository.deleteById(id);
    }



}