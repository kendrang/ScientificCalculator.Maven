package com.zipcodewilmington.scientificcalculator;

public class CoreMethods {

    public CoreMethods(){}
//1 calcMultiply
    public  double calcMultiply (double a , double b ){
        return a * b ; }
//2 calcSquared
    public static double calcSquared (double a){
        return a * a; }
//3 calcToPower
    public static Double calcToPower (Double a , Double b){
        return Math.pow(a,b); }
//4 calcDiv
    public static Double calcDiv(Double a, Double b) {
        return a / b; }
//5 calcSqrt
    public static Double calcSqrt (Double a) {
        return Math.sqrt(a); }
//6 calcInverse
    public static Double calcInverse(Double a) {
        return 1 / a; }
//7 calcAdd
    public static Double calcAdd (Double a, Double b) {
        return a + b; }
//8 calcSub
    public static Double calcSub (Double a, Double b) {
        return a - b; }
//9 calcPosNeg
    public static Double calcPosNeg (Double a) {
        return a * -1; }
}

