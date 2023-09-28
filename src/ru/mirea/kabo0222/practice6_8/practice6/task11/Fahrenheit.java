package ru.mirea.kabo0222.practice6_8.practice6.task11;

public class Fahrenheit implements Convetable{
    public void convert(double degree)
    {
        System.out.println("В цельсиях: "+degree+"\nВ Фаренгейтах: "+((degree*(9/5)+32)));
    }
}
