package com.example.demo.service;

import com.example.demo.converter.StudentConverter;
import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Long addStudent(StudentDTO studentDTO) {
        List<Student> studentList = studentRepository.findByEmail(studentDTO.getEmail());
        if (!CollectionUtils.isEmpty(studentList)) {
            throw new IllegalStateException("Email already exists");
        }
        Student student = studentRepository.save(StudentConverter.convertStudentDTOToStudent(studentDTO));
        return student.getId();
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentDTO getStudentById(Long id) {
        Student student =  studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return StudentConverter.convertStudentToStudentDTO(student);
    }
}
