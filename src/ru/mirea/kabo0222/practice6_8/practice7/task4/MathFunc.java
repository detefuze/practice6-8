package ru.mirea.kabo0222.practice6_8.practice7.task4;
public class MathFunc implements MathCalculable {
    @Override
    public double POW(double num, double n) {
        return Math.pow(num,n);
    }

    @Override
    public double ABS(double num) {
        return Math.abs(num);
    }

    public static void main(String[] args) {
        MathCalculable object = new MathFunc();
        System.out.println(object.PI*object.POW(3,2)/ object.ABS(-4));
    }
}
