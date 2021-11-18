package com.nxdev.foodstock.dish;

import javax.persistence.*;

@Entity
@Table(name = "dish")
public class Dish {
    public Dish() {}

    public Dish(Integer id, String name, Enum<DishCategory> category, Float price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Dish(String name, Enum<DishCategory> category, Float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Dish(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Enum<DishCategory> category;

    @Column
    private Float price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Enum<DishCategory> getCategory() {
        return category;
    }

    public Float getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Enum<DishCategory> category) {
        this.category = category;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
