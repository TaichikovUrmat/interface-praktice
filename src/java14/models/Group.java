package java14.models;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Long id;
    private  String groupName;
    private LocalDate date;
    private Student[] student;

    public Group(Long id, String groupName, LocalDate date, Student[] student) {
        this.id = id;
        this.groupName = groupName;
        this.date = date;
        this.student = student;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public LocalDate getDate() {
        return date;
    }

    public Student[] getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", date=" + date +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
