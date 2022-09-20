
package com.ntuc.demos.funtionalprog.streams;

public class Person {
     private final String Name;
    private final Gender gender;

    public Person(String Name, Gender gender) {
        this.Name = Name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", gender=" + gender + '}';
    }

    enum Gender {
        MALE, FEMALE;
    }

    class FEMALE {

        public FEMALE() {
        }
    }
}
