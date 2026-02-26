package OOPs.Encapsulation;

public class Student {
    private String name;
    private int usn;

    Student(String name,int usn){
        this.name=name;
        this.usn=usn;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name=name;
    }

    int getusn(){
        return this.usn;
    }

    void setusn(int usn){
        this.usn=usn;
    }

    void printDetails(){
        System.out.println("Student name:" + name);
        System.out.println("Student usn:" + usn);
    }
}

class Driver{
    public static void main(String[] args) {
        Student s1=new Student("Nisha",1012);
        s1.printDetails();
        System.out.println("Name:" + s1.getName());
        s1.setName("Nii");
        System.out.println("Name:" + s1.getName());
        s1.setusn(230525);
        System.out.println("USN:" + s1.getusn());

    }
}
