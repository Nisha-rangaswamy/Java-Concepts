package Looping;

public class Pattern2 {
    public static void main(String[] args) {

        //Upper triangle
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower triangle
        for(int i=5-2;i>=0;i--){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
