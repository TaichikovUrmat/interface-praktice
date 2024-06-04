package java14.service;

import java14.models.Student;

public interface StudentService {

     String addStudent(Student student);
     void findByIdStudent(Long studentId);
     void allStudent();
     void deleteStudentID(Long studentId);
     void updateStudent(Long id,Student newStudent);
}


