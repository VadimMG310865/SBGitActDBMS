package org.hibernate.sprng_boot_pr_jpa;

import org.hibernate.sprng_boot_pr_jpa.Repo.UserRepo;
import org.hibernate.sprng_boot_pr_jpa.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
class UserRepositoryTest {

//    @Autowired
//    private UserRepo userRepo;
//
//    @Test
//    void testSaveUser() {
//        // Arrange
//        Users user = new Users("User1", 1000);
//
//        // Act
//        Users savedUser = userRepo.save(user);
//
//        // Assert
//        assertNotNull(savedUser);
//        assertNotNull(savedUser.getId());
//        assertEquals("User1", savedUser.getName());
//        assertEquals(1000, savedUser.getBalanse());
//    }
//
//    @Test
//    void testFindById() {
//        // Arrange
//        Users user = new Users("User1", 500);
//        Users savedUser = userRepo.save(user);
//
//        // Act
//        Optional<Users> foundUser = userRepo.findById(savedUser.getId());
//
//        // Assert
//        assertTrue(foundUser.isPresent());
//        assertEquals("User1", foundUser.get().getName());
//        assertEquals(500, foundUser.get().getBalanse());
//    }
//
//    @Test
//    void testFindByIdNotFound() {
//        // Act
//        Optional<Users> foundUser = userRepo.findById(99999);
//
//        // Assert
//        assertFalse(foundUser.isPresent());
//    }
//
//    @Test
//    void testFindAll() {
//        // Arrange
//        userRepo.save(new Users("User1", 100));
//        userRepo.save(new Users("User2", 200));
//        userRepo.save(new Users("User3", 300));
//
//        // Act
//        Iterable<Users> allUsers = userRepo.findAll();
//
//        // Assert
//        assertNotNull(allUsers);
//        int count = 0;
//        for (Users user : allUsers) {
//            count++;
//        }
//        assertTrue(count >= 3);
//    }
//
//    @Test
//    void testExistsById() {
//        // Arrange
//        Users savedUser = userRepo.save(new Users("Test User", 100));
//
//        // Act & Assert
//        assertTrue(userRepo.existsById(savedUser.getId()));
//        assertFalse(userRepo.existsById(99999));
//    }
//
//
//    @Test
//    void testUpdateUser() {
//        // Arrange
//        Users user = new Users("Original Name", 100);
//        Users savedUser = userRepo.save(user);
//
//        // Act
//        savedUser.setName("Updated Name");
//        savedUser.setBalanse(200);
//        Users updatedUser = userRepo.save(savedUser);
//
//        // Assert
//        assertEquals("Updated Name", updatedUser.getName());
//        assertEquals(200, updatedUser.getBalanse());
//    }
} 
