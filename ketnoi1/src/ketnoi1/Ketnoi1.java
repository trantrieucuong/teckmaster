/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ketnoi1;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.swing.text.html.parser.DTDConstants;
import java.sql.*;

/**
 * 
 *
 * @author Legion 5
 */
public class Ketnoi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("helo");
        try{
            String url="jdbc:sqlserver://localhost:1433;databaseName=DB_FPL_DAOTAO_cuong32833;encrypt=true;trustServerCertificate=true;";
            String username="sa";
            String pass="123456";
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("haha");
            Connection conn=DriverManager.getConnection(url, username, pass);
            System.out.println(conn);
            Statement stt=conn.createStatement();
            String sql="SELECT HoTen from STUDENTS";
            ResultSet rs=stt.executeQuery(sql);
            while(rs.next()){
               String ten=rs.getString(1);
                System.out.println("ten"+ten);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
