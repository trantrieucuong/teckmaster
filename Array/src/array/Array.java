/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Arrays;
import java.util.Scanner;
import static javax.management.Query.value;

/**
 *
 * @author Legion 5
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
//        System.out.println("nhap vao n");
//        
//        int n=Integer.parseInt(sc.nextLine());
//        int arr[]=new int[n];
//        
//        for(int i=0;i<n;i++){
//            System.out.println("moi bn nhap vao so thu: "+(i+1));
//            int a=Integer.parseInt(sc.nextLine());
//            if(a%2==0){
//               a++; 
//            }
//            arr[i]=a;
//            
//            System.out.println("so thu "+(i+1)+" la: "+a);
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<n;i++){
//            System.out.println("a["+i+"]="+arr[i]);
//        }
            
//       for(int i=0;i<n;i++){
//            System.out.println("moi bn nhap vao so thu: "+(i+1));
//            int a=Integer.parseInt(sc.nextLine());
//              arr[i]=a;
//            
//            System.out.println("so thu "+(i+1)+" la: "+a);
//
//       }
//       System.out.println("bi pho"+Arrays.toString(arr));
//        System.out.println("thêm 1 phần tử vào mảng");
//        int arra[] = new int[n+1];
//        for(int i=0;i<n;i++){
//            arra[i]=arr[i];
//            
//            
//        }
//        
//        System.out.println("nhap gia tri them");
//        int c=Integer.parseInt(sc.nextLine());
//        
////        arra[n]=c;
////        System.out.println("apter"+Arrays.toString(arra)); 
//        int array[] = new int[n+1];
//        for(int j=0;j<3;j++){
//            array[j]=arr[j];
//        }
//        
//        for(int k=2;k<n-1;k++){
//            
//        }
//         System.out.println(Arrays.toString(array)); 
//        
//        
//        
//    }
System.out.println("nhap vao so dong");
int z=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao so cot");
        int y=Integer.parseInt(sc.nextLine());
        int sum=0;
int arr[][]=new int[z][y];

    
    for(int i=0;i<z;i++){
        for(int j=0;j<y;j++){
            System.out.println(" mo bna nhap a ["+i+"]["+j+"]=");
            int x=Integer.parseInt(sc.nextLine());
            arr[i][j]=x;
            System.out.println("a ["+i+"]["+j+"]="+arr[i][j]);
            sum+=x;
            
            
        }
        System.out.println(sum);
        
    }
    for(int i=0;i<z;i++){
        for(int j=0;j<y;j++){
            System.out.print(arr[i][j]+" " );
        }
        System.out.println();
    }
    
    }
    
//    int index=0;
      
    
}
