/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demolentable;

import java.sql.Connection;
import java.sql.DriverManager;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.swing.text.html.parser.DTDConstants;
import java.sql.*;


/**
 *
 * @author Legion 5
 */
public class Demolentable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url="jdbc:sqlserver://localhost:1433;databaseName=DB_FPL_DAOTAO_cuong32833;encrypt=true;IntegratedSecurity=true;trustServerCertificate=true;";
        try {
            // Đăng ký Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("haha");
            
            

            // Tạo kết nối
            Connection connection = DriverManager.getConnection(url);
            System.out.println(connection);
            Statement stt=connection.createStatement();
            String sql="SELECT MASV FROM STUDENTS";
            ResultSet rs=stt.executeQuery(sql);
            while(rs.next()){
               String masv=rs.getString(1);
                System.out.println("ten"+masv);
            }
            // Thực hiện các thao tác truy vấn hoặc xử lý dữ liệu
            
            // Đóng kết nối
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
