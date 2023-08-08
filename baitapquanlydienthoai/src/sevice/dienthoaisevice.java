/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Manufacturer;
import model.Product;
import model.SmartPhone;

/**
 *
 * @author Legion 5
 */
public class dienthoaisevice {
    public static List<Product> products = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
     public static void addProduct() {
        System.out.print("Enter product code: ");
        String productCode = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.println("Select manufacturer:");
        for (Manufacturer manufacturer : Manufacturer.values()) {
            System.out.println(manufacturer.ordinal() + ". " + manufacturer);
        }
        int manufacturerChoice = scanner.nextInt();
        Manufacturer manufacturer = Manufacturer.values()[manufacturerChoice];
        scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        if (manufacturerChoice == 0) {
            System.out.print("Enter RAM: ");
            int ram = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter resolution: ");
            String resolution = scanner.nextLine();

            System.out.print("Enter chip: ");
            String chip = scanner.nextLine();

            SmartPhone smartPhone = new SmartPhone(productCode, productName, manufacturer, price, quantity, ram, resolution, chip);
            products.add(smartPhone);
        } else {
            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            PhoneAccessory phoneAccessory = new PhoneAccessory(productCode, productName, manufacturer, price, quantity, description);
            products.add(phoneAccessory);
        }

        System.out.println("Product added successfully.");
    }
}
