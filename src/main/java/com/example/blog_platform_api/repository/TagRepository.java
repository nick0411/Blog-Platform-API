package com.example.blog_platform_api.repository;

import com.example.blog_platform_api.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
    boolean existsByName(String name);
}
