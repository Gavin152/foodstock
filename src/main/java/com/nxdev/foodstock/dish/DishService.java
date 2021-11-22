package com.nxdev.foodstock.dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Dish> getOneDish(Integer id) {
        return dishRepo.findById(id);
    }

    public Dish getDishByName(String name) {
        return dishRepo.findByName(name);
    }

    public List<Dish> getByCategory(DishCategory category) {
        return dishRepo.findByCategory(category);
    }

    public void createNewDish(Dish dish) {
        dishRepo.save(dish);
    }

}
