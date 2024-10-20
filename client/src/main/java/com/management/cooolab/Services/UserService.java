package com.management.cooolab.Services;

import com.management.cooolab.Entities.Departement;
import com.management.cooolab.Entities.User;
import com.management.cooolab.Repositories.DemandeCongeRepository;
import com.management.cooolab.Repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DemandeCongeRepository demandeCongeRepository;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(int id){
        return userRepository.findById(id).get();
    }
    public List<User> getUsersByDepartment(int departmentId) {
        return userRepository.findByDepartementId(departmentId);
    }
    public User getUsersByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public User getUsersByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);
    }
    public void saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    @Transactional
    public void deleteUser(int id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            demandeCongeRepository.deleteAllByEmployeeId(user.getId());
            userRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("User not found with id " + id);
        }
        }
    @Transactional
    public void deleteUsersByDepartment(Departement department) {
        for (User user : department.getUsers()) {
            deleteUser(user.getId());
        }

    }
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    public User getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            String email = ((UserDetails) principal).getUsername();
            return userRepository.findByEmail(email);
        }
        return null;
    }

    }

