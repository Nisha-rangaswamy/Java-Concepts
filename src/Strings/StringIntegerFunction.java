package Strings;

public class StringIntegerFunction {
    public static void main(String[] args) {
        String s1=new String("Hello");
        String s2="Hello";

        String s3=s1.intern();
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}
