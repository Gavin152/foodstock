package com.nxdev.foodstock;

import com.nxdev.foodstock.dish.Dish;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FoodstockApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodstockApplication.class, args);
    }



}
