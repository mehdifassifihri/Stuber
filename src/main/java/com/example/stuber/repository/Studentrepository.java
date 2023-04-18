package com.example.stuber.repository;

import com.example.stuber.models.Parent;
import com.example.stuber.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Studentrepository extends JpaRepository<Student,Long> {

    @Query("SELECT s FROM Student s WHERE s.parent.id = :id")
    List<Student> findStudentByParentId(@Param("id") Long id);
}
