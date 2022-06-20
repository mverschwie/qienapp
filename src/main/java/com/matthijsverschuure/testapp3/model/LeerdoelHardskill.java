package com.matthijsverschuure.testapp3.model;
import javax.persistence.*;


@Entity
@Table(name = "leerdoelHardskill")
public class LeerdoelHardskill extends Leerdoel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public void setLeerdoelHardskill(LeerdoelHardskill leerdoelHardskill) {
    }

//    public void addLeerdoelhardskill(LeerdoelHardskill l) {
//        this.leerdoelenHardskill.add(l);
//    }

//    @OneToMany(mappedBy = "trainee")
//    public List<LeerdoelHardskill> leerdoelenHardskill = new ArrayList<>();

//    public void koppelCertificaat(Long leerdoelHardskillId, Long certificaatId) {
//        LeerdoelHardskill leerdoelHardskill = leerdoelHardskillRepository.findById(leerdoelHardskillId).get();
//        Certificaat certificaat = certificaatRepository.findById(certificaatId).get();
//        certificaat.setLeerdoelHardskill(leerdoelHardskill);
//        Certificaat savedCertificaat = certificaatRepository.save(certificaat);
//        certificaatRepository.save(certificaat);
//
//        System.out.println("Certificaat gekoppeld aan leerdoel.");
//    }





}


