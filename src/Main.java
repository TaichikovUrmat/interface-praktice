import java14.models.Student;
import java14.service.StudentService;
import java14.service.impl.StudentServiceImpl;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        Student student1 = new Student(1L,"urmat","taichikoiv", LocalDate.of(2004,3,5),"Male");
        Student student2 = new Student(2L,"nurlab","Avazbekov", LocalDate.of(2006,8,23),"Male");

        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.allStudent();
        studentService.findByIdStudent(1L);
//
        studentService.deleteStudentID(6L);
//        studentService.allStudent();
        studentService.updateStudent(6L,new Student(2L,"Asan","Avazbekov", LocalDate.of(2006,8,23),"Male"));

    }
}