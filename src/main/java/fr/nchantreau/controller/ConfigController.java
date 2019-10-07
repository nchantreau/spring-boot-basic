package fr.nchantreau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.nchantreau.config.DefaultConfiguration;

@RestController
public class ConfigController {
    
    @Autowired
    DefaultConfiguration config;

    @RequestMapping("/showconfig")
    public String config() {
        return "Config: " + config.getConfig().getPerson().getLastname() + " " + config.getConfig().getPerson().getName() + " - " + config.getConfig().getPerson().getAddress().getStreet();
    }
}
