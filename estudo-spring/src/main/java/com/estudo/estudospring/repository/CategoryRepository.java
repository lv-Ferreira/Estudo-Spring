package com.estudo.estudospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.estudospring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
