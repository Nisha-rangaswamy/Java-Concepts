package ExceptionHandLing;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("Undefined");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }catch (Exception e){
            System.out.println("Unknown Exception Occured");
        }finally{
            System.out.println("This will get executed no matter what");

        }
        System.out.println("hello");
    }static{
        System.out.println("Execution starts");
    }
}
