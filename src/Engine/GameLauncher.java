package Engine;

/**
 * Created by Luke_Simmonds on 5/28/15.
 */
public class GameLauncher {
    public static void main(String[] args) {
        new GameEngine("Connect Four", 1, 640, GameEngine.Square, 1, 60).start();
    }
}
