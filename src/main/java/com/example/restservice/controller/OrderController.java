package com.example.restservice.controller;

import com.example.restservice.dto.OrderDto;
import com.example.restservice.model.Order;
import com.example.restservice.service.OrderService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderDto> getAllOrders() {
        return orderService.getAllOrders().stream()
                .map(order -> new OrderDto(
                        order.getId(),
                        order.getOrderDate(),
                        order.getUser() != null ? order.getUser().getUsername() : null,
                        order.getProducts().stream()
                                .map(product -> product.getName())
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id)
                .map(order -> ResponseEntity.ok(new OrderDto(
                        order.getId(),
                        order.getOrderDate(),
                        order.getUser() != null ? order.getUser().getUsername() : null,
                        order.getProducts().stream()
                                .map(product -> product.getName())
                                .collect(Collectors.toList())
                )))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id,
                                             @RequestBody Order orderDetails) {
        return orderService.updateOrder(id, orderDetails)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        if (orderService.deleteOrder(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
