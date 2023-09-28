package ru.mirea.kabo0222.practice6_8.practice6.task1and2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,1,1);
        MovablePoint point1 = new MovablePoint(5,10,3,3);
        MovablePoint point2 = new MovablePoint(10,7,3,3);
        MovableCircle circle = new MovableCircle(5, point);
        MovableRectangle rectangle = new MovableRectangle(point1, point2);
        circle.MoveDown();
        circle.MoveLeft();
        System.out.println(circle.toString());
        rectangle.MoveDown();
        rectangle.MoveRight();
        System.out.println(rectangle.toString()); // при разных xSpeed и ySpeed
                                                // координаты не меняются
    }
}
