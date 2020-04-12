package com.management.gatepass.Util;

import com.management.gatepass.Services.AuthenticationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatepassConfiguration {
    @Bean
    public AuthenticationService authenticationService(){
        return new AuthenticationService();
    }


}
