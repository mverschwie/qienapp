package com.matthijsverschuure.testapp3.view;

import com.matthijsverschuure.testapp3.controller.TraineeService;
import com.matthijsverschuure.testapp3.model.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/trainee")
public class TraineeEndpoint {
    @Autowired
    TraineeService traineeService;

    @GetMapping("/all")
    public Iterable<Trainee> haalAlleTrainees() {
        return traineeService.haalAlleTrainees();
    }
    @PostMapping("/nieuwe-trainee")
    public Trainee nieuweTrainee(@RequestBody Trainee trainee) {
        return traineeService.nieuweTrainee(trainee);
    }

    @GetMapping("/{id}")
    public Trainee haalTraineeBijID(@PathVariable(value = "id") long id) {
        return traineeService.haalTraineeBijID(id);
    }

    @DeleteMapping("/{id}")
    public void verwijderTraineeBijID(@PathVariable(value = "id") long id) {
        traineeService.verwijderTraineeBijID(id);
    }
//    @PostMapping("/{leerdoelHardskillId}")
//    public void voegLdId(@PathVariable(value = "voegLdId") long leerdoelHardskillId) {
//        traineeService.voegLdId(leerdoelHardskillId);
//    }

//    @PostMapping("/{coachId}/{traineeId}")
//    public void koppelCoachAanTrainee(@PathVariable(value = "coachId") long coachId, @PathVariable(value = "traineeId") long traineeId) {
//        coachService.koppelCoachAanTrainee(coachId, traineeId);
//    }


}



