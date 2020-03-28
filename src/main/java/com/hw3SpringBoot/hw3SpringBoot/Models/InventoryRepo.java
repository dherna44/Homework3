package com.hw3SpringBoot.hw3SpringBoot.Models;

import org.springframework.data.repository.CrudRepository;

//Interface for InventoryRepo Class to connect to Database:
public interface InventoryRepo extends CrudRepository <Inventory, String>{


}
