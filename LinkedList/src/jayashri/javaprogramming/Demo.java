package jayashri.javaprogramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList <String> placeToVisit = new LinkedList<String>();

        addInOrder(placeToVisit,"New York");
        addInOrder(placeToVisit,"Sydney");
        addInOrder(placeToVisit,"London");
        addInOrder(placeToVisit,"Paris");
        addInOrder(placeToVisit,"Moscow");
        addInOrder(placeToVisit,"Mexico");
        //printList(placeToVisit);

        addInOrder(placeToVisit,"Singapore");
        addInOrder(placeToVisit,"Paris");
        //printList(placeToVisit);
        visit(placeToVisit);


//        placeToVisit.add("Sydney");
//        placeToVisit.add("New york");
//        placeToVisit.add("London");
//        placeToVisit.add("Paris");
//        placeToVisit.add("Moscow");
//        placeToVisit.add("Mexico");
//
//        printList(placeToVisit);
//
//        placeToVisit.add(2,"Los Angeles");
//
//        printList(placeToVisit);
//        printList(placeToVisit);
//
//        placeToVisit.remove(4);
//        printList(placeToVisit);


    }

    private static void printList(LinkedList<String> linkedList){
        Iterator <String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());

        }
        System.out.println("==================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator <String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){

            int comparison = stringListIterator.next().compareTo(newCity);

            if(comparison == 0){
                System.out.println(newCity+" is already included in destination");
                return false;

            }else if(comparison > 0){
                //new city appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move new city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();

        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (vacation) over");
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                    }
                    goingForward = false;

                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else {
                        System.out.println("we are at the start of the list");
                        goingForward= true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }

            }

    }
    private static void printMenu(){
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit \n"+
                "1 - go to next city \n"+
                "3 - print menu options");
    }
}












