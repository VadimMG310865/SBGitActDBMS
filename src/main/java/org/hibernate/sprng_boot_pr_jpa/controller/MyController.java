package org.hibernate.sprng_boot_pr_jpa.controller;


import org.hibernate.sprng_boot_pr_jpa.Repo.OrderRepo;
import org.hibernate.sprng_boot_pr_jpa.Repo.UserRepo;
import org.hibernate.sprng_boot_pr_jpa.entity.Orders;
import org.hibernate.sprng_boot_pr_jpa.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class MyController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private OrderRepo orderRepo;

    @GetMapping("/")
    public String mainpage(Model model) {
        model.addAttribute("title", "Главная страница");
        return "user/home";
    }


    @GetMapping("/users")
    public String spusers(Model model) {
        Iterable<Users> users = userRepo.findAll();
        model.addAttribute("users", users);
        return "user/users";
    }

    @GetMapping("/orders")
    public String sorders(Model model) {
        Iterable<Orders> orders = orderRepo.findAll();
        model.addAttribute("orders", orders);
        return "user/orders";
    }

    @GetMapping("/orderadd")
    public String orderadd(Model model) {
        return "user/orderadd";
    }

    @GetMapping("/useradd")
    public String useradd(Model model) {
        return "user/useradd";
    }

    @PostMapping("/newuseradd")
    public String newuseradd(@RequestParam String name, @RequestParam int balanse,  Model model) {
        Users user = new Users(name, balanse);
        userRepo.save(user);
        return "user/useradd";
        //return "redirect:/user/users";
    }

    @PostMapping("/neworderadd")
    @Transactional
    //public String neworderadd(@RequestParam int ordsum, @RequestParam Users iduser, @RequestParam String ordnum, Model model) {
    public String neworderadd(@RequestParam int ordsum, @RequestParam int iduser, @RequestParam String ordnum, Model model) {
        Orders order = new Orders(ordsum, iduser, ordnum);
        Optional<Users> optionalUser = userRepo.findById(iduser);

        Users ruser = optionalUser.get();
        Integer balance = ruser.getBalanse();
        ruser.setBalanse(balance - ordsum);

        orderRepo.save(order);
        //method();
        userRepo.save(ruser);


        return "user/orderadd";
    }

    private void method () {
        throw new RuntimeException();
    }
}
