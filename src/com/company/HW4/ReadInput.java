package com.company.HW4;


import java.util.Scanner;

public class ReadInput {

    private static String ReadInput() {
        Scanner Input = new Scanner(System.in);
        return Input.nextLine();
    }

    public static String readName(){
        String name;
        int minLen = 4;
        System.out.println("Enter name (more then 4 symbols):");
        do {
            name = ReadInput();
            if (name.length() <= minLen) {
                System.out.println("Invalid name. Please enter name more then 4 symbols:");
            }
        } while(name.length() <= minLen);
        return name;
    }

    public static int readAge(){
        int age;
        int minAge = 0, maxAge = 100;
        String tmpAge;
        System.out.println("Enter age [1..99]:");
        do {
            tmpAge = ReadInput();
            if (tmpAge.matches("\\d+")) {
                age = Integer.parseInt(tmpAge);
            } else
                age = 0;
            if (age <= minAge || age >= maxAge) {
                System.out.println("Invalid age. Please enter age [1..99]:");
            }
        } while (age <= minAge || age >= maxAge);
        return age;
    }
}
