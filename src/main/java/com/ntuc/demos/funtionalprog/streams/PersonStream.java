
package com.ntuc.demos.funtionalprog.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PersonStream {
    public static void main(String args[]) {
        List<Person> people = List.of(
                new Person("John", Person.Gender.MALE),
                new Person("Maria", Person.Gender.FEMALE),
                new Person("Jenny", Person.Gender.FEMALE),
                new Person("Alex", Person.Gender.MALE),
                new Person("Alice", Person.Gender.FEMALE)
        );

        // Printing the names using PersonStream
        people.stream()
                .map(person -> person.getName()) //Get all Names
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Printing the lengths of names using PersonStream
        people.stream()
                .map(person -> person.getName())
                .mapToInt(name -> name.length())
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        
        // Printing the list of Genders using streams
        people.stream()
                .map(person -> person.getGender())// Get all genders
                .collect(Collectors.toSet())// filling Genders into a set which removes duplicates
                .forEach(System.out::println); //print the set
    }
}
