package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.HrMedewerkerService;
import com.matthijsverschuure.testapp3.model.HrMedewerker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/hrmedewerker")
public class HrMedewerkerEndpoint {
    @Autowired
    HrMedewerkerService hrMedewerkerService;

    @GetMapping("/all")
    public Iterable<HrMedewerker> haalAlleHrMedewerkers() {
        return hrMedewerkerService.haalAlleHrMedewerkers();

    }
    @PostMapping("/nieuwe-hrmedewerker")
    public HrMedewerker nieuweHrMedewerker(@RequestBody HrMedewerker hrMedewerker) {
        return hrMedewerkerService.nieuweHrMedewerker(hrMedewerker);
    }
}



