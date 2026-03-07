package RecursionAndBackTracking;

public class RecDemo {
    static void function(){
        System.out.println("Hello");
        function();
    }

    public static void main(String[] args) {
        function();
    }
}
