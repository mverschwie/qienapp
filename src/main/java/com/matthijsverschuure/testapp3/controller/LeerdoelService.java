package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Certificaat;
import com.matthijsverschuure.testapp3.model.Leerdoel;
import com.matthijsverschuure.testapp3.model.Leerdoel;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LeerdoelService {
    @Autowired
    LeerdoelRepository leerdoelRepository;

    @Autowired
    CertificaatRepository certificaatRepository;

    public Iterable<Leerdoel> haalAlleLeerdoelen() {
        return leerdoelRepository.findAll();
    }
    public Leerdoel nieuwLeerdoel(Leerdoel leerdoel) {
        return leerdoelRepository.save(leerdoel);
    }

    public Leerdoel haalLeerdoelBijID(long id) {
        if (leerdoelRepository.existsById(id)) {
            return leerdoelRepository.findById(id).get();
        }
        return null;
    }

    public void koppelCertificaat(Long leerdoelId, Long certificaatId) {
        Leerdoel leerdoel = leerdoelRepository.findById(leerdoelId).get();
        Certificaat certificaat = certificaatRepository.findById(certificaatId).get();
        leerdoel.addCertificaat(certificaat);
        leerdoelRepository.save(leerdoel);

        System.out.println("Certificaat gekoppeld aan leerdoel.");
    }

//    public void koppelLeerdoelAanTrainee(long leerdoelId, long traineeId) {
//        Leerdoel leerdoel = haalLeerdoelBijID(leerdoelId);
//        Trainee trainee = traineeService.haalTraineeBijID(traineeId);
//        trainee.addLeerdoel(leerdoel);
//        leerdoel.addTrainee(trainee);
//        leerdoelRepository.save(leerdoel);
//
//    }
}