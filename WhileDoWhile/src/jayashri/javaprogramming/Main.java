package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int count = 1;
        while(count != 6){
            System.out.println("Count value is "+ count );
            count++;
        }
        System.out.println("************************");
//Not same as above
//        for(int i=1;i<7;i++){
//            System.out.println("Count value is "+ count);
//        }

//        for(int counter=1;counter<7;counter++){
//            System.out.println("Count value is "+ counter);
//        }
        int counter = 6;
//        while(true){
//            if(counter ==5){
//                break;
//            }
//            System.out.println("Count value is "+ counter);
//            counter++;
//        }

//        do{
//            System.out.println("Count value is "+ counter);
//            counter++;
//            if(counter >100){
//                break;
//            }
//        }while(counter !=6);
//
//        System.out.println("************************");

        int number =5;
        int finishNum = 20;
        int evenNumFound = 0;

        while (number <=finishNum){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumFound++;
            System.out.println("The given number "+number+" is even");
        }

        System.out.println("Total even number found " +evenNumFound);

    }

    public static boolean isEvenNumber(int num) {

        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}





















