package com.matthijsverschuure.testapp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HrMedewerker extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

}