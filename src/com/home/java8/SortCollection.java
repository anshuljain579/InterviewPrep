package com.home.java8;

import java.util.ArrayList;
import java.util.List;

class Person {
    int id;
    String name;
    int age;

    Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SortCollection {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "aa", 11));
        personList.add(new Person(2, "bb", 22));
        personList.add(new Person(3, "cc", 55));
        personList.add(new Person(4, "dd", 33));

        personList.sort((p1, p2) -> p1.getAge() - p2.getAge());
        personList.forEach((person -> System.out.println(person)));
    }
}
