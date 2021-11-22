package com.nxdev.foodstock.dish;

import javax.persistence.*;

@Entity
@Table(name = "Dish")
public class Dish {
    public Dish() {}

    public Dish(String name, DishCategory category, Float price, Integer stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public Dish(String name, DishCategory category, Float price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = 0;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private DishCategory category;

    @Column
    private Float price;

    @Column
    private Integer stock;

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

    public Integer getStock() {
        return stock;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(DishCategory category) {
        this.category = category;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
