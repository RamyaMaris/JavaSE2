
package com.ntuc.demos.funtionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerFunction {
    public static void main(String[] args) {
        User ram = new User("Ramya",90909090);
        greetUser.accept(ram, Boolean.TRUE);
        greetUser.accept(ram, Boolean.FALSE);
    }
    //BiConsumer accepts 2 arguments
    static BiConsumer<User, Boolean> greetUser = (user, shownum)
            -> System.out.println("Hello " + user.userName
            + " Thanks for registering with phone "
            + (shownum ? user.phone: "**********"));
}
