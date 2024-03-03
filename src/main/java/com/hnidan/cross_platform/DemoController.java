package com.hnidan.cross_platform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
@RequestMapping("/")
public class DemoController {

    @GetMapping
    public String indexModel(Model model) {
        // Variables
        String greeting = "Welcome to Spring Boot!";
        model.addAttribute("greeting", greeting);

        // Maps
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("France", "Paris");
        model.addAttribute("capitals", capitals);

        // Arrays and Lists
        model.addAttribute("programmingLanguages", new String[]{"Java", "Kotlin", "Groovy"});
        model.addAttribute("languages", List.of("English", "Ukrainian"));

        // Selected Objects
        User selectedUser = new User("John Doe", "johndoe@example.com");
        model.addAttribute("selectedUser", selectedUser);

        return "index";
    }
}