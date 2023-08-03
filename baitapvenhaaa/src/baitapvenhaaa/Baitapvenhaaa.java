/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapvenhaaa;

import Student.Student;
import StudentManager.StudentManager;
import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Baitapvenhaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Point");
            System.out.println("3. Remove Student");
            System.out.println("4. Display Students by Classroom");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Age");
            System.out.println("7. Sort by Point");
            System.out.println("8. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                     System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter Point: ");
                        double point = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Classroom: ");
                        String classroom = scanner.nextLine();

                        Student newStudent = new Student(id, name, age, address, point, classroom);
                        studentManager.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Enter ID of the student to update point: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new Point: ");
                    double newPoint = scanner.nextDouble();
                    studentManager.updatePoint(updateId, newPoint);
        
                    break;
                case 3:
                    System.out.print("Enter ID of the student to delete: ");
                    int deleteId = scanner.nextInt();
                    studentManager.removeStudent(deleteId);
    
               
                    break;
                case 4:
                   studentManager.displayStudents();
                    break;
                case 5:
                    studentManager.sortByName();
                    break;
                case 6:
                    studentManager.sortByAge();
                    break;
                case 7:
                    studentManager.sortByPoint();
                    break;
                case 8:
                    studentManager.displayStudents();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
    }
    

