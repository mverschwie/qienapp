package com.matthijsverschuure.testapp3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Leidinggevende extends User {

    @ManyToMany
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee trainee) {
        this.trainees.add(trainee);
    }

}
