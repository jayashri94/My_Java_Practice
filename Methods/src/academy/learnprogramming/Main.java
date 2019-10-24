package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScore("Vicky",position);
        int position2 = calculateHighScorePosition(900);
        displayHighScore("Niell",position2);
        int position3 = calculateHighScorePosition(400);
        displayHighScore("John",position3);
        int position4 = calculateHighScorePosition(50);
        displayHighScore("Richard",position4);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public  static void displayHighScore(String name, int position) {
        System.out.println(name+" managed to get into position "+position+" on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        }else if(score >= 500) {
//            return 2;
//        }else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;
        if (score >=1000){
            position =1;
        }else if(score >=500){
            position =2;
        }else if (score >= 100){
            position = 3;
        }

        return  position;
    }

}



