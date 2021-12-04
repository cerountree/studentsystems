package com.chadrountree.studentsystem.service;

import com.chadrountree.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
