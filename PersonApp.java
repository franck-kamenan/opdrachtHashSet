package be.intecbrussel.opdrachten.opdracht2;

import java.util.*;

public class PersonApp {

    public static void main(String[] args) {

        Collection<Person> personCol = new HashSet<>();

        Person p1 = new Person("Jean-Marie", 73, 175);
        Person p2 = new Person("Jean-Luc", 37, 185);
        Person p3 = new Person("Jean-Luc", 37, 185);
        Person p4 = new Person("Jean-Val-Jean", 53, 177);

        personCol.add(p1);
        personCol.add(p2);
        personCol.add(p3);
        personCol.add(p4);

        personCol.forEach(System.out::println);
        System.out.println(p2.equals(p3));
    }
}
