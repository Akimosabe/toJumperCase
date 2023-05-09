import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Platform platform;
    private Player player;

    public GamePanel(Platform platform, Player player) {
        this.platform = platform;
        this.player = player;

        // Устанавливаем размер панели
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Рисуем платформу
        g.setColor(platform.getColor());
        g.fillRect(platform.getX(), platform.getTopY(), platform.getWidth(), platform.getHeight());

        // Рисуем игрока
        g.setColor(player.getColor());
        g.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());
    }
}