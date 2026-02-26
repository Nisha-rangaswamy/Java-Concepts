package OOPs.Basics.ClassWithAttributes;

public class College {
    String CName;
    int CID;
    String CAddress;

    public College(String CName,int CID,String CAddress){
        this.CName=CName;
        this.CID=CID;
        this.CAddress=CAddress;
    }
    void printDetails(){
        System.out.printf("College Name is %s\n",CName);
        System.out.printf("College ID is %d\n",CID);
        System.out.printf("College Address is %s\n",CAddress);
    }
}

class eng{
    public static void main(String[] args) {
        College c1=new College("Sapthagiri",230525,"Chikkabanavara");
        College c2=new College("SriKrishna",101225,"Bangalore");
        c1.printDetails();
        c2.printDetails();
    }
}
