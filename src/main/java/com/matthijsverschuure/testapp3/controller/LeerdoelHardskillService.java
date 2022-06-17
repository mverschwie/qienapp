package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.LeerdoelHardskill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LeerdoelHardskillService {
    @Autowired
    LeerdoelHardskillRepository leerdoelHardskillRepository;
    TraineeService traineeService;

    public Iterable<LeerdoelHardskill> haalAlleLeerdoelenHardskill() {
        return leerdoelHardskillRepository.findAll();
    }
    public LeerdoelHardskill nieuwLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
        return leerdoelHardskillRepository.save(leerdoelHardskill);
    }

    public LeerdoelHardskill haalLeerdoelHardskillBijId(long id) {
        if (leerdoelHardskillRepository.existsById(id)) {
            return leerdoelHardskillRepository.findById(id).get();
        }
        return null;
    }

//    public LeerdoelHardskill koppelLeerdoelHardskill(long leerdoelHardskillId, long traineeId) {
//        LeerdoelHardskill l = haalLeerdoelHardskillBijId(leerdoelHardskillId);
//        Trainee t = traineeService.haalTraineeBijID(traineeId);
//        t.addLeerdoelhardskill(l);
//        leerdoelHardskillRepository.save(l);
//    }



}