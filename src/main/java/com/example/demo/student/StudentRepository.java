package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //Select s FROM student as s WHERE s.email = "2610dylan@gmail.com"
    Optional<Student> findStudentByEmail(String email);
}
