package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("22000","Mac","240",dimensions);

        Monitor theMonitor = new Monitor("Retina","Mac",13,
                new Resolution(2450,2450));

        MotherBoard theMotherBoard = new MotherBoard("IC78294","Apple",
                4,8,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);

        thePC.powerUp();

//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//
//        thePC.getMotherBoard().loadProgram("Catolina");
//
//        thePC.getTheCase().pressPowerButton();


    }
}
