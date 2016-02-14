package com.company;


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3 {
    public static void main (String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        int [] mass = new int [5];
        int a;
        System.out.println("Please, enter a number < 10");

        for (int i = 0; i < mass.length; i++)
        {
            do
            {
                try
                {
                    a = Scanner.nextInt();
                    if (a >= 10) {
                        System.out.println("Sorry, wrong number entered.");
                        System.out.println("Please, try again.");
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Please, enter a number.");
                    Scanner = new Scanner(System.in);
                    a = 10;
                }
            }
            while(a >= 10);
            mass[i] = a;
        }
        System.out.println("Storage is full");
        System.out.println(Arrays.toString(mass));
    }
}
