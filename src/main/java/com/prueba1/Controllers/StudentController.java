package com.prueba1.Controllers;

import com.prueba1.Entities.Student;
import com.prueba1.Service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentController {
    private final IStudentService studentService;

    public StudentController(IStudentService productService) {
        this.studentService = productService;
    }

    @GetMapping("/student")
    public String index(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("students", this.studentService.getAllStudents());
        return "student";
    }

    @PostMapping("student/save")
    public String save(@ModelAttribute("student") Student student) {
        this.studentService.save(student);
        return "redirect:/student";
    }

    @PostMapping("student/delete")
    public ResponseEntity<String> delete(@RequestBody Student student) {
        this.studentService.delete(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}