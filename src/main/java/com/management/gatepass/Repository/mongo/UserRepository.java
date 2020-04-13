package com.management.gatepass.repository.mongo;

import java.util.List;

import com.management.gatepass.Entity.GatepassDetails;
import com.management.gatepass.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    @Override
    public void delete(User user);
    public User findByEmail(String email);
    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);
}