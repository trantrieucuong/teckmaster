/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Legion 5
 */
public class SmartPhone extends Product{
    private int ram;
    private String resolution;
    private String chip;
    
    public SmartPhone(String productCode, String productName, Manufacturer manufacturer, double price, int quantity) {
        super(productCode, productName, manufacturer, price, quantity);
        this.ram = ram;
        this.resolution = resolution;
        this.chip = chip;
    }
    @Override
    public String toString() {
        return super.toString() +
               ", RAM: " + ram +
               ", Resolution: " + resolution +
               ", Chip: " + chip;
    }
}
