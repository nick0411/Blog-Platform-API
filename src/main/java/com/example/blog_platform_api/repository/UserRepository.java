package com.example.blog_platform_api.repository;

import com.example.blog_platform_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername (String username);
    boolean existsByUsername(String username);
}
