package com.exam.exam3.repository;

import com.exam.exam2.Repository;
import com.exam.exam3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByPassportNumber(String passportnumber);
}
