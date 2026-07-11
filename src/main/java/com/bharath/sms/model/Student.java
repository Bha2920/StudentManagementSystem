

package com.bharath.sms.model;



public class Student {
    private int studentId;
    private String name;
    private int age;
    private String course;
    private String email;


    public Student(int studentId, String name, int age, String course, String email) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
