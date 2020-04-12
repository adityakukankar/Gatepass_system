package com.management.gatepass.repository.mongo;

import com.management.gatepass.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AuthenticationDAO extends MongoRepository<User,String> {
}
