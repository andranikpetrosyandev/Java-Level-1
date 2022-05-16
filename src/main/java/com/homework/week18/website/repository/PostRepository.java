package com.homework.week18.website.repository;

import com.exam.exam2.Repository;
import com.homework.week18.website.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByUserId(Long userId);
}
