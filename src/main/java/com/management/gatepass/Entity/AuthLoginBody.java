package com.management.gatepass.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter @Getter
@NoArgsConstructor
public class AuthLoginBody {
    private String email;
    private String password;
}