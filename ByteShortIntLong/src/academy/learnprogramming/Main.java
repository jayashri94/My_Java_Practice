package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;

        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Int minimum value "+ myMinIntValue);
        System.out.println("Int maximum value "+ myMaxIntValue);

        System.out.println("Busted maximum value "+ (myMaxIntValue +1)); //overflow
        System.out.println("Busted minimum value "+ (myMinIntValue -1)); //underflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value "+ myMinByteValue);
        System.out.println("Byte maximum value "+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value "+ myMinShortValue);
        System.out.println("Short maximum value "+ myMaxShortValue);
        
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long minimum value "+ myMinLongValue);
        System.out.println("Long maximum value "+ myMaxLongValue);

        short bigShortLiteralValue =32767;

        int MyTotal = (myMinIntValue /2);

        byte MyNewByteValue = (byte) (myMinByteValue/2); //casting

        short myNewShortValue = (short) (myMinShortValue/2);

    }
}
