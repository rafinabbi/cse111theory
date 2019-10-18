package Assignment_03;
//Lab5_Task9//
public class Account {
    private String name;
    private double balance;
    public static double interestRate=5.0;

    public Account(){
    this.name="Default Account";
    this.balance=0.0;
    }
    public Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }

    public String nameKi() {
        return name;
    }
    public void nameeije(String name){
        this.name=name;
    }

    public double balanceKi() {
        return balance;
    }

    public void nameBoshao(String name) {
        this.name=name;
    }

    public void balanceBoshao(double balance) {
        this.balance=balance;
    }

    public void withdraw(double n) {
        if(this.balance-n>100){
            System.out.println("Withdraw successful! New balance is: "+(this.balance-n));
        }
        else{
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
    }
}
