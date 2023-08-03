/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManager;

import Student.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Legion 5
 */
public class StudentManager {
      private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updatePoint(int studentId, double newPoint) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.setPoint(newPoint);
                break;
            }
        }
}
    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getId() == studentId);
    }

    public List<Student> getStudentsByClassroom(String classroom) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getClassroom().equals(classroom)) {
                result.add(student);
            }
        }
        return result;
    }

    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    public void sortByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
    }

    public void sortByPoint() {
        Collections.sort(students, Comparator.comparingDouble(Student::getPoint).reversed());
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
