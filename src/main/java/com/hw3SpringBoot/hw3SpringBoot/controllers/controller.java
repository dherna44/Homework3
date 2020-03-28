package com.hw3SpringBoot.hw3SpringBoot.controllers;

import com.hw3SpringBoot.hw3SpringBoot.Models.Inventory;
import com.hw3SpringBoot.hw3SpringBoot.Models.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.Optional;

//Assigns this class as the Controller for the application:
@Controller
public class controller{

    //Autowired is added to this property to remove the need for setter and getter:
    @Autowired
    InventoryRepo inventoryRepo;


    //Functions to be able to view the inventory table when connecting to localhost:8088:
    @RequestMapping("/")
    public ModelAndView Home(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("inventorylist", inventoryRepo.findAll());
        return mv;
    }
    @RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView view (@PathVariable ("id") String id){
        ModelAndView mv = new ModelAndView("view");
        Optional<Inventory> inventoryItem = inventoryRepo.findById(id);
        Inventory inventoryToMap = inventoryItem.get();
        mv.addObject("ItemSelected", inventoryToMap);
        return mv;
    }
}
