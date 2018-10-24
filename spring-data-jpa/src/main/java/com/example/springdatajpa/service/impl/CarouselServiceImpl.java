package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.CarouselRepository;
import com.example.springdatajpa.entity.Carousel;
import com.example.springdatajpa.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselRepository carouselRepository;

    @Override
    public List<Carousel> getAll() {
        return carouselRepository.findAll();
    }
}
