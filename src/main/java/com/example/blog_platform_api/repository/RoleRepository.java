package com.example.blog_platform_api.repository;

import com.example.blog_platform_api.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(Role.ERole role);
    boolean existsByRole(Role.ERole role);
}
