package com.example.demo.controller;

import com.example.demo.Response;
import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDTO> getStudentById(@PathVariable long id) {
        return Response.createSuccess(studentService.getStudentById(id));
    }

    @PostMapping("/student")
    public Response<Long> addStudent(@RequestBody StudentDTO studentDTO) {
        return Response.createSuccess(studentService.addStudent(studentDTO));
    }
}