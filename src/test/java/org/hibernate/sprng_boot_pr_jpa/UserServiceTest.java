package org.hibernate.sprng_boot_pr_jpa;

import org.hibernate.sprng_boot_pr_jpa.entity.Users;
import org.hibernate.sprng_boot_pr_jpa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testSaveUser() {
        // Arrange
        String userName = "User1";
        int balance = 100;

        // Act
        Users savedUser = userService.saveUser(userName, balance);
        var users = userService.getUserById(savedUser.getId());

        // Assert
        assertNotNull(savedUser);
        assertNotNull(savedUser.getId());
        assertEquals(userName, savedUser.getName());
        assertEquals(balance, savedUser.getBalanse());
    }
//
//    @Test
//    void testSaveUserObject() {
//        // Arrange
//        Users user = new Users("User2", 500);
//
//        // Act
//        Users savedUser = userService.saveUser(user);
//
//        // Assert
//        assertNotNull(savedUser);
//        assertNotNull(savedUser.getId());
//        assertEquals("User2", savedUser.getName());
//        assertEquals(500, savedUser.getBalanse());
//    }
//
//    @Test
//    void testGetUserById() {
//        // Arrange
//        Users savedUser = userService.saveUser("Alice", 750);
//
//        // Act
//        Optional<Users> foundUser = userService.getUserById(savedUser.getId());
//
//        // Assert
//        assertTrue(foundUser.isPresent());
//        assertEquals("Alice", foundUser.get().getName());
//        assertEquals(750, foundUser.get().getBalanse());
//    }
//
//    @Test
//    void testGetAllUsers() {
//        // Arrange
//        userService.saveUser("User11", 100);
//        userService.saveUser("User2", 200);
//        userService.saveUser("User3", 300);
//
//        // Act
//        List<Users> allUsers = userService.getAllUsers();
//
//        // Assert
//        assertNotNull(allUsers);
//        assertTrue(allUsers.size() >= 3);
//    }
//
//    @Test
//    void testExistsById() {
//        // Arrange
//        Users savedUser = userService.saveUser("Test User", 100);
//
//        // Act & Assert
//        assertTrue(userService.existsById(savedUser.getId()));
//        assertFalse(userService.existsById(99999));
//    }
//
//
//    @Test
//    void testDeleteUser() {
//        // Arrange
//        Users savedUser = userService.saveUser("User to Delete", 100);
//        int userId = savedUser.getId();
//
//        // Act
//        userService.deleteUser(userId);
//
//        // Assert
//        assertFalse(userService.existsById(userId));
//    }
} 
