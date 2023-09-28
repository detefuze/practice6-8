package ru.mirea.kabo0222.practice6_8.practice6.task11;

public class Main {
    public static void main(String[] args) {
        double degree = 24;
        Kelvins kelvins = new Kelvins();
        Fahrenheit fahrenheit = new Fahrenheit();
        kelvins.convert(degree);
        fahrenheit.convert(degree);
    }
}
