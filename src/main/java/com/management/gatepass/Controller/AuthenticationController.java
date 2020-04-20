package com.management.gatepass.Controller;

import com.management.gatepass.Entity.User;
import com.management.gatepass.HttpBody.AuthLoginBody;
import com.management.gatepass.Services.LoginActivityService;
import com.management.gatepass.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/auth/v1")
public class AuthenticationController {

    @Autowired
    LoginActivityService loginActivityService;

    @Autowired
    private UserService userService;

    @SuppressWarnings("rawtypes")
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthLoginBody data) {
        try {
            Map<Object, Object> authDetails = loginActivityService.getAuthDetails(data);
            return new ResponseEntity<>(authDetails, HttpStatus.OK);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid email/password supplied");
        }
    }

    @SuppressWarnings("rawtypes")
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
            throw new BadCredentialsException("User with username: " + user.getEmail() + " already exists");
        }
        userService.saveUser(user);
        String status = "User registered successfully";
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}