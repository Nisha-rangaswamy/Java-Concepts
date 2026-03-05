package Threads.LambdaExpression.withoutLambda.Ex2;

interface calculator{
    int add(int a, int b);
}
public class Demo {
    public static void main(String[] args) {
        calculator c=new calculator(){
            public int add(int a,int b){
                return a+b;
            }
        };
        int result=c.add(10,20);
        System.out.println("Result: "+result);
    }
}
