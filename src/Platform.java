import java.awt.Color;

public class Platform {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Platform(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public int getTopY() {
        return getY() - getHeight();
    }
}