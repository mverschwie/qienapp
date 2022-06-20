package com.matthijsverschuure.testapp3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class LeerdoelSoftskill extends Leerdoel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;


//    @ManyToOne
//    @JoinColumn(name = "certificaatId")
//    Certificaat certificaat;


}
