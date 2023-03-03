package ru.jakotlin.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jakotlin.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
