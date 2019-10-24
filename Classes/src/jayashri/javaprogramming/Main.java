package jayashri.javaprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car benz = new Car();

        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());

        benz.setModel("benzModel");
        System.out.println("Model is " + benz.getModel());

    }
}
