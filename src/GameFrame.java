    import javax.swing.JFrame;

    public class GameFrame extends JFrame {

        private static final int WIDTH = 400;
        private static final int HEIGHT = 400;

        public GameFrame(GamePanel gamePanel) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Jumper Game");
            setSize(WIDTH, HEIGHT);
            setResizable(false);
            setLocationRelativeTo(null);

            add(gamePanel);

            setVisible(true);
        }

        public void start() {
            while (true) {
                // обновление состояния игры
                // перерисовка экрана
            }
        }
    }