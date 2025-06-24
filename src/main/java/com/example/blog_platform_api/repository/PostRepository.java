package com.example.blog_platform_api.repository;

import com.example.blog_platform_api.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByTitle(String title);
    boolean existsByTitle(String title);
    List<Post> findByAuthorId(Long authorId);
}
