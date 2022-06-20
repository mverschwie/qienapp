package com.matthijsverschuure.testapp3.model;

import com.matthijsverschuure.testapp3.controller.CertificaatRepository;
import com.matthijsverschuure.testapp3.controller.LeerdoelHardskillRepository;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leerdoelHardskill")
public class LeerdoelHardskill extends Leerdoel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @ManyToOne
    @JoinColumn(name = "certificaatId")
    public Certificaat certificaat;

    public void setLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
    }

//    public void addLeerdoelhardskill(LeerdoelHardskill l) {
//        this.leerdoelenHardskill.add(l);
//    }

//    @OneToMany(mappedBy = "trainee")
//    public List<LeerdoelHardskill> leerdoelenHardskill = new ArrayList<>();

//    public void koppelCertificaat(Long leerdoelHardskillId, Long certificaatId) {
//        LeerdoelHardskill leerdoelHardskill = leerdoelHardskillRepository.findById(leerdoelHardskillId).get();
//        Certificaat certificaat = certificaatRepository.findById(certificaatId).get();
//        certificaat.setLeerdoelHardskill(leerdoelHardskill);
//        Certificaat savedCertificaat = certificaatRepository.save(certificaat);
//        certificaatRepository.save(certificaat);
//
//        System.out.println("Certificaat gekoppeld aan leerdoel.");
//    }





}


