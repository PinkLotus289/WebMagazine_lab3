package com.example.restservice.dto;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDto {

    private Long id;
    private LocalDateTime orderDate;
    private String username;
    private List<String> productNames;

    public OrderDto() {
    }

    public OrderDto(Long id, LocalDateTime orderDate, String username, List<String> productNames) {
        this.id = id;
        this.orderDate = orderDate;
        this.username = username;
        this.productNames = productNames;
    }

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }
}
