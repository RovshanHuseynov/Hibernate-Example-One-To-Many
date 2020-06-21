package com.rh.spring.hibernateexampleonetomany.repository;

import com.rh.spring.hibernateexampleonetomany.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
