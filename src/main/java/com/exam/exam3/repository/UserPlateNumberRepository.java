package com.exam.exam3.repository;

import com.exam.exam2.Repository;
import com.exam.exam3.entity.UserPlateNumber;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserPlateNumberRepository extends JpaRepository<UserPlateNumber, Long> {

}
