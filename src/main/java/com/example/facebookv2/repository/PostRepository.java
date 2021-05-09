package com.example.facebookv2.repository;

import com.example.facebookv2.model.Comment;
import com.example.facebookv2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
