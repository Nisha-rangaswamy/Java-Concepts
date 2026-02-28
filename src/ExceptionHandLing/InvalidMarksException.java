package ExceptionHandLing;

public class InvalidMarksException extends Exception {
    InvalidMarksException(String msg){
        super(msg);
    }
}
class Driver1{
    static void marks(int score) throws InvalidMarksException{
        if(score<35){
            throw new InvalidMarksException("Failed");
        }
        System.out.println("Passed");
    }
    public static void main(String[] args) {
        try{
            marks(25);
        }catch (InvalidMarksException e){
            System.out.println(e.getMessage());
        }

    }
}
