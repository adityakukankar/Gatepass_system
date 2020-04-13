package com.management.gatepass.Controller;

import static org.springframework.http.ResponseEntity.ok;

import java.util.HashMap;
import java.util.Map;

import com.management.gatepass.Entity.AuthLoginBody;
import com.management.gatepass.Entity.User;
import com.management.gatepass.Services.LoginActivityService;
import com.management.gatepass.Services.UserService;
import com.management.gatepass.Util.JwtTokenProvider;
import com.management.gatepass.repository.mongo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/gatepass/auth")
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