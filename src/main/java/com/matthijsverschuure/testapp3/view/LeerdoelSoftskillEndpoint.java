//package com.matthijsverschuure.testapp3.view;
//
//import com.matthijsverschuure.testapp3.controller.LeerdoelSoftskillService;
//import com.matthijsverschuure.testapp3.model.LeerdoelSoftskill;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping ("/leerdoel-softskill")
//public class LeerdoelSoftskillEndpoint {
//    @Autowired
//    LeerdoelSoftskillService leerdoelSoftskillService;
//
//    @GetMapping("/all")
//    public Iterable<LeerdoelSoftskill> haalAlleLeerdoelenSoftskill() {
//        return leerdoelSoftskillService.haalAlleLeerdoelenSoftskill();
//
//    }
//
//    @PostMapping("/nieuw-leerdoel-softskill")
//    public LeerdoelSoftskill nieuwLeerdoelSoftskill(@RequestBody LeerdoelSoftskill leerdoelSoftskill) {
//        return leerdoelSoftskillService.nieuwLeerdoelSoftskill(leerdoelSoftskill);
//    }
//}
//
//
//
