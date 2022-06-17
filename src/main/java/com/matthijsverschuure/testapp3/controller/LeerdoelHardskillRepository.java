package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.LeerdoelHardskill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface LeerdoelHardskillRepository extends CrudRepository<LeerdoelHardskill, Long> {
}
