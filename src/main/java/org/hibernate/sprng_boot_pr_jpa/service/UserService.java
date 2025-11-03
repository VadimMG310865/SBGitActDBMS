package org.hibernate.sprng_boot_pr_jpa.service;

import org.hibernate.sprng_boot_pr_jpa.Repo.UserRepo;
import org.hibernate.sprng_boot_pr_jpa.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users saveUser(Users user) {
        return userRepo.save(user);
    }

    public Users saveUser(String name, int balance) {
        Users user = new Users(name, balance);
        return userRepo.save(user);
    }

    public List<Users> getAllUsers() {
        return (List<Users>) userRepo.findAll();
    }

    public Optional<Users> getUserById(int id) {
        return userRepo.findById(id);
    }

    public boolean existsById(int id) {
        return userRepo.existsById(id);
    }

    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }

    //public long countUsers() {
    //    return userRepo.count();
    //}
} 
