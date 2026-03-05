package Threads.LambdaExpression.WithRunnableinterface.OldWay;
public class Demo {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread1 is running");
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread2 is running");
            }
        });
        t1.start();
        t2.start();
    }
}
