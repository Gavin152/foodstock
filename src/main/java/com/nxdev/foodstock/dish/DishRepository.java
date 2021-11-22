package com.nxdev.foodstock.dish;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishRepository extends JpaRepository<Dish, Integer> {
    public Dish findByName(String name);
    public List<Dish> findByCategory(DishCategory category);
}
