/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi3;

import java.util.Scanner;

/**
 *
 * @author Legion 5
 */
public class Buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
//        System.out.println("mời ban nhập điểm");
//        double score=sc.nextDouble();
//        
//        
//        if(score>=9){
//            System.out.println("học sinh gioi");
//        }else if(score>=6.5 && score <=9){
//            System.out.println("học sinh khá");
//        }else if(score>=5 && score <6.5){
//            System.out.println("học sinh khá");
//        }else{
//            System.out.println("rớt");
//        }
//System.out.println("giai phuong trinh bac nhat co dang a*x^2+*xb+c=0");
//        System.out.println("nhap so thu nhat");
//        double so1=Double.parseDouble(sc.nextLine());
//        System.out.println("nhap so thu 2");
//        double so2=Double.parseDouble(sc.nextLine());
//        System.out.println("nhap so thu 3");
//        double so3=Double.parseDouble(sc.nextLine());
//        System.out.println("phuong trinh"+so1+"^2+"+so2+"x+"+so3+"=0");
//        if(so1!=0){
//        double d=so2*so2 - 4*so1*so3;
//        
//        System.out.println("dental="+d);
//        if(d<0){
//            System.out.println("vô nghiệm");
//        }else if(d==0){
//            double x=-so2/2*so1;
//            System.out.println("phuong trinh co nghiem kep x1=x2="+x);
//            
//        }
//        else{
//            double x1=(-so2+Math.sqrt(d))/2*so1;
//            double x2=(-so2-Math.sqrt(d))/2*so1;
//            System.out.println("phuong trinh co nghiem kep x1="+x1 +" x2="+x2);
//        }
//        }else{
//            if(so2!=0){
//            double x=-so3/so2;
//            System.out.println("phuong tring co nghiem x="+x);
//            }else{
//                System.out.println("vô nghiệm");
//            }
//            
//        }
//        
//    }
// System.out.print("Nhập số điện sử dụng của tháng: ");
//        double soDienSuDung = sc.nextInt();
//        if(soDienSuDung<=50){
//            
//            System.out.println("gia tien dien 1000*"+soDienSuDung);
//            double sodien=1000*soDienSuDung;
//            System.out.println("so tien phai tra"+sodien);
//        }else{
//            
//        }
//       
//        
//System.out.println("nhap tk:");
//String user=sc.nextLine();
//        System.out.println("nhap mk");
//        String pass=sc.nextLine();
//        if(user.equalsIgnoreCase("techmaster")&&pass.equalsIgnoreCase("hoclacoviec")){
//            System.out.println("login thanh cong");
//        }else{
//            System.out.println(" sai tk hoac mk");
//        }
//  System.out.print("Nhập tên của một hãng ô tô bất kỳ: ");
//        String brandName = sc.nextLine();
//
//        // Chuyển đổi tên hãng xe thành chữ viết thường để so sánh không phân biệt hoa thường
//        String lowercaseBrandName = brandName.toLowerCase();
//
//        // Sử dụng câu lệnh switch case để xác định thông tin của hãng xe
//        switch (lowercaseBrandName) {
//            case "toyota":
//                System.out.println("Hãng xe Toyota: Toyota là một hãng xe nổi tiếng từ Nhật Bản.");
//                break;
//            case "honda":
//                System.out.println("Hãng xe Honda: Honda là một hãng xe có ảnh hưởng từ Nhật Bản.");
//                break;
//            case "ford":
//                System.out.println("Hãng xe Ford: Ford là một hãng xe danh tiếng từ Mỹ.");
//                break;
//            // Thêm các case khác nếu bạn muốn xác định thông tin cho các hãng xe khác
//            default:
//                System.out.println("Không tìm thấy thông tin cho hãng xe này.");
//        }
//
//        // Đóng đối tượng Scanner sau khi sử dụng
//        sc.close();
//System.out.println("Chào mừng đến với máy tính bỏ túi!");
//
//        System.out.print("Nhập số a: ");
//        double a = sc.nextDouble();
//
//        System.out.print("Nhập số b: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Nhập phép toán (+=, x, %,* )");
//        System.out.println("\n Chú Thích +=:cộng, x: trừ, *:nhân, %:chia");
//        String operator = sc.next();
//
//        double result = 0.0;
//
//        switch (operator) {
//            case "+=":
//                result = a + b;
//                break;
//            case "x":
//                result = a - b;
//                break;
//            case "*":
//                result = a * b;
//                break;
//            case "%":
//                result = a / b;
//                break;
//            default:
//                System.out.println("Phép toán không hợp lệ!");
//                return;
//        }
//
//        System.out.println("Kết quả phép tính: " + result);
//
//        sc.close();
//for(int i=0;i<=10;i++){
//    System.out.println("i:"+i);
//}
//        System.out.println("nhap vao n");
//        int n=sc.nextInt();
//        int sum=0;
//        int nhan=1;
//        int sum1=0;
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//           
//            System.out.println("tong:"+sum);
//            nhan*=i;
//           
//            System.out.println("nhan:"+nhan);
//            if(i%2==0){
//                sum1+=i;
//                System.out.println("tong chan: "+sum1);
//            }
//            
//        }
//  
//    System.out.print("Nhập vào một số nguyên dương n: ");
//        int n = sc.nextInt();
//        
//        int i = 0;
//        int sum = 0;
//        int product = 1;
//        int sumEven = 0;
//
//        // Tính tổng và tích của tất cả các số nguyên từ 0 đến n
//        while (i <= n) {
//            sum += i;
//            product *= i;
//
//            // Tính tổng các số chẵn từ 0 đến n
//            if (i % 2 == 0) {
//                sumEven += i;
//            }
//
//            i++;
//        }
//
//        System.out.println("Tổng tất cả các số nguyên từ 0 đến n là: " + sum);
//        System.out.println("Tích tất cả các số nguyên từ 0 đến n là: " + product);
//        System.out.println("Tổng các số chẵn từ 0 đến n là: " + sumEven);
//
//        sc.close();
    System.out.print("Nhập vào một số nguyên dương n: ");
        int n = sc.nextInt();
        
        int i = 0;
        int sum = 0;
        int product = 1;
        int sumEven = 0;

        // Tính tổng và tích của tất cả các số nguyên từ 0 đến n
        do {
            sum += i;
            product *= i;

            // Tính tổng các số chẵn từ 0 đến n
            if (i % 2 == 0) {
                sumEven += i;
            }

            i++;
        } while (i <= n);

        System.out.println("Tổng tất cả các số nguyên từ 0 đến n là: " + sum);
        System.out.println("Tích tất cả các số nguyên từ 0 đến n là: " + product);
        System.out.println("Tổng các số chẵn từ 0 đến n là: " + sumEven);

        sc.close();
    }
    }
    
    

