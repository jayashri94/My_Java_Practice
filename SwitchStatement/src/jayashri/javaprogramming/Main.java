package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int value = 1;
//        if(value ==1){
//            System.out.println("valie is 1");
//
//        }else if(value ==2){
//            System.out.println("Value is 2");
//        }else{
//            System.out.println("Neither 1 nor 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value is 3,4 or 5");
                break;
            default:
                System.out.println("Was not 1 or 2,3,4,5");

        }

        char givenCase = 'F';
        switch (givenCase){

            case 'A':
                System.out.println("Given case is A");
                break;
            case 'B':
                System.out.println("Given case is B");
                break;
            case 'C':
                System.out.println("Given case is C");
                break;
            case 'D':
                System.out.println("Given case is D");
                break;
            default:
                System.out.println("Not A,B,C or D");

        }

    }

}

