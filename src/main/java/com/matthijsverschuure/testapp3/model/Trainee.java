package com.matthijsverschuure.testapp3.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trainee")


public class Trainee extends User {

    private void setTrainee(Trainee trainee) {
    }

    @ManyToMany
    @JsonBackReference
    public List<Coach> coaches = new ArrayList<>();

    public void addCoach(Coach c) {
        this.coaches.add(c);
    }

//    @OneToMany
//    @JsonBackReference
//    public List<LeerdoelHardskill> leerdoelenHardskills = new ArrayList<>();
//
//    public void addLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
//        this.leerdoelenHardskill.add(leerdoelHardskill);
//    }

    @OneToMany(mappedBy = "trainee")
    public List<LeerdoelHardskill> leerdoelenHardskill = new ArrayList<>();

    @OneToMany(mappedBy = "trainee")
    public List<LeerdoelSoftskill> leerdoelenSoftskill = new ArrayList<>();

    public void addLeerdoelhardskill(LeerdoelHardskill l) {
        this.leerdoelenHardskill.add(l);
    }


}
