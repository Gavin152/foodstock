package com.nxdev.foodstock;

import com.nxdev.foodstock.model.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FoodstockApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodstockApplication.class, args);
    }

    @GetMapping("/eat")
    public String eatShit(@RequestParam(value = "dishName") String dish) {
        Stock stk = new Stock(dish);
        return String.format("I had %s for lunch", dish);
    }

}
