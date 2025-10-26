import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        StartGame game = new StartGame();

        game.displayInfo(s);
        StartGame.gameConfig(s, r);
    }
}
