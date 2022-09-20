
package com.ntuc.demos.funtionalinterface;

import java.util.function.Consumer;


public class ConsumerFunction1 {
    public static void main(String[] args) {
      User ram = new User("Ramya", 90909090);
      greetUser.accept(ram);
    }
    
    static Consumer<User> greetUser = user ->
            System.out.println("Hello "+user.userName
            + " Thanks for registering with phone "
            + user.phone);
    }
