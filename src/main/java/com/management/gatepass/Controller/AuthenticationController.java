package com.management.gatepass.Controller;

import com.management.gatepass.Entity.User;
import com.management.gatepass.Services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gatepass/v1")
public class AuthenticationController {
    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User user1=authenticationService.addUser(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
}