package com.example.demo;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {

    private List<Student> studentsList = new ArrayList<>();

    public List<Student> getStudents() {
        return this.studentsList;
    }

    public Student addStudents(NewStudent newStudent) {
        Student createdStudent = new Student(studentsList.size()+1,newStudent.Name,newStudent.Number,newStudent.Number);
        studentsList.add(createdStudent);
        return createdStudent;
    }
}