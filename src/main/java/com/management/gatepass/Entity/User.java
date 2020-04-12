package com.management.gatepass.Entity;

import lombok.*;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@Setter @Getter
@ToString
public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String passString;
    private LocalDate loginDate;
}
