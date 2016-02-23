package com.company.HW4;


public class OOP {
    public static void main (String[] args){
        Storage storage = new Storage();
        ReadInput input = new ReadInput();

    while (!storage.isFull()) {
        String name = input.readName();
        int age = input.readAge();
        Person person = new Person(name, age);
        storage.add(person);
    }
        System.out.println(storage);
    }
}
