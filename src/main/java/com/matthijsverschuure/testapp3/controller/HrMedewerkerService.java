package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.HrMedewerker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HrMedewerkerService {
    @Autowired
    HrMedewerkerRepository hrMedewerkerRepository;

    public Iterable<HrMedewerker> haalAlleHrMedewerkers() {
        return hrMedewerkerRepository.findAll();
    }
    public HrMedewerker nieuweHrMedewerker(HrMedewerker hrMedewerker) {
        return hrMedewerkerRepository.save(hrMedewerker);
    }

//    public void verwijderTraineeBijID(long id) { traineeRepository.deleteById(id); }
//
//    }
}