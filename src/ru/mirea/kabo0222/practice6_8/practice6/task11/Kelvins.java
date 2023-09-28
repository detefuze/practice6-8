package ru.mirea.kabo0222.practice6_8.practice6.task11;

public class Kelvins implements Convetable {
    public void convert(double degree)
    {
        System.out.println("В цельсиях: "+degree+"\nВ кельвинах: "+(degree+273.15));
    }
}
