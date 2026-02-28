package Threads.ThreadJoin.Ex1;

class MyTask implements Runnable {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("MyThread: " + i);

        }
    }

}
public class Demo1 {
    public static void main(String[] args) throws Exception{
        MyTask obj=new MyTask();
        Thread t0=new Thread(obj);
        obj.run();
        t0.join();

        System.out.println("Main Thread Finished");

    }
}
