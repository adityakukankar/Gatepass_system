package com.management.gatepass.Services;

import com.management.gatepass.Entity.Role;
import com.management.gatepass.Entity.User;
import com.management.gatepass.repository.mongo.RoleRepository;
import com.management.gatepass.repository.mongo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        Role userRole = roleRepository.findByRole(user.getRoles().getRole());
        user.setRoles(userRole);
        userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        return userRepository.findById(id).orElseGet(null);
    }

    public void updateUser(User currentUser, User user) {
        //TODO
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }
}
