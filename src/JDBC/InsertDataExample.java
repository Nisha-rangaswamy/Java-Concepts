package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataExample {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test_db";
        String user="root";
        String password="nisha";

        try{
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt=con.createStatement();
            String query="INSERT INTO students(usn,name,age) VALUES (101,'Rahul',25),(102,'Anjali',30),(103,'Saurav',26)";
stmt.executeUpdate(query);
            System.out.println("Row got Inserted Successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
