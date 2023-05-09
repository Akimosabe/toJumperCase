import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Platform platform = new Platform(0, 350, 400, 50, Color.GRAY);
        Player player = new Player(50, 300, 50, 50, Color.RED);
        GamePanel gamePanel = new GamePanel(platform, player);
        GameManager gameManager = new GameManager(gamePanel, player, platform);

        GameFrame gameFrame = new GameFrame(gamePanel);
        gameFrame.start();

        gameManager.start();
    }
}