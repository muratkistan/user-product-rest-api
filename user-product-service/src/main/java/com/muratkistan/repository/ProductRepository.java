package com.muratkistan.repository;

import com.muratkistan.model.Product;
import com.muratkistan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByUser(User user);
    Product findByProductCode(String productCode);
}
