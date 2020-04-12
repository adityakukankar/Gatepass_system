package com.management.gatepass.Entity;

import lombok.*;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@Setter @Getter
@ToString
@AllArgsConstructor
public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String passString;
}
