package com.management.gatepass.Controller;

import com.management.gatepass.Entity.GatepassEntity;
import com.management.gatepass.Entity.User;
import com.management.gatepass.Services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/iocl/gatepass/authenticate")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value ="/{id}/", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public String registerMember(@RequestBody User newUser){
        //check if this user is already present or not.
        return authenticationService.registerMember(newUser);
    }

    //TODO apis not completed
    @PostMapping(value = "", produces = "application/json", consumes = "application/json")
    @RequestMapping
    public void authenticateLogin(){
    }

    @PostMapping(value = "", produces = "application/json", consumes = "application/json")
    @RequestMapping
    public void fetchUser(@RequestBody GatepassEntity gatepassEntity){
    }
}
