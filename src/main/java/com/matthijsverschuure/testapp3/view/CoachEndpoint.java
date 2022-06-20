package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.CoachService;
import com.matthijsverschuure.testapp3.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/coach")
public class CoachEndpoint {
    @Autowired
    CoachService coachService;

    @GetMapping("/all")
    public Iterable<Coach> haalAlleCoaches() {
        return coachService.haalAlleCoaches();

    }
    @PostMapping("/nieuwe-coach")
    public Coach nieuweCoach(@RequestBody Coach coach) {
        return coachService.nieuweCoach(coach);
    }
    @GetMapping("/{id}")
    public Coach haalCoachBijId(@PathVariable(value = "id") long id) {
        return coachService.haalCoachBijId(id);
    }

    @PostMapping("/{coachId}/{traineeId}")
    public void koppelCoachAanTrainee(@PathVariable(value = "coachId") long coachId, @PathVariable(value = "traineeId") long traineeId) {
        coachService.koppelCoachAanTrainee(coachId, traineeId);
    }


}



