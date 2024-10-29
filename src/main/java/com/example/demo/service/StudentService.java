package com.example.demo.service;

import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDTO;

public interface StudentService {

    StudentDTO getStudentById(Long id);

    Long addStudent(StudentDTO studentDTO);

}
