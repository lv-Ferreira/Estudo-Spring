package com.estudo.estudospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.estudospring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
