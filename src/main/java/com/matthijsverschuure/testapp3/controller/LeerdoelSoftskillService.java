//package com.matthijsverschuure.testapp3.controller;
//
//import com.matthijsverschuure.testapp3.model.LeerdoelSoftskill;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class LeerdoelSoftskillService {
//    @Autowired
//    LeerdoelSoftskillRepository leerdoelSoftskillRepository;
//
//    public Iterable<LeerdoelSoftskill> haalAlleLeerdoelenSoftskill() {
//        return leerdoelSoftskillRepository.findAll();
//    }
//    public LeerdoelSoftskill nieuwLeerdoelSoftskill(LeerdoelSoftskill leerdoelSoftskill) {
//        return leerdoelSoftskillRepository.save(leerdoelSoftskill);
//    }
//
//}