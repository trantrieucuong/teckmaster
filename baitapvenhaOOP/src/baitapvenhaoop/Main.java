/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapvenhaoop;

import hinhHoc.HinhChuNhat;
import hinhHoc.HinhVuong;
import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin hình chữ nhật
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double lengthRectangle = scanner.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double widthRectangle = scanner.nextDouble();
        double sideSquare;
        // Nhập thông tin hình vuông
        if(lengthRectangle==widthRectangle){
            
            sideSquare=widthRectangle;
             HinhVuong hinhVuong = new HinhVuong(sideSquare);
             double dienTichHinhVuong = hinhVuong.tinhDienTich();
             double chuViHinhVuong = hinhVuong.tinhChuVi();
             hinhVuong.hienThiThongTin();
             System.out.println("Dien tich hinh vuong: " + dienTichHinhVuong);
             System.out.println("Chu vi hinh vuong: " + chuViHinhVuong);
             return;
        }else{

        // Tạo các đối tượng hình chữ nhật và hình vuông
        HinhChuNhat hinhChuNhat = new HinhChuNhat(lengthRectangle, widthRectangle);
       

        // Tính diện tích và chu vi 2 hình
        double dienTichHinhChuNhat = hinhChuNhat.tinhDienTich();
        double chuViHinhChuNhat = hinhChuNhat.tinhChuVi();
        

        // Hiển thị thông tin về các cạnh của 2 hình
        hinhChuNhat.hienThiThongTin();
        System.out.println("Dien tich hinh chu nhat: " + dienTichHinhChuNhat);
        System.out.println("Chu vi hinh chu nhat: " + chuViHinhChuNhat);
        return;
        }
    }
}
