package com.matthijsverschuure.testapp3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leidinggevende")
public class Leidinggevende extends User {

    @OneToMany(mappedBy = "leidinggevende")
    public List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee trainee) {
        this.trainees.add(trainee);
    }

}
