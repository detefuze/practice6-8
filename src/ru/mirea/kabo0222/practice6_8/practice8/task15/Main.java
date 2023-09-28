package ru.mirea.kabo0222.practice6_8.practice8.task15;
public class Main {

    static void recursion(int N)
    {
        if (N/10==0)
        {
            System.out.println(N%10);
            return;
        }
        System.out.println(N%10);
        recursion(N/10);
    }
    public static void main(String[] args) {
        Main.recursion(123456);
    }
}
