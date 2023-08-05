/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static mand.StudentManagementSystem.nextId;
import static mand.StudentManagementSystem.students;
import model.Student;

/**
 *
 * @author Legion 5
 */
public class sevice {
    public static void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void addStudent(Scanner scanner) {
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi học sinh: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập địa chỉ học sinh: ");
        String address = scanner.nextLine();

        System.out.print("Nhập điểm học sinh: ");
        double point = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhập lớp học: ");
        String classroom = scanner.nextLine();

        Student student = new Student(nextId++, name, age, address, point, classroom);
        students.add(student);

        System.out.println("Thêm học sinh thành công.");
    }
    public static void updateStudentPoint(Scanner scanner) {
        System.out.print("Nhập ID học sinh để cập nhập điểm: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            System.out.print("Nhập điểm mới: ");
            double newPoint = scanner.nextDouble();
            student.setPoint(newPoint);

            System.out.println("Cập nhập điểm thành công.");
        } else {
            System.out.println("Không tìm thấy học sinh với ID đã cho.");
        }
    }

    public static Student findStudentById(int id) {
    for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void sortStudentsByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
        displayStudents();
    }

    public static void sortStudentsByPoint() {
        Map<String, List<Student>> pointGroups = new HashMap<>();
        for (Student student : students) {
            String key = getPointGroup(student.getPoint());
            pointGroups.putIfAbsent(key, new ArrayList<>());
            pointGroups.get(key).add(student);
        }

        for (List<Student> group : pointGroups.values()) {
            Collections.sort(group, Comparator.comparingDouble(Student::getPoint).reversed());
            displayStudentsInGroup(group);
        }
    }

    public static String getPointGroup(double point) {
        if (point >= 8.0) {
            return "A";
        } else if (point >= 6.5) {
            return "B";
        } else if (point >= 5.0) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void displayStudentsInGroup(List<Student> group) {
         System.out.println("=========");
        for (Student student : group) {
            System.out.println(student);
        }
    }
     public static void deleteStudent(Scanner scanner) {
        System.out.print("Nhập ID học sinh để xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            System.out.println("Xóa học sinh thành công.");
        } else {
            System.out.println("Không tìm thấy học sinh với ID đã cho.");
        }
    }
}
