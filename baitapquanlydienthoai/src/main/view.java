/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Product;

/**
 *
 * @author Legion 5
 */
public class view {
    public static List<Product> products = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Price");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Search Product");
            System.out.println("6. Display Products");
            System.out.println("7. Sort Products by Price (Ascending)");
            System.out.println("8. Sort Products by Price (Descending)");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProductPrice();
                    break;
                case 3:
                    updateProductQuantity();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    displayProducts();
                    break;
                case 7:
                    sortProductsByPriceAscending();
                    break;
                case 8:
                    sortProductsByPriceDescending();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
