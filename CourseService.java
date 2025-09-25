package edu.ccrm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseService {
    private List<String> courses = new ArrayList<>();

    public void addCourse(Scanner sc) {
        System.out.print("Enter Course Title: ");
        String title = sc.nextLine();
        courses.add(title);
        System.out.println("Course added: " + title);
    }

    public void listCourses() {
        System.out.println("\n--- Course List ---");
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (String c : courses) {
                System.out.println(c);
            }
        }
    }
}
