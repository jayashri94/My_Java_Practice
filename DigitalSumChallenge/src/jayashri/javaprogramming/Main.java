package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Sum of all numbers " + sumDigits(45));
        System.out.println("Sum of all numbers " + sumDigits(455));

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 1) {


            int digit = number % 10;

            sum += digit;

            number = number /10; //removes least significant

        }
        return sum;

    }
}
