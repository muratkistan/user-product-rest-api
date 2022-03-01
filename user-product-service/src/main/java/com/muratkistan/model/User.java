package com.muratkistan.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

//      @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(name="product_id",referencedColumnName = "productId")
//    private List<Product> products;
}
