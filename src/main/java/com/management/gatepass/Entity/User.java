package com.management.gatepass.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Setter @Getter
@ToString
@Document(collection = "users")
public class User {
    @Id
    private String userId;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private boolean enabled;
    @DBRef
    private Set<Role> roles;
}
