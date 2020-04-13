package com.management.gatepass.repository.mongo;


import com.management.gatepass.Entity.GatepassDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GatepassDetailsRepository extends MongoRepository<GatepassDetails, String> {
    @Override
    public void delete(GatepassDetails gatepassDetails);
}
