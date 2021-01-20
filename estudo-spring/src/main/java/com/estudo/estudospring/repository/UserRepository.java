package com.estudo.estudospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.estudospring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
