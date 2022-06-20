package com.matthijsverschuure.testapp3.model;

import com.matthijsverschuure.testapp3.controller.CertificaatRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "certificaat")

public class Certificaat {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;


    @OneToMany(mappedBy = "certificaat")
    public List<LeerdoelHardskill> leerdoelenHardskill = new ArrayList<>();



    public void setLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
    }


}

