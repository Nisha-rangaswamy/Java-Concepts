package Basics;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in M1");
        int M1 = sc.nextInt();
        System.out.println("Enter marks in M2");
        int M2 = sc.nextInt();
        System.out.println("Enter marks in M3");
        int M3 = sc.nextInt();
        System.out.println("Enter marks in M4");
        int M4 = sc.nextInt();
        System.out.println("Enter marks in M5");
        int M5 = sc.nextInt();
        double total = M1 + M2 + M3 + M4 + M5;
        System.out.println("Total Marks:" + total);
        double percentage = (total / 500) * 100;
        System.out.println("Percentage" + percentage);
        if (percentage >= 75)
            System.out.println("A Grade");
        else if (percentage >= 50)
            System.out.println("B Grade");
        else if (percentage >= 30)
            System.out.println("C Grade");
        else
            System.out.println("Fail");
        sc.close();
    }
}
