package Looping;

public class Pattern4 {
    public static void main(String[] args) {
        int rows=6, columns=7;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                if(r==0 && c%3!=0){
                    System.out.print(" * ");
                }else if(r==1 && c%3==0){
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
