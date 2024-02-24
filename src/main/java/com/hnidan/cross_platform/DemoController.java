package com.hnidan.cross_platform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class DemoController {

    @GetMapping
    public String indexModel(Model model){
        model.addAttribute("pageTitle", "Hello Spring!");
        model.addAttribute("languages", List.of("Java", "Kotlin", "Groovy"));
        return "index";
    }
}
