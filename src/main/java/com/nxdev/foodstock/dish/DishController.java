package com.nxdev.foodstock.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/dish")
    public Optional<Dish> getOneDish(@RequestParam Integer id) {
        return dishService.getOneDish(id);
    }

    @GetMapping("/dish/name")
    public Dish getByName(@RequestParam String name) {
        return dishService.getDishByName(name);
    }

    @GetMapping("/dish/category")
    public List<Dish> getDishesByCategory(@RequestParam DishCategory category) {
        return dishService.getByCategory(category);
    }

    @PostMapping("/dish")
    public void createNewDish(@RequestBody Dish dish) {
        dishService.createNewDish(dish);
    }
}
