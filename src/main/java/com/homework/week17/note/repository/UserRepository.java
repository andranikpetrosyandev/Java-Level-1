package com.homework.week17.note.repository;

import com.note.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUsername(String username);
}
