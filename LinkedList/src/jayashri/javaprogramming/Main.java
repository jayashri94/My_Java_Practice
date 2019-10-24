package jayashri.javaprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("John",45.76);

        Customer anotherCustomer;

        anotherCustomer = customer;

        anotherCustomer.setBalance(12.18);

        System.out.println("Balance of customer"+customer.getName()+"is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i<intList.size();i++){

            System.out.println(i+": " +intList.get(i));

        }

        intList.add(1,7);
        System.out.println();

        for (int i = 0; i<intList.size();i++){

            System.out.println(i+": " +intList.get(i));

        }


    }
}
