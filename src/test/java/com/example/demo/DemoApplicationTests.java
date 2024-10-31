package com.example.demo;

import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void test() {
        Student student = new Student();
        // Have included lombok @Data annotation in Student class
        student.setName("John");

        // Have included lombok @Builder annotation in Student class
        Student newStudent = Student.builder().age(20).name("John").email("abc@a.com").build();

    }

}
