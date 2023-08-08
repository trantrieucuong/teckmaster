/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Legion 5
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classroom;

    public Student(int id, String name, int age, String address, double point, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getPoint() {
        return point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address + ", Point: " + point + ", Classroom: " + classroom;
    }

}
