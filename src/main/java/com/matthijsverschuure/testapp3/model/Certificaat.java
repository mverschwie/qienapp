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


    private String certificaatUpload;

    public String getCertificaatUpload() {
        return certificaatUpload;
    }

    public void setCertificaatUpload(String certificaatUpload) {
        this.certificaatUpload = certificaatUpload;
    }

    @ManyToMany(mappedBy = "certificaat")
    public List<Leerdoel> leerdoelen = new ArrayList<>();

    public void addLeerdoel(Leerdoel leerdoel) {
        this.leerdoelen.add(leerdoel);
    }




}

