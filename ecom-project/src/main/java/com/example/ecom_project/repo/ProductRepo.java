package com.example.ecom_project.repo;


import com.example.ecom_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    //jpql
    @Query("SELECT p from Product p WHERE " +
            "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                    "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                    "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
                    "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
               // its like Select * from product where product_name LIKE "%abhb%"
    List<Product> searchProducts(String keyword);

}
