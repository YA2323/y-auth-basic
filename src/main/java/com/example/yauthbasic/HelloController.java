package com.example.yauthbasic;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("hello")
    String hallo(){


        String username = ((User) SecurityContextHolder
              .getContext()
             .getAuthentication()
           .getPrincipal())
           .getUsername();

        return "Hallo " + username;
    }
}
