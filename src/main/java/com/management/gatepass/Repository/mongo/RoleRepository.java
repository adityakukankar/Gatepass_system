package com.management.gatepass.repository.mongo;

import com.management.gatepass.Entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    public Role findByRole(String role);
}
