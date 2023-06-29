package com.prueba1.Service;

import com.prueba1.Entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();

    void save(Student student);

    void delete(Student student);
}