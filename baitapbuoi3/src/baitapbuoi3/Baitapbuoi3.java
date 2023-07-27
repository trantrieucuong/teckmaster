/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapbuoi3;

import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Baitapbuoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner scanner = new Scanner(System.in);
        String name, address, choice;
        int age;

        do {
            // Input student information
            System.out.print("Please enter the name of the student: ");
            name = scanner.nextLine();

            System.out.print("Please enter the address of the student: ");
            address = scanner.nextLine();

            System.out.print("Please enter the age of the student: ");
            age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left in the buffer after nextInt()

            // Display student information
            System.out.println("\nStudent Information:");
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Age: " + age);

            // Ask if the user wants to continue
            System.out.print("\nDo you want to continue? (Y/N): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Program stopped. Goodbye!");
    }
    
}
