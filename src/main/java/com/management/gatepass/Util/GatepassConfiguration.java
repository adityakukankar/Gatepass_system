package com.management.gatepass.Util;

import com.management.gatepass.Services.AuthenticationService;
import com.management.gatepass.Services.GatepassService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatepassConfiguration {

    @Bean
    public GatepassService gatepassService(){
        return new GatepassService();
    }

    @Bean
    public AuthenticationService authenticationService(){
        return new AuthenticationService();
    }


}
