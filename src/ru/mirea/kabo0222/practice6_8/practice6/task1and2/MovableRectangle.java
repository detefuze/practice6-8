package ru.mirea.kabo0222.practice6_8.practice6.task1and2;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public void MoveUp() {
        if (topLeft.getySpeed() == bottomRight.getySpeed())
        {
            topLeft.MoveUp();
            bottomRight.MoveUp();
        }
    }

    @Override
    public void MoveDown() {
        if (topLeft.getySpeed() == bottomRight.getySpeed())
        {
            topLeft.MoveDown();
            bottomRight.MoveDown();
        }
    }

    @Override
    public void MoveRight() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed())
        {
            topLeft.MoveRight();
            bottomRight.MoveRight();
        }
    }

    @Override
    public void MoveLeft() {
        if (topLeft.getxSpeed() == bottomRight.getxSpeed())
        {
            topLeft.MoveLeft();
            bottomRight.MoveLeft();
        }
    }

    @Override
    public String toString() {
        return "MoveRectangle{" +
                "point1=" + topLeft +
                ", point2=" + bottomRight +
                '}';
    }
}
