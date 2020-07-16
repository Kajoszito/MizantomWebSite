package pl.edu.wszib.mizantom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPanelController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/mainPanel")
    public String mainPanel() {
        return "mainPanel";
    }

    @GetMapping("/reviews")
    public String reviews() {
        return "reviews";
    }

    @GetMapping("articles")
    public String articles() {
        return "articles";
    }
    
    @GetMapping("interviews")
    public String interviews() {
        return "interviews";
    }

    @GetMapping("events")
    public String events() {
        return "events";
    }
}
