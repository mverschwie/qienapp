package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leerdoel")
public class Leerdoel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    private String omschrijvingLeerdoel;
    private String datumAfgerond;
    private boolean isBehaald;

    private String verslag;

    private String soort;

    public void setTrainee(Trainee trainee) {
    }

    @ManyToOne
    @JoinColumn(name = "certificaatId")
    public Certificaat certificaat;


    @ManyToMany
    @JsonBackReference
    public List<Certificaat> certificaten = new ArrayList<>();
    public void addCertificaat(Certificaat certificaat) {
        this.certificaten.add(certificaat);
    }


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

    public String getVerslag() {
        return verslag;
    }

    public void setVerslag(String verslag) {
        this.verslag = verslag;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }


    @OneToMany
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee trainee) {
        this.trainees.add(trainee);
    }






}
