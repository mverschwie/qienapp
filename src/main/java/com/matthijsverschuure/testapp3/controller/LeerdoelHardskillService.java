//package com.matthijsverschuure.testapp3.controller;
//
//import com.matthijsverschuure.testapp3.model.Certificaat;
//import com.matthijsverschuure.testapp3.model.LeerdoelHardskill;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class LeerdoelHardskillService {
//    @Autowired
//    LeerdoelHardskillRepository leerdoelHardskillRepository;
//
//    @Autowired
//    CertificaatRepository certificaatRepository;
//
//    @Autowired
//    TraineeService traineeService;
//
//    public Iterable<LeerdoelHardskill> haalAlleLeerdoelenHardskill() {
//        return leerdoelHardskillRepository.findAll();
//    }
//    public LeerdoelHardskill nieuwLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
//        return leerdoelHardskillRepository.save(leerdoelHardskill);
//    }
//
//    public LeerdoelHardskill haalLeerdoelHardskillBijId(long id) {
//        if (leerdoelHardskillRepository.existsById(id)) {
//            return leerdoelHardskillRepository.findById(id).get();
//        }
//        return null;
//    }
//
////    public void koppelCertificaat(Long leerdoelHardskillId, Long certificaatId) {
////        LeerdoelHardskill leerdoelHardskill = leerdoelHardskillRepository.findById(leerdoelHardskillId).get();
////        Certificaat certificaat = certificaatRepository.findById(certificaatId).get();
////        certificaat.setLeerdoelHardskill(leerdoelHardskill);
////        Certificaat savedCertificaat = certificaatRepository.save(certificaat);
////        certificaatRepository.save(certificaat);
////
////        System.out.println("Certificaat gekoppeld aan leerdoel.");
////    }
//
//
//
//}