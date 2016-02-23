package com.company.HW4;


import java.util.Arrays;

public class Storage {
    int a = 5;
    Person[] arrPerson = new Person[a];
    static int cnt = 0;

    public void add(Person person) {
        arrPerson[cnt] = person;
        cnt++;
        System.out.println("Person " + person + " was added to storage.");
    }

    public boolean isFull(){
        return a <= cnt;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "arrPerson=" + Arrays.toString(arrPerson) +
                '}';
    }
}


