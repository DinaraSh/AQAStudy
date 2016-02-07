package com.company;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        Scanner Scanner2 = new Scanner(System.in);

        System.out.println("Enter first number");
                int a = Scanner.nextInt();

        System.out.println("Enter second number");
                int b = Scanner.nextInt();

        System.out.println("Enter operation(+,-,*,/)");
                String op = Scanner2.nextLine();
        System.out.println(op);

        if (op.equals("+"))
        {
            System.out.println("Sum of numbers = "+ (a + b));
        }
        else if (op.equals("-"))
        {
            System.out.println("Difference of numbers = " + (a - b));
        }
        else if (op.equals("*"))
        {
            System.out.println("Composition of numbers = " + (a * b));
        }
        else if (op.equals("/"))
        {
            System.out.println("Division of numbers = " + (a / b));
        }
        else
            System.out.println("Wrong operation");
    }
}
