package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value "+ myMinFloatValue);
        System.out.println("Float Maximum Value "+ myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println();
        System.out.println("Double Minimum Value "+ myMinDoubleValue);
        System.out.println("Double Maximum Value "+ myMaxDoubleValue);

        int myIntValue =5/2;
        float myFloatValue = 5.25f/2f;
        double myDoubleValue = 5d/ 3d;

        System.out.println("MyIntValue " +myIntValue);
        System.out.println("myFloatValue " +myFloatValue);
        System.out.println("myDoubleValue " +myDoubleValue);

        double inputPounds = 200 ;

        double resultInKilo = 0.45359237 * inputPounds;

        System.out.println("Kilogram " +resultInKilo);
    }
}
