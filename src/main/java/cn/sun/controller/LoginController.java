package cn.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/user")
    public String userLogin(){
        return "backendlogin";
    }
    @RequestMapping("/dev")
    public String devLogin(){
        return "devlogin";
    }
}
