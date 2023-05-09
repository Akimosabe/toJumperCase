import java.awt.Color;

public class GameManager {
    private GamePanel gamePanel;
    private Player player;
    private Platform platform;
    private boolean gameOver;

    public GameManager(GamePanel gamePanel, Player player, Platform platform) {
        this.gamePanel = gamePanel;
        this.player = player;
        this.platform = platform;
        this.gameOver = false;
    }

    public void start() {
        while (!gameOver) {
            update();
            gamePanel.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        player.jump();
        checkCollisions();
    }

    private void checkCollisions() {
        if (player.getY() + player.getHeight() >= platform.getTopY() &&
                player.getY() + player.getHeight() <= platform.getTopY() + platform.getHeight() &&
                player.getX() + player.getWidth() >= platform.getX() &&
                player.getX() <= platform.getX() + platform.getWidth()) {
            // Игрок на платформе
        } else if (player.getY() >= gamePanel.getHeight()) {
            // Игрок упал вниз
            gameOver = true;
        }
    }

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