package OOPs.Abstraction.Interfaces.Interfaces100NotAbstract;
//Why interfaces are not 100 percent Abstract
public interface Demo {
    void show();
    static void message(){
        System.out.println("Static Method!");
    }
}

class Driver{
    public static void main(String[] args) {
        Demo.message();
    }
}
