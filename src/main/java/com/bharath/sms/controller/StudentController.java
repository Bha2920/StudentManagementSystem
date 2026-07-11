package com.bharath.sms.controller;

import com.bharath.sms.model.Student;
import com.bharath.sms.service.StudentService;
import java.util.Scanner;

public class StudentController {

    private StudentService studentService = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public  void start() {

        int choice = 0;
        while (choice != 3){
        System.out.println("===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit ");

        System.out.print("Enter your choice:");
        choice = scanner.nextInt();
        scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    System.out.println(studentService.viewStudents());
                    break;
                case 3:
                    System.out.println("3. Exit ");
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

}
