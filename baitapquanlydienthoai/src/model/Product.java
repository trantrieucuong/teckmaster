/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Legion 5
 */
public class Product {
     private String productCode;
    private String productName;
    private Manufacturer manufacturer;
    private double price;
    private int quantity;

    public Product(String productCode, String productName, Manufacturer manufacturer, double price, int quantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product Code: " + productCode +
               ", Product Name: " + productName +
               ", Manufacturer: " + manufacturer +
               ", Price: " + price +
               ", Quantity: " + quantity;
    }

}
