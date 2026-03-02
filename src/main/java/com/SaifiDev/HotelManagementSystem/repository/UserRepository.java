package com.SaifiDev.HotelManagementSystem.repository;

import com.SaifiDev.HotelManagementSystem.entity.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}

