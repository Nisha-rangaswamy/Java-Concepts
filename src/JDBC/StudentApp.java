package JDBC;

import java.sql.*;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/student_db";
        String user="root";
        String password="nisha";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            while (true) {
                System.out.println("Select any Operation:"+
                        "\n1) Insert\n2) View\n3) Update"+
                        "\n4) Delete"+"\n5) Exit");
                int choice=sc.nextInt();
                if(choice==1){
                    System.out.println("Enter the ID: ");
                    int id=sc.nextInt();
                    System.out.println("Enter the Name: ");
                    String name=sc.next();
                    System.out.println("Enter the Age: ");
                    int age=sc.nextInt();
                    String query="INSERT INTO students(id,name,age) VALUES(?,?,?)";
                    PreparedStatement ps=con.prepareStatement(query);
                    ps.setInt(1,id);
                    ps.setString(2,name);
                    ps.setInt(3,age);
                    ps.executeUpdate();

                }else if(choice==2){
                    String query="SELECT * FROM students";
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery(query);
                    while(rs.next()){
                        System.out.println(rs.getInt("id")+" "+
                                rs.getString("name")+" "+
                                rs.getInt("age"));
                    }
                }else if(choice==3){
                    System.out.println("Enter the ID: ");
                    int id=sc.nextInt();

                    System.out.println("Enter the Name: ");
                    String name=sc.next();

                    System.out.println("Enter the new age: ");
                    int age=sc.nextInt();
                    String query="UPDATE students SET name=?,age=? WHERE id=?";
                    PreparedStatement ps=con.prepareStatement(query);
                    ps.setString(1,name);
                    ps.setInt(2,id);
                    ps.setInt(3,age);
                    int row=ps.executeUpdate();
                    if(row>0){
                        System.out.println("Updated Successgully");
                    }else{
                        System.out.println("ID not Found!");
                    }
                }else if(choice==4){
                    System.out.println("Enter the ID to be Deleted: ");
                    int id=sc.nextInt();
                    String query="DELETE FROM studnets WHERE id=?";
                    PreparedStatement ps=con.prepareStatement(query);
                    ps.setInt(1,id);
                    int row=ps.executeUpdate();
                    if(row>0){
                        System.out.println("Deleted Successfully");
                    }
                }else{
                    break;
                }

            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
