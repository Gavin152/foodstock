package com.nxdev.foodstock.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DishController {

    private final DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/dish/list")
    public List<Dish> getDishList() {
        return dishService.getDishes();
    }

    @PostMapping("/dish")
    public void createNewDish(@RequestBody Dish dish) {
        dishService.createNewDish(dish);
    }
}
