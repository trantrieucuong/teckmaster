/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhHoc;

/**
 *
 * @author Legion 5
 */
public class HinhChuNhat extends HinhHoc{
    private double length;
    private double width;

    public HinhChuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double tinhDienTich() {
        return length * width;
    }

    public double tinhChuVi() {
        return 2 * (length + width);
    }

    public void hienThiThongTin() {
        System.out.println("Hinh chu nhat co chieu dai: " + length + ", chieu rong: " + width);
    }
}
