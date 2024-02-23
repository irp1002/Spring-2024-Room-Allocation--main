package edu.sru.group7.roomallocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    //@GetMapping("/") Commented out to not map to the login code, authenticator doesn't work
    public String showLoginPage() {
        return "login";
    }
}