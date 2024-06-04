package java14.models;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String firsName;
    private String lastName;
    private LocalDate age;
    private String gender;

    public Student(Long id, String firsName, String lastName, LocalDate age, String gender) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

}
