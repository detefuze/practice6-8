package ru.mirea.kabo0222.practice6_8.practice8.task13;
import java.util.*;
import java.util.stream.IntStream;
public class Main {
    private static void recursion()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0)
        {
            return;
        }
        String a = Arrays.toString(Thread.currentThread().getStackTrace());
        String findStr = "Main.recursion";
        recursion();
        if ((a.split(findStr, -1).length-1) % 2 == 1)
        {
            System.out.println(num);
        }
    }


    public static void main(String[] args){Main.recursion();}
}