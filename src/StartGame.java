import java.util.*;

/**
 * The {@code StartGame} class implements the core logic for the Number Guessing Game.
 * <p>
 * It manages difficulty levels, player attempts, and provides feedback
 * for each guess. The player wins by correctly guessing the random number within
 * a limited number of tries.
 * </p>
 */

public class StartGame implements StartInfo {

    /** Maximum range for Easy difficulty */
    public static final int EASY_MAX = 50;

    /** Maximum range for Medium difficulty */
    public static final int MEDIUM_MAX = 100;

    /** Maximum range for Hard difficulty */
    public static final int HARD_MAX = 200;

    /** Maximum allowed attempts for Easy difficulty */
    public static final int EASY_TRIES = 10;

    /** Maximum allowed attempts for Medium difficulty */
    public static final int MEDIUM_TRIES = 8;

    /** Maximum allowed attempts for Hard difficulty */
    public static final int HARD_TRIES = 6;

    /** Current maximum range depending on difficulty */
    private static int MaxRange = EASY_MAX;

    /** Current maximum number of tries depending on difficulty */
    private static int MaxTries = EASY_TRIES;

    /**
     * Gets the current maximum range for the guessing number.
     *
     * @return current maximum number range
     */
    public static int getMaxRange() {
        return MaxRange;
    }

    /**
     * Sets the maximum range based on the chosen difficulty level.
     *
     * @param maxRange new maximum range value
     */
    public static void setMaxRange(int maxRange) {
        MaxRange = maxRange;
    }

    /**
     * Gets the current maximum number of tries allowed.
     *
     * @return current maximum tries
     */
    public static int getMaxTries() {
        return MaxTries;
    }

    /**
     * Sets the maximum number of tries based on the chosen difficulty level.
     *
     * @param maxTries new maximum tries value
     */
    public static void setMaxTries(int maxTries) {
        MaxTries = maxTries;
    }

    /**
     * Configures the game based on user-selected difficulty, generates a random number,
     * and runs the guessing loop until the player wins or runs out of attempts.
     *
     * @param s Scanner object for user input
     * @param r Random object for generating the secret number
     */
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

    /**
     * Displays introductory information and difficulty options to the user.
     *
     * @param s Scanner object for user input
     */
    @Override
    public void displayInfo(Scanner s){
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Choose difficulty: 1-Easy, 2-Medium, 3-Hard");
        System.out.println("Choose : ");
    }
}
