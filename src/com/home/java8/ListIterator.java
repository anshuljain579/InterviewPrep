package com.home.java8;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> notes = new ArrayList<>();
        notes.add("note1");
        notes.add("note2");
        notes.add("note3");
        notes.add("note4");

        //Using lambda expression
        notes.forEach(note -> System.out.println(note));
        System.out.println("-----");
        //Using Stream and filter
        notes.stream().forEach(note -> System.out.println(note));
        System.out.println("-----");
        //Using method reference
        notes.forEach(System.out::println);
    }
}
