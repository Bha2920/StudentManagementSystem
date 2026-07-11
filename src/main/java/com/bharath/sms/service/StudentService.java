package com.bharath.sms.service;

import com.bharath.sms.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> viewStudents() {
        return students;
    }
}

