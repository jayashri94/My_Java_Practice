package jayashri.javaprogramming;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount(){

        this(56789,2039,"default name","default mailid",0000);
        System.out.println("Empty Constructor called");

    }

    public BankAccount(int accountNumber,double balance,String name,String email,
                       int phoneNumber){
        System.out.println("BankAccount Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, int phoneNumber) {
        this(999,1000.20,name,email,phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("The current balance of your account is: "+this.balance);
    }

    public void withdrawFund(double withdraw){

        if((this.balance - withdraw) < 0){
            System.out.println("Only "+this.balance+" is available, withdraw is not possible");
        }else{
            this.balance -= withdraw;
            System.out.println("Withdraw of "+withdraw+ " is processed. Remaining balance = " +this.balance);

        }

    }

}
