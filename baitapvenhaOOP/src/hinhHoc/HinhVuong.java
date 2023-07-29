/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhHoc;

/**
 *
 * @author Legion 5
 */
public class HinhVuong extends HinhHoc{
   private double side;

    public HinhVuong(double side) {
        this.side = side;
    }

    public double tinhDienTich() {
        return side * side;
    }

    public double tinhChuVi() {
        return 4 * side;
    }

    public void hienThiThongTin() {
        System.out.println("Hinh vuong co canh: " + side);
    }
}
