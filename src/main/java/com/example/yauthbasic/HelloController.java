package com.example.yauthbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 //String username = ((User) SecurityContextHolder
  //       .getContext()
    //     .getAuthentication()
      //   .getPrincipal())
      //   .getUsername();


@RestController
@RequestMapping("api")
public class HelloController {

    @GetMapping("hello")
    String hallo(){

        return "hallo";
    }
}
