package com.hw3SpringBoot.hw3SpringBoot.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Property Fields for Inventory Table:
@Entity
@Table (name = "inventory")
public class Inventory{

    @Id
    @Column(name= "id")
    public String id;
    @Column(name= "description")
    public String description;
    @Column(name= "price")
    public int price;
    @Column(name= "color")
    public String color;

    public Inventory(){

    }

    //Constructor for Inventory:
    public Inventory (String id, String description, int price, String color){
        this.id = id;
        this.description = description;
        this.price = price;
        this.color = color;
    }

    //Setter and Getter for ID:
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    //Setter and Getter for Description:
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Setter and Getter for Price:
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    //Setter and Getter for Color:
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}