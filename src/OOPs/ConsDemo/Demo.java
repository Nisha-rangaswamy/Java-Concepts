package OOPs.ConsDemo;

public class Demo {
    Demo(){
        System.out.println("I'm a constructor");
    }
}

class Driver{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2=new Demo();
    }
}
