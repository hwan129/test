package org.example;

public class Student extends Main {
    public String name;
    public String studentNum;

    public String toString() {
        return "Student : " + name + " "  + studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        studentNum = studentNum;
    }
}
