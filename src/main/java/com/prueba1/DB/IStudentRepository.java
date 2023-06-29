/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba1.DB;
import com.prueba1.Entities.Student;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author LABORATORIO 04
 */
public interface IStudentRepository extends CrudRepository<Student, Integer>{
}
