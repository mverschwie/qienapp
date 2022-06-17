package com.matthijsverschuure.testapp3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "certificaat")


public class Certificaat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    // Todo MappedBy()

    @OneToOne
    @JoinColumn(name = "leerdoelHardskillId")
    private LeerdoelHardskill leerdoelHardskill;

    @OneToOne
    @JoinColumn(name = "leerdoelSoftskillId")
    private LeerdoelSoftskill leerdoelSoftskill;

//    public List<LeerdoelHardskill> leerdoelenHardskill = new ArrayList<>();
//
//    public void addLeerdoelHardskill(LeerdoelHardskill l) {
//        this.leerdoelenHardskill.add(l);
//    }

//    public List<LeerdoelHardskill> leerdoelenHardskill = new ArrayList<>();
//
//    public void addLeerdoelHardskill(LeerdoelHardskill l) {
//        this.leerdoelenHardskill.add(l);
//    }

}

