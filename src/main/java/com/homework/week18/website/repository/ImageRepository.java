package com.homework.week18.website.repository;

import com.exam.exam2.Repository;
import com.homework.week18.website.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> getByPostId(Long postId);
}
