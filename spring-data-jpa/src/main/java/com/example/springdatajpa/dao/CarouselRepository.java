package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarouselRepository extends JpaRepository<Carousel, Integer> {
}
