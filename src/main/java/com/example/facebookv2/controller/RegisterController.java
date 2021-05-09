package com.example.facebookv2.controller;

import com.example.facebookv2.model.User;
import com.example.facebookv2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/register")
    public String getRegisterPage(){
        return "register";
    }

    @PostMapping("/register")
    public String signUp(User user, Model model){
        User userRegister = userService.getUserByEmail(user.getEmail());

        if(userRegister  != null){
            model.addAttribute("failed","User already exist");
            return "register";
        }
        userService.addUser(user);
        model.addAttribute("success","Registration successful");
        return "login";

    }
}
