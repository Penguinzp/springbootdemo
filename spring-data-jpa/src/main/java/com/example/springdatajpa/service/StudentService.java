package com.example.springdatajpa.service;


import com.example.springdatajpa.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 新增学生
     * @param student
     * @return
     */
    Student save(Student student);

    /**
     * 获取所有学生对象
     * @return
     */
    List<Student> getAll();

    /**
     * 根据主键获取学生对象
     * @param id
     * @return
     */
    Student get(int id);

    /**
     * 根据主键删除一个学生对象
     * @param id
     */
    void delete(int id);

}
