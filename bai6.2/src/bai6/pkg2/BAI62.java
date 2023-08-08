/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6.pkg2;

import điểm.SinhVienBiz;
import điểm.SinhVienIT;
import java.util.ArrayList;
import java.util.Scanner;
import sinhvien.SinhVienTechMaster;

/**
 *
 * @author Legion 5
 */
public class BAI62 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
      
       String name,nganh,choike;
       double  diem;
       
       do{
           
           System.out.println("nhap vao ten: ");
           name=sc.nextLine();
           System.out.println("nhap vao nhanh hoc: (cntt/kinh te)");
           nganh=sc.nextLine();
           if(nganh.equalsIgnoreCase("cntt")){
               double diemjava,diemhtml,diemcss;
               
               System.out.println("nhap vao diem java:");
               diemjava=Double.parseDouble(sc.nextLine());
               System.out.println("nhap vao diem html: ");
               diemhtml=Double.parseDouble(sc.nextLine());
               System.out.println("nhap vao diem css");
               diemcss=Double.parseDouble(sc.nextLine());
               SinhVienIT sa=new SinhVienIT(name, nganh, diemjava, diemhtml, diemcss);
               
               diem=sa.getDiem();
               SinhVienTechMaster sv=new SinhVienTechMaster(name, nganh, diem);
               sv.xuat();
               
               
           }else if(nganh.equalsIgnoreCase("kinh te")){
               double diemMarketing,diemSales;
               System.out.println("nhap vao diem maket: ");
               diemMarketing =Double.parseDouble(sc.nextLine());
               System.out.println("nhap vao diem sale");
               diemSales=Double.parseDouble(sc.nextLine());
               SinhVienBiz sb=new SinhVienBiz(name, nganh, diemMarketing, diemSales);
               diem=sb.getDiem();
                SinhVienTechMaster sv=new SinhVienTechMaster(name, nganh, diem);
               sv.xuat();
           }
           else{
               System.out.println("eroor");
               return;
           }
           
           
           System.out.print("\nDo you want to continue? (Y/N): ");
            choike = sc.nextLine();
            
       }while(choike.equalsIgnoreCase("y"));
      
       
           
               
//        SinhVienTechMaster sv = new SinhVienTechMaster("Nguyen Van A", "CNTT", 7.8);
//        sv.xuat();
       
    }
    
}
