package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.StudentRepository;
import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 1.用@Service注解标注本类对象为Service层的bean
 * 2.用@Resource注解注入DAO层的bean，studentRepository
 * 3.使用studentRepository，用OOP的方式实现CRUD
 * 4.使用@Transactional注解，来把增、删、改进行事务绑定
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(int id) {
        return studentRepository.findById(id).get();
    }


}
