import java.util.*;

public class StartGame implements StartInfo {

    public static final int EASY_MAX = 50;
    public static final int MEDIUM_MAX = 100;
    public static final int HARD_MAX = 200;

    public static final int EASY_TRIES = 10;
    public static final int MEDIUM_TRIES = 8;
    public static final int HARD_TRIES = 6;

    private static int MaxRange = EASY_MAX;
    private static int MaxTries = EASY_TRIES;

    public static int getMaxRange() {
        return MaxRange;
    }

    public static void setMaxRange(int maxRange) {
        MaxRange = maxRange;
    }

    public static int getMaxTries() {
        return MaxTries;
    }

    public static void setMaxTries(int maxTries) {
        MaxTries = maxTries;
    }

    public static void gameConfig(Scanner s, Random r) {

        int Difficulty = s.nextInt();

        if (Difficulty == 2) { setMaxRange(MEDIUM_MAX); setMaxTries(MEDIUM_TRIES); }
        else if (Difficulty == 3) { setMaxRange(HARD_MAX); setMaxTries(HARD_TRIES); }

        int num = r.nextInt(getMaxRange()) + 1;

        boolean win = false;
        int attempt = 0;

        while(!win && attempt < getMaxTries()) {
            System.out.print("Guess: ");
            int guess = s.nextInt();
            attempt++;
            if(guess == num) {
                win = true;
                System.out.println("Correct!");
            } else if(guess > num) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        if(!win) System.out.println("You lost! The number was " + num);
    }
    @Override
    public void displayInfo(Scanner s){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Choose difficulty: 1-Easy, 2-Medium, 3-Hard");
        System.out.println("Choose : ");
    }
}
