
package com.prueba1.Service.impl;

import com.prueba1.DB.IStudentRepository;
import com.prueba1.Entities.Student;
import com.prueba1.Service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return (List<Student>) this.studentRepository.findAll();
    }

    public void save(Student student) {
        student.setActivo(true);
        this.studentRepository.save(student);
    }

    public void delete(Student student) {
        this.studentRepository.delete(student);
    }
}