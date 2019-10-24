package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;
        System.out.println("result is "+result);

        int previousResult = result;
        System.out.println("1+2 = "+previousResult);

        result = result * 10 ;
        System.out.println("3*10 = " + result);

        result++;
        System.out.println("result incremented to"+result);

        result /= 2;
        System.out.println("30/2 is "+ result );

        boolean isAlien = false;
        if (isAlien ==false) {
            System.out.println("Its not alien!");
            System.out.println("I am scared");
        }

        int topScore= 80;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore <100){
            System.out.println("Greater then second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <=90) ){
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if(newValue ==50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not spposed to happen");
        }
        if(!isCar){
            System.out.println("This is false");
        }

        isCar= true;
        boolean wasCar = isCar ? true:false;

        if(wasCar){
            System.out.println("wasCar is true");
        }

        double valueOneDouble = 20.00;
        double valueTwoDouble = 80.00;

        double results = (valueOneDouble + valueTwoDouble) *100.00d;

        double remainder = results % 40.00d ;

        System.out.println("My remainder "+ remainder);

        boolean isRemainder = (remainder == 0)?true:false;

        System.out.println("isRemainder "+ isRemainder);

        if(!isRemainder){
            System.out.println("Got some remainder");
        }



























    }
}
