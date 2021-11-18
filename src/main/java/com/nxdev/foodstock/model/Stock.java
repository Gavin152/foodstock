package com.nxdev.foodstock.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.nxdev.foodstock.typedef.FoodKind;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "stock")
public class Stock {
    public Stock(String name){
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Column
    private String name;

    @NotNull
    @Column
    private Integer stock;

    @Column
    private Enum<FoodKind> kind;

    @Column
    private Integer price;
}
