/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MainForConnectJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            // TODO code application logic here
            // Khai báo những thông tin liên quan đến CSDL ở đây
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=StudentDB2022;";

            // username và password của sql
            String user = "sa";
            String pass = "truong19062001";

            // Các bước để kết nối CSDL
            // Bước 1: Nạp trình điều khiển  -- block with try cath
            Class.forName(driverName);
            // Bước 2: Thiết ;ập kết nối
            // Bước 3: Kết nối CSDL, bằng đối tượng Connection
            Connection con = DriverManager.getConnection(url, user, pass);
            // Bước 4: Tạo đối tượng Statement
            Statement stmt = con.createStatement();
            // Bước 5: Thực hiện câu truy vấn SQL
            String sql = "SELECT * FROM Student2022TBL";
            // Bước 6: Xử lý kết quả trả về
            // Execute Cau lenh SQL
            ResultSet result = stmt.executeQuery(sql);
            // Duyet tung dong trong result
            while (result.next()) {
                String numberDB = result.getString(1).trim();
                String nameDB = result.getString(2);
                String courseDB = result.getString(3);
                // tao thanh student tam va in ra
                Student tempStudent = new Student(numberDB, nameDB, courseDB);
                System.out.println("" + tempStudent.toString());
            }
            // bước 7: Đóng kết nối
            result.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainForConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             Logger.getLogger(MainForConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
