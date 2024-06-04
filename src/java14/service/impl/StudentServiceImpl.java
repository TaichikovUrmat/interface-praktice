package java14.service.impl;

import java14.models.Student;
import java14.service.StudentService;

public class StudentServiceImpl implements StudentService {
   private final   Student[] students = new Student[100];
   private int studentCont = 0;

    @Override
    public  String addStudent(Student student) {
        students[studentCont++] = student;
        return "saved !! ";
    }
    @Override
    public void findByIdStudent(Long studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)){
                System.out.println(student);
                break;
            }
            System.out.println("Mundai student "+ studentId+ " jok !");
            break;
        }


    }
    @Override
    public void allStudent() {
        for (int i = 0; i < studentCont; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public void  deleteStudentID(Long studentId) {
        for (int i = 0; i < studentCont; i++) {
            if (students[i].getId().equals(studentId)){
                for (int j = 0; j < studentCont -1 ;j ++) {
                    students[j] = students[ j + 1];
                }
                studentCont --;
                System.out.println("delete !");
                break;
            }
            System.out.println("Mundai student "+ studentId+ " jok !");
            break;
        }
    }

    @Override
    public void updateStudent(Long id, Student newStudent) {
        for (int i = 0; i < studentCont; i++) {
            if (students[i].getId().equals(id)){
                students[i] = newStudent;
                break;
            }
            System.out.println("mundai ");
            break;
        }
    }


}
