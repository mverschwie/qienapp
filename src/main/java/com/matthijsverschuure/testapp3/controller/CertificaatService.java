package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Certificaat;
import com.matthijsverschuure.testapp3.model.LeerdoelHardskill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CertificaatService {
    @Autowired
    CertificaatRepository certificaatRepository;
    LeerdoelHardskillService leerdoelHardskillService;
    LeerdoelHardskillRepository leerdoelHardskillRepository;


    @Autowired
    TraineeService traineeService;

    public Iterable<Certificaat> haalAlleCertificaten() {
        return certificaatRepository.findAll();
    }
    public Certificaat nieuwCertificaat(Certificaat c) {
        return certificaatRepository.save(c);
    }

    public Certificaat haalCertificaatBijID(long id) {
        if (certificaatRepository.existsById(id)) {
            return certificaatRepository.findById(id).get();
        }
        return null;
    }

//    public void koppelCertificaatAanleerdoelHardskill(long certificaatId, long leerdoelHardskillId) {
//        Certificaat c = haalCertificaatBijID(certificaatId);
//        LeerdoelHardskill l = leerdoelHardskillService.haalLeerdoelHardskillBijId(leerdoelHardskillId);
//        c.addLeerdoelHardskill(l);
//        l.addCertificaat(c);
//        leerdoelHardskillRepository.save(l);
//    }
}