//package com.matthijsverschuure.testapp3.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "adres")
//public class Adres {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private long id;
//
//    @OneToOne(mappedBy = "adres")
//    private User user;
//
//    private String straatEnHuisnummer;
//    private String postcode;
//    private String woonplaats;
//
//    public String getStraatEnHuisnummer() {
//        return straatEnHuisnummer;
//    }
//
//    public void setStraatEnHuisnummer(String straatEnHuisnummer) {
//        this.straatEnHuisnummer = straatEnHuisnummer;
//    }
//
//    public String getPostcode() {
//        return postcode;
//    }
//
//    public void setPostcode(String postcode) {
//        this.postcode = postcode;
//    }
//
//    public String getWoonplaats() {
//        return woonplaats;
//    }
//
//    public void setWoonplaats(String woonplaats) {
//        this.woonplaats = woonplaats;
//    }
//
//
//}