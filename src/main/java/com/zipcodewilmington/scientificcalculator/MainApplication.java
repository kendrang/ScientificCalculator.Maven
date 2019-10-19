package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
      /*  String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */
        //System.out.println("Please select a method: ");
        ;
        CoreMethods basic = new CoreMethods();
        double inputValue = Console.getDoubleInput("hey what would you liek to do \n Choose: \n 1 - Mulitply \n " +
                "2 - Square \n" +
                "3 - Power  \n" );

        if (inputValue == 1) {
            System.out.println("Multiply Time! ");
            double a = Console.getDoubleInput("Enter a Double");
            double b = Console.getDoubleInput("Enter a Double:");
            System.out.println(basic.calcMultiply(a, b));
        }

        if (inputValue == 2) {
            System.out.println("Square Time!");
            double a = Console.getDoubleInput("Enter a Double");
            System.out.println(basic.calcSquared(a)); }


    }
}

