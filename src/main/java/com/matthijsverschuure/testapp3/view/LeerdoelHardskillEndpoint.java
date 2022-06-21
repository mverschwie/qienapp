//package com.matthijsverschuure.testapp3.view;
//
//import com.matthijsverschuure.testapp3.controller.LeerdoelHardskillService;
//import com.matthijsverschuure.testapp3.model.LeerdoelHardskill;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping ("/leerdoel-hardskill")
//public class LeerdoelHardskillEndpoint {
//    @Autowired
//    LeerdoelHardskillService leerdoelHardskillService;
//
//    @GetMapping("/all")
//    public Iterable<LeerdoelHardskill> haalAlleLeerdoelenHardskill() {
//        return leerdoelHardskillService.haalAlleLeerdoelenHardskill();
//
//    }
//
//    @PostMapping("/nieuw-leerdoel-hardskill")
//    public LeerdoelHardskill nieuwLeerdoelHardskill(@RequestBody LeerdoelHardskill leerdoelHardskill) {
//        return leerdoelHardskillService.nieuwLeerdoelHardskill(leerdoelHardskill);
//    }
//
////    @PutMapping("/{certificaatId}/{leerdoelHardskillId}")
////    public void koppelCertificaat(@PathVariable(value = "certificaatId") long certificaatId, @PathVariable(value = "leerdoelHardskillId") long leerdoelHardskillId) {
////        leerdoelHardskillService.koppelCertificaat(certificaatId, leerdoelHardskillId);
////    }
//
//}
//
//
//
