/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mand;

import sevice.sevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author Legion 5
 */
public class StudentManagementSystem {
    public static List<Student> students = new ArrayList<>();
    public static int nextId = 1;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Xem danh sách học sinh");
            System.out.println("2. Thêm học sinh mới");
            System.out.println("3. Cập nhập điểm học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Sắp xếp theo tuổi");
            System.out.println("6. Sắp xếp theo điểm");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    sevice.displayStudents();
                    
                    break;
                case 2:
                    sevice.addStudent(scanner);
                    break;
                case 3:
                    sevice.updateStudentPoint(scanner);
                    break;
                case 4:
                    sevice.deleteStudent(scanner);
                    break;
                case 5:
                    sevice.sortStudentsByAge();
                    break;
                case 6:
                    sevice.sortStudentsByPoint();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    
}