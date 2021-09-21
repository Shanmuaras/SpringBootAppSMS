package com.arasprojects.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arasprojects.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
