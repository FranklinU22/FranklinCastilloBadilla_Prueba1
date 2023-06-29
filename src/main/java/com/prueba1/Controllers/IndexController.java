package com.prueba1.Controllers;


import com.prueba1.Service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    private final IStudentService studentService;

    public IndexController(IStudentService productService) {
        this.studentService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        var students = this.studentService.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }
}