package com.nxdev.foodstock.sale;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
@Table
public class Sale {
    public Sale() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer dish;

    @Column
    private Integer quantity;

    @Column
    private Date date;

    @Column
    private String paymentMethod;
}
