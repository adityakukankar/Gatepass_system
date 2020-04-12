package com.management.gatepass.Services;

import com.management.gatepass.Entity.User;
import com.management.gatepass.repository.mongo.AuthenticationDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationService {
    @Autowired
    private AuthenticationDAO authenticationDAO;

    public User addUser(User user) {

        authenticationDAO.save(user);
        return user;
    }
}
