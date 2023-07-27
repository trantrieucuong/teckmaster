/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3full;


import javax.swing.text.html.parser.DTDConstants;
import java.sql.*;

public class Connecsion {
  
    public Connecsion getConnecsion(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String strconn="jdbc:sqlserver://localhost:1433;databaseName=DB_FPL_DAOTAO_cuong32833;encrypt=true;trustServerCertificate=true;";
            String username="sa";
            String pass="123456";
            Connection  conn=DriverManager.getConnection(strconn,username,pass );
            System.out.println("haha");
            
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
        
    
    }
}   

