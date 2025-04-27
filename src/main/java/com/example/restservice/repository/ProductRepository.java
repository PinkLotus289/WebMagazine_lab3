package com.example.restservice.repository;

import com.example.restservice.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.order.user.username = :username")
    List<Product> findProductsByUsername(@Param("username") String username);

}


