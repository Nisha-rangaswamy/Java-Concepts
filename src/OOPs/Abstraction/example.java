package OOPs.Abstraction;

abstract class example {
    abstract void clg();
    void vtu(){
        System.out.println("Visveswaraya University");
    }
}
class sns extends example{
    void clg(){
        System.out.println("SNS College");
    }
}
class skt extends example{
    void clg(){
        System.out.println("SKT College");
    }
}
class Drivers{
    public static void main(String[] args) {
        sns n=new sns();
        n.clg();
        n.vtu();
        skt g=new skt();
        g.clg();
        g.vtu();
    }
}