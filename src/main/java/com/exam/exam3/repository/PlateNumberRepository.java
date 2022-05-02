package com.exam.exam3.repository;

import com.exam.exam3.entity.PlateNumber;
import com.exam.exam3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlateNumberRepository extends JpaRepository<PlateNumber, Long> {

    PlateNumber findBySeriesAndNumber(String series,int number);
}
