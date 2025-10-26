import java.util.Scanner;

/**
 * The {@code StartInfo} interface defines the contract for displaying
 * introductory game information and settings to the user.
 */
public interface StartInfo {

    /**
     * Displays the initial game information and prompts for difficulty selection.
     *
     * @param s Scanner object for reading user input
     */
    void displayInfo(Scanner s);
}
