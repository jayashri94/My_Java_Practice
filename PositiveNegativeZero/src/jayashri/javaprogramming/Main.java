package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
        checkNumber(56);
        checkNumber(600);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
