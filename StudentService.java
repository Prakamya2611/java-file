package edu.ccrm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private List<String> students = new ArrayList<>();

    public void addStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        students.add(name);
        System.out.println("Student added: " + name);
    }

    public void listStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (String s : students) {
                System.out.println(s);
            }
        }
    }
}
