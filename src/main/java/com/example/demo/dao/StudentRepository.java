package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>,
        JpaSpecificationExecutor<Student> {

    // no need to implement this method, spring data jpa will do it since we extend JpaRepository
    List<Student> findByEmail(String email);

    List<Student> findByAgeBetween(int a, int b);

    // Query uses the object name in Java, not the table name in the database
    @Query("SELECT s FROM Student s WHERE s.email = :email")
    // :email => @Param("email")
    List<Student> findByEmail2(@Param("email") String email);

    // Use @Query("SELECT * FROM student WHERE email = :email, nativeQuery = true)") to do native query

    // Use @Query("SELECT new Student(name, age) FROM student WHERE email = :email") to do partial JPQL query
    // Need to create a constructor in Student class to accept name and age
}

