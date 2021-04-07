package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Kevin on 4/6/21
 */

@Repository  // this class is responsible for data access
public interface StudentRepository
        extends JpaRepository<Student, Long> {  // Student: is the object type that we are working on. Long: is the id type

    // SELECT * FROM student WHERE email = ?
    @Query("SELECT s FROM Student s WHERE s.email = ?1") // Student is the class we have
    Optional<Student> findStudentByEmail(String email);

}
