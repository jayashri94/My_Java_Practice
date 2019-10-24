package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {

        for(int i=2;i<9;i++){
            System.out.println("10,000 at "+i+"% interest =" + simpleInterest(10000,i));
        }

        for(int i=8;i>=2;i--){
            System.out.println("10,000 at "+i+"% interest =" + String.format("%.2f",simpleInterest(10000,i)));
        }

        int count = 0;

        for(int i = 10; i < 50; i++){

           if(isPrime(i)){

               System.out.println("The number "+ i + " is a prime number");
               count++;

               if (count == 10){
                   break;
               }

           }

        }

    }







    public static double simpleInterest(double amount, double interest){
        return (amount *(interest/100));
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }




}
