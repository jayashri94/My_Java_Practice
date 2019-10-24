package jayashri.javaprogramming;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";

    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats a lot of people";
    }

}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempts to invade earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids tries and escapes maze";
    }
}

class Starwars extends Movie{
    public Starwars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial force try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

}

public class Main {


    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("Random number generated was: "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }

       // return null;

    }

    public static void main(String[] args) {

        for(int i = 0; i <11; i++){
            Movie movie = randomMovie();

            System.out.println("Movie #"+i+" : "+movie.getName()+
                    "\n"+"Plot: "+movie.plot()+"\n");

        }


    }


}


















