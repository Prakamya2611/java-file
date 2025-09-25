package edu.ccrm.cli;

import edu.ccrm.service.StudentService;
import edu.ccrm.service.CourseService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();

        while (true) {
            System.out.println("\n===== Campus Course & Records Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Course");
            System.out.println("4. List Courses");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> studentService.addStudent(sc);
                case 2 -> studentService.listStudents();
                case 3 -> courseService.addCourse(sc);
                case 4 -> courseService.listCourses();
                case 0 -> { 
                    System.out.println("Goodbye!"); 
                    System.exit(0); 
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
