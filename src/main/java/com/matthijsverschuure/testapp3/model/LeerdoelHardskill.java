package com.matthijsverschuure.testapp3.model;

import org.slf4j.Marker;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leerdoelHardskill")
public class LeerdoelHardskill extends Leerdoel {

    private void setLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
    }

//    @ManyToOne
//    @JoinColumn(name = "trainee_id")
//    private Trainee trainee;
//
    @ManyToOne
    @JoinColumn(name = "certificaatId")
    private Certificaat certificaat;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;


//    @ManyToOne
//    public List<Certificaat> certificaten = new ArrayList<>();
//
//    public void addCertificaat(Certificaat c) {
//        this.certificaten.add(c);
//    }

}


