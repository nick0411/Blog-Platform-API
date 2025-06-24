package com.example.blog_platform_api.repository;

import com.example.blog_platform_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String username);
    boolean existsByUsername(String username);
}
