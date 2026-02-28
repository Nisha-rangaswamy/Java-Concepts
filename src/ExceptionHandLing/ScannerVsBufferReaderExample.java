package ExceptionHandLing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVsBufferReaderExample {
    public static void main(String[] args) throws IOException {
        //Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //String str=sc.next();
        String str=br.readLine();
        int a=Integer.parseInt(str);
    }
}
