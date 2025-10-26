import java.util.Random;
import java.util.Scanner;

/**
 * The {@code MainApp} class serves as the entry point for the Number Guessing Game application.
 * <p>
 * It initializes the {@link StartGame} object and handles the initial setup by
 * displaying game information and configuring the difficulty level.
 * </p>
 */

public class MainApp {

    /**
     * The main method starts the Number Guessing Game.
     *
     * @param args command-line arguments (not used in this application)
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        StartGame game = new StartGame();

        // Display the game intro and difficulty options
        game.displayInfo(s);

        // Configure and start the game based on user input
        StartGame.gameConfig(s, r);
    }
}
