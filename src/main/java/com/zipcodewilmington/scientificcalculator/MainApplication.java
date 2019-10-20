package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
      /*  String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter your number:.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */
        //System.out.println("Please select a method: ");
        ;
        CoreMethods basic = new CoreMethods();
        double inputValue = Console.getDoubleInput("What can I help you with Today? \n Choose: \n 1 - Mulitply \n "
                + "2 - Square \n" + "3 - Power  \n" + "4 - Division \n" + "5 - Square Root \n" + "6 - Inverse \n" +
                "7 - Add \n" + "8 - Subtract \n " + "9 - Neg or Pos \n"  );

        if (inputValue == 1) {
            System.out.println("Multiply Time! ");
            double a = Console.getDoubleInput("Enter your number:");
            double b = Console.getDoubleInput("Enter your number::");
            System.out.println(basic.calcMultiply(a, b));
        }

        if (inputValue == 2) {
            System.out.println("Square Time!");
            double a = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcSquared(a)); }

        if (inputValue == 3) {
            System.out.println("Power Time!");
            double a = Console.getDoubleInput("Enter your number:");
            double b = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcToPower(a,b)); }

        if (inputValue == 4) {
            System.out.println("Division Time!");
            double a = Console.getDoubleInput("Enter your number:");
            double b = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcDiv(a,b)); }

        if (inputValue == 5) {
            System.out.println("Square Root Time!");
            double a = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcSqrt(a)); }

        if (inputValue == 6) {
            System.out.println("Inverse Time!");
            double a = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcSqrt(a)); }

        if (inputValue == 7) {
            System.out.println("Addition Time!");
            double a = Console.getDoubleInput("Enter your number:");
            double b = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcAdd(a,b)); }

        if (inputValue == 8) {
            System.out.println("Subtraction Time!");
            double a = Console.getDoubleInput("Enter your number:");
            double b = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcSub(a,b)); }

        if (inputValue == 9) {
            System.out.println("Negative or Positive Time!");
            double a = Console.getDoubleInput("Enter your number:");
            System.out.println(basic.calcPosNeg(a)); }

        }
    }


