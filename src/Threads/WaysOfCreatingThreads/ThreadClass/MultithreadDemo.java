package Threads.WaysOfCreatingThreads.ThreadClass;

class UsingThreadClass extends Thread{

    public void run(){
        System.out.println("Running..");
        for(int i=1;i<=5;i++)
            System.out.println("Child Thread: " + i);
    }
}
public class MultithreadDemo{
    public static void main(String[] args) {
        UsingThreadClass t1=new UsingThreadClass();
        t1.start();
        for(int j=1;j<=5;j++){
            System.out.println("Main Thread: " + j);
        }
    }
}