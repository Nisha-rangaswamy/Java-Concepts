package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadDataExample {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test_db";
        String user="root";
        String password="nisha";

        try{
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt=con.createStatement();
            String query="SELECT * FROM students";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(
                rs.getInt("usn")+" "+
                rs.getString("name")+" "+
                rs.getInt("age"));
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
