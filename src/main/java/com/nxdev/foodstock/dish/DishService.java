package com.nxdev.foodstock.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    private DishRepository dishRepo;



    @Autowired
    public DishService(DishRepository dishRepo) {
        this.dishRepo = dishRepo;
    }

    public List<Dish> getDishes() {
        return dishRepo.findAll();
    }

    public void createNewDish(Dish dish) {
        dishRepo.save(dish);
    }

}
