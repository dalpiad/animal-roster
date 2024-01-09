package org.launchcode.animalroster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("hello") //localhost:8080/hello
    @ResponseBody
    public String hello () {
        return "<h1>Hello, Doyle!</h1>";
    }


    @GetMapping("halloQuary")
    @ResponseBody
    public String helloQuary(@RequestParam String name) {
        if (name.isBlank()) {
            name = "World";
        }
        return String.format("<h1>Hello, %s!", name);
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloPath(@PathVariable String name) {
        if (name.isBlank()) {
            name = "World";
        }
        return String.format("<h1>Hello, %s!", name);
    }
}
