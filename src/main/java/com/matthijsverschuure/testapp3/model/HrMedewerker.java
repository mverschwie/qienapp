package com.matthijsverschuure.testapp3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hrMedewerker")
public class HrMedewerker extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @OneToMany(mappedBy = "hrMedewerker")
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee trainee) {
        this.trainees.add(trainee);
    }



}