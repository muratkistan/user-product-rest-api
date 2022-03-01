package com.muratkistan.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private String category;
    private int price;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name="user_id",
            referencedColumnName = "userId"
    )
    private User user;


}
