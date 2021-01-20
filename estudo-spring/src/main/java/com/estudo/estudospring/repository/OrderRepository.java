package com.estudo.estudospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.estudospring.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
