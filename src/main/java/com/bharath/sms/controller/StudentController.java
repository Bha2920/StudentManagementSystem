package com.bharath.sms.controller;

import com.bharath.sms.model.Student;
import com.bharath.sms.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {

    private StudentService studentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        int choice = 0;
        while (choice != 6) {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student ");
            System.out.println("4. Delete Student ");
            System.out.println("5. Search Student ");
            System.out.println("6. Exit ");

            System.out.print("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    List<Student> students = studentService.viewStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Student Id: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Student student = new Student(
                studentId,
                name,
                age,
                course,
                email
        );

        studentService.addStudent(student);
        System.out.println("Student added successfully!");
    }

    private void updateStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = studentService.viewStudents();
        boolean found = false;
                for (Student student : students) {
                    if (student.getStudentId() == id) {
                        System.out.print("Enter new Name: ");
                        String name = scanner.nextLine();
                        student.setName(name);

                        System.out.print("Enter new Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        student.setAge(age);

                        System.out.print("Enter new Course: ");
                        String course = scanner.nextLine();
                        student.setCourse(course);

                        System.out.print("Enter new Email: ");
                        String email = scanner.nextLine();
                        student.setEmail(email);

                        System.out.println("Student updated successfully!");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found");
                }


    }
    private  void deleteStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = studentService.viewStudents();

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId() == id) {

                students.remove(i);

                System.out.println("Student deleted successfully!");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }
    private void searchStudent() {

        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = studentService.viewStudents();

        boolean found = false;

        for (Student student : students) {
            if (student.getStudentId() == id) {
                System.out.println(student);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }
}
