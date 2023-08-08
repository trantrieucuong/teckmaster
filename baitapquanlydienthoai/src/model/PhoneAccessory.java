/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Legion 5
 */
public class PhoneAccessory extends Product{
    private String description;
    public PhoneAccessory(String productCode, String productName, Manufacturer manufacturer, double price, int quantity) {
        super(productCode, productName, manufacturer, price, quantity);
        this.description = description;
    }
     @Override
    public String toString() {
        return super.toString() +
               ", Description: " + description;
    }
}
