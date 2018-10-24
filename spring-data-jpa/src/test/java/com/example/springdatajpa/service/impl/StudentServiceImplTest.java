package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;

    @Test
    public void save() {
        String[] names = {"aa", "bb", "cc", "dd", "ee"};
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setStuName(names[i]);
            student.setStuAge(random.nextInt(30));
            System.out.println(studentService.save(student));
        }
    }

    @Test
    public void getAll() {
        List<Student> students = studentService.getAll();
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void get() {
    }

    @Test
    public void delete() {
    }
}