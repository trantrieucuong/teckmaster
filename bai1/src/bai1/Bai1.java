/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello word");
        System.out.println("dem so");
        for(int i=0;i<=2000;i++){
            System.out.println("số:"+i);
        }
//        final double PI=3.14;
        String SUN="mặt trời";
//        System.out.println("so pi="+PI);
        System.out.println(Math.PI);
        int a=123;
        System.out.println(""+a);
        String name = "đạt";
        char c=12;
        System.out.println(c);
        double d=10.1;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();
        
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;
        double s=113;
        double r=Math.sqrt(s/Math.PI);
        double h = r*2;
         double chuvitron=(r*2)*Math.PI;
        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
        System.out.println("r "+r);
        System.out.println("d"+h);
        System.out.println("chuvihinhtron"+chuvitron);
        System.out.println("nhap van toc xe may");
        double vxemay=scanner.nextDouble();
        System.out.println("nhap v oto");
        double voto=scanner.nextDouble();
        
        double tong=vxemay+voto;
        System.out.println("nhap vao thoi gian xe may");
        double timexe=scanner.nextDouble();
        System.out.println("nhap vao thoi gian oto");
        double timeo=scanner.nextDouble();
         double timetong=timexe+timeo;
         double quangduong=timetong+tong;
         System.out.println("quangduong"+quangduong);
         
        
        
        
    }
    
}
