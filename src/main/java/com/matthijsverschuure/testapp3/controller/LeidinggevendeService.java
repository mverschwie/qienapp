package com.matthijsverschuure.testapp3.controller;

import com.matthijsverschuure.testapp3.model.Leidinggevende;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeidinggevendeService {
    @Autowired
    LeidinggevendeRepository leidinggevendeRepository;

    public Iterable<Leidinggevende> haalAlleLeidinggevenden() {
        return leidinggevendeRepository.findAll();
    }
    public Leidinggevende nieuweLeidinggevende(Leidinggevende leidinggevende) {
        return leidinggevendeRepository.save(leidinggevende);
    }

}