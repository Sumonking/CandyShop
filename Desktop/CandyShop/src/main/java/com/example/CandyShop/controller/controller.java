package com.example.CandyShop.controller;
import com.example.CandyShop.Repository.LollipopRepository;
import com.example.CandyShop.model.Lollipop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    LollipopRepository lollipopRepository;

    @RequestMapping("/")
    public String getHello(){
            return "Hello World";


    }

    @RequestMapping("/Mind")
    public String getMind(){
        return "My name is Mind" ;
    }

    @RequestMapping("/data")
    public List<Lollipop> getAllData(){
        return lollipopRepository.findAll();


    }

}

