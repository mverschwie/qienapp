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



    @ManyToMany
    @JsonBackReference
    public List<Coach> coaches = new ArrayList<>();
    public void addCoach(Coach c) {
        this.coaches.add(c);
    }

    @ManyToMany
    public List<Leerdoel> leerdoelen = new ArrayList<>();
    public void addLeerdoel(Leerdoel leerdoel) {
        this.leerdoelen.add(leerdoel);
    }

    @ManyToMany
    public List<Leidinggevende> leidinggevenden = new ArrayList<>();
    public void addLeidinggevende(Leidinggevende leidinggevende) {
        this.leidinggevenden.add(leidinggevende);
    }


}
