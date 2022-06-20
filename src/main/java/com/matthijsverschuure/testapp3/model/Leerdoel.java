package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.matthijsverschuure.testapp3.controller.CertificaatRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
@Table(name = "leerdoel")
public class Leerdoel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private String omschrijvingLeerdoel;
    private String datumAfgerond;
    private boolean isBehaald;


    @ManyToOne
    @JoinColumn(name = "trainee_id")
    private Trainee trainee;

//    @ManyToOne
//    @JoinColumn(name = "certificaatId")
//    private Certificaat certificaat;

    public String getOmschrijvingLeerdoel() {
        return omschrijvingLeerdoel;
    }

    public void setOmschrijvingLeerdoel(String omschrijvingLeerdoel) {
        this.omschrijvingLeerdoel = omschrijvingLeerdoel;
    }

    public String getDatumAfgerond() {
        return datumAfgerond;
    }

    public void setDatumAfgerond(String datumAfgerond) {
        this.datumAfgerond = datumAfgerond;
    }

    public boolean getIsBehaald() {
        return isBehaald;
    }

    public void setIsBehaald(boolean IsBehaald) {
        this.isBehaald = isBehaald;
    }

    private void setLeerdoel(Leerdoel leerdoel) {
    }

    @ManyToOne
    @JoinColumn(name = "certificaatId")
    public Certificaat certificaat;

//    public List<Certificaat> certificaten = new ArrayList<>();


//    public Certificaat addCertificaat(Certificaat certificaat) {
//        System.out.println("Certificaat toegevoegd");
//        return certificaatRepository.save(certificaat);
//    }

//    @OneToMany
//    @JsonManagedReference
//    public List<Leerdoel> leerdoelen = new ArrayList<>();
//
//    public Trainee getTrainee() {
//        return trainee;
//    }
//
//    public void setTrainee(Trainee trainee) {
//        this.trainee = trainee;
//    }
//
//    public List<Leerdoel> addLeerdoel (Leerdoel leerdoel) {
//        this.leerdoelen.add(leerdoel);
//        leerdoel.setLeerdoel(this);
//        return this.leerdoelen;
//    }
//
//
//    public List<Leerdoel> removeLeerdoel (Leerdoel leerdoel) {
//        this.leerdoelen.remove(leerdoel);
//        leerdoel.setLeerdoel(this);
//        return this.leerdoelen;
//    }

//    public List<Certificaat> certificaat = new ArrayList<>();
//
//    public List<Certificaat> addCertificaat (Certificaat certificaat) {
//        this.Certificaten.add(certificaat);
//        certificaat.setCertificaat(this);
//        return this.certificaten;
//    }


//    public void setLeerdoel(Trainee trainee) {
//    }

}
