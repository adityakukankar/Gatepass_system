package com.management.gatepass.Services;

import com.management.gatepass.Entity.GatepassDetails;
import com.management.gatepass.repository.mongo.GatepassDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GatepassService {

    @Autowired
    GatepassDetailsRepository gatepassDetailsRepository;

    public Iterable<GatepassDetails> listAllDetails() {
        return gatepassDetailsRepository.findAll();
    }

    public Optional<GatepassDetails> findDetailsById(String id) {
        return gatepassDetailsRepository.findById(id);
    }
}
