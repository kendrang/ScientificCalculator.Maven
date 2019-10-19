package com.zipcodewilmington.scientificcalculator;

public class CoreMethods {

    public CoreMethods(){

    }

    public  double calcMultiply (double a , double b ){
        return a * b ;
    }

    public static double calcSquared (double a){
        return a * a; }

    public static double calcToPower (Integer a , Integer b){
        return (int) Math.pow(a,b); }

    public static double calcDiv(Integer a, Integer b) {
        Integer div = a / b;
        return div; }

    public static double calcSqrt (double a) {
        Double sqrt = Math.sqrt(a);
        return sqrt; }

    public static double calcInverse(double a) {
        double inverse = 1 / a;
        return inverse; }

    public static double calcAdd (double a, double b) {
        double add = a + b;
        return add; }
    public static double calcSub (double a, double b) {
        double sub = a - b;
        return sub; }

    public static double calcPosNeg (double a) {
        double posneg = (a * -1);
        return posneg;
    }
}

