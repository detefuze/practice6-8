package ru.mirea.kabo0222.practice6_8.practice6.task1and2;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xSpeed;
    private final int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public int getxSpeed() {return xSpeed;}

    public int getySpeed() {return ySpeed;}

    public void setX(int x) {this.x = x;}

    public void setY(int y) {this.y = y;}

    @Override
    public void MoveUp() {
        this.y += ySpeed;
    }

    @Override
    public void MoveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void MoveRight() {
        this.x += xSpeed;
    }

    @Override
    public void MoveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
