package OOPs.Basics.ClassWithAttributes;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder,double bal){
        this.accountHolder=accountHolder;
        balance=bal;
    }
    void deposit(double amount){

        System.out.printf("Deposited amount is: " + amount);
        balance=amount+balance;
        System.out.printf("\nUpdated Balance is: " + balance);

    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("\nWithdraw amount is:" + amount);
            System.out.println("\nBalance:" + balance);
        }else{
            System.out.println("\nInsuffient balance");
        }
    }
    void displayBalance(){
        System.out.println("\nAccount holder is:" + accountHolder);
        System.out.println("\nCurrent balance is:" + balance);
    }
}

class bank{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Nisha",500);
        b1.displayBalance();
        b1.deposit(500);
        b1.withdraw(200);

    }
}
