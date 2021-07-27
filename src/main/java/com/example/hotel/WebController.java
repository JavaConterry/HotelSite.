package com.example.hotel;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class WebController {


    @GetMapping("/home")
    public String loadStartPage(Model model){
        return "home";
    }

    @GetMapping("/reserve")
    public String loadReservePage(Model model){
        return "reserve";
    }

    @PostMapping("reserve")
    public String getRegistration(
            @RequestParam String fullName,
            @RequestParam String email,
            @RequestParam("fromDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fromDate,
            @RequestParam("toDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date toDate,
            Model model){

        Visitor visitor = new Visitor(fullName, email, fromDate, toDate);
        DataBasePusher pusher = new DataBasePusher();
        pusher.pushVisitor(visitor);
        return "redirect:/home";
    }
}
