package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount jamesAccount = new BankAccount();

        BankAccount willAccount = new BankAccount(12344,100.022,
                "Will Smith","will@gmail.com",34029384);

        System.out.println(willAccount.getEmail());
        System.out.println(willAccount.getName());

        BankAccount jayAccount = new BankAccount();
        jayAccount.setName("Jayashri");
        jayAccount.setAccountNumber(12345);
        jayAccount.setBalance(2000);
        jayAccount.setPhoneNumber(912394593);
        jayAccount.setEmail("jayashri1394@gmail.com");

        jayAccount.withdrawFund(101.03);
        jayAccount.depositFunds(10000.92);
        jayAccount.withdrawFund(1000.34);

        BankAccount tim = new BankAccount("Tim","tim@gmail.com",320003840);

        System.out.println(tim.getAccountNumber()+"\tname: "+tim.getBalance());

    }
}
