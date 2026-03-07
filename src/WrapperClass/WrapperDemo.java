package WrapperClass;

//Primitive----->Object conversion=Boxing
public class WrapperDemo {
    public static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);//Manual Boxing
        System.out.println("Primitive value: " + x);
        System.out.println("Object Val: " + obj);
    }
}
