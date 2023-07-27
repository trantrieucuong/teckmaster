/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String s="hello worl";
//        s.toLowerCase();
        System.out.println("s"+s.trim());
        
        
        String s1= new String("heloo worl");
        s1.toLowerCase();
        System.out.println("s1"+s1.length());
        System.out.println(s.equals(s1));
        System.out.println("\\");
        System.out.println("''");
        System.out.println("\"\"");
        System.out.println("\tabc");
        System.out.println("ab\nc");
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2004, Month.NOVEMBER, 14));
        LocalDate localDate= LocalDate.of(2004, Month.NOVEMBER, 14);
        LocalDate lo=localDate.plusDays(1);
        System.out.println(lo);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime2=LocalTime.of(10, 10);
        System.out.println(localTime2);
        LocalDate localDate13=localDate.of(2023, Month.MARCH, 11);
        System.out.println(localDate13.equals(localTime2));
        
        
        String datetime="2023/05/20 17:08";
        LocalDateTime LSCD=LocalDateTime.parse(datetime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println(LSCD);
        Scanner scanner= new Scanner(System.in);
//        System.out.println("nhập vào tên:");
//        String name=scanner.nextLine();
//        System.out.println("moi nhao vao dia chi:");
//        String diachi=scanner.nextLine();
//        
//        System.out.println("moi ban nhao tuoi");
//        int tuoi=Integer.parseInt(scanner.nextLine());
//        System.out.println("moi ban nhao email:");
//        String emai=scanner.nextLine();
//        
//        System.out.println("ten cua ban la"+name+"\n"+"dia chi"+diachi+"\n"+"tuoi"+tuoi+"\n"+"email"+emai);
        
        System.out.println("nhap ten hang");
        String ten=scanner.nextLine();
        System.out.println("nhap han su dung");
        String date= scanner.nextLine();
        Date dates=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println("date"+dates);
        System.out.println("nhap thoi gian nhap hang");
        String nhap=scanner.nextLine();
        Date nhaps=new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(nhap);
        System.out.println("thoi gian nhap"+nhaps);
        System.out.println("nhap vao time");
        String time=scanner.nextLine();
        Time times=new SimpleDateFormat("HH:mm").parse(time);
        System.out.println("thoi gian"+times);
        
        
        
        
    }
    
}
