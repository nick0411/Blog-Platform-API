package com.example.blog_platform_api.repository;

import com.example.blog_platform_api.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
     List<Comment> findByPostId(Long postId);
     List<Comment> findByAuthorId(Long authorId);
}
