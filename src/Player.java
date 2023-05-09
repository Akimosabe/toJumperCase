import java.awt.Color;
import java.awt.Graphics;

public class Player {
    private int x, y; // координаты игрока
    private int width, height; // ширина и высота игрока
    private int velocityY; // скорость вертикального движения игрока
    private int gravity; // ускорение свободного падения
    private boolean isJumping; // флаг, указывающий на то, прыгает ли игрок в данный момент
    private Color color; // цвет игрока

    public Player(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.velocityY = 0;
        this.gravity = 1;
        this.isJumping = false;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public void jump() {
        if (!isJumping) {
            velocityY = -20; // задаем начальную скорость прыжка
            isJumping = true;
        }
    }

    public void update() {
        // обновляем координаты игрока
        y += velocityY;
        velocityY += gravity;

        // проверяем, достиг ли игрок земли
        if (y >= 300 - height) {
            isJumping = false;
            y = 300 - height;
            velocityY = 0;
        }
    }

    // геттеры и сеттеры для всех полей
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public boolean isJumping() {
        return isJumping;
    }

    public void setJumping(boolean isJumping) {
        this.isJumping = isJumping;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}