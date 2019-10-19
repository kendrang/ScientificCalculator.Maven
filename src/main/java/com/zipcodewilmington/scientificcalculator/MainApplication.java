package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);


    }
    public static Integer calcMultiply (Integer a , Integer b ){
        return a * b ;
    }
    public static Integer calcSquared (Integer a){
        return a * a;
    }
    public static int calcToPower (Integer a , Integer b){
        return (int) Math.pow(a,b);
    }

}
// multiply x^y and x^2


