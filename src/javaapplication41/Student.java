
package javaapplication41;

import java.util.List;


public class Student {
    private String name;
    private String surname;
    private String studentNum;
    List<String> subjects;

    public Student() {
    }

    public Student(String name, String surname, String studentNum, List<String> subjects) {
        this.name = name;
        this.surname = surname;
        this.studentNum = studentNum;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", studentNum=" + studentNum + ", subjects=" + subjects + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
