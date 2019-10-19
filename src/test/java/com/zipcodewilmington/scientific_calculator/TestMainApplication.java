package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    // TESTING MULTIPLICATION
    @Test
    public void testcalcMultiply (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 2;
        int b = 4;
        Integer expected = 8;
        //when
        Integer outcome = mainApplication.calcMultiply(a,b);
        //then
        Assert.assertEquals(expected,outcome); }

        @Test
        public void testcalcMultiply2 (){
            //given
            MainApplication mainApplication = new MainApplication();
            int a = 5;
            int b = 5;
            Integer expected = 25;
            //when
            Integer outcome = mainApplication.calcMultiply(a,b);
            //then
            Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcMultiply3 (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 10;
        int b = 5;
        Integer expected = 50;
        //when
        Integer outcome = mainApplication.calcMultiply(a,b);
        //then
        Assert.assertEquals(expected,outcome); }

//TESTING THE SQUARE OF A NUMBER
    @Test
    public void testcalcSquared (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 10;
        Integer expected = 100;
        //when
        Integer outcome = mainApplication.calcSquared(a);
        //then
        Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcSquared2 (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 5;
        Integer expected = 25;
        //when
        Integer outcome = mainApplication.calcSquared(a);
        //then
        Assert.assertEquals(expected,outcome); }

    @Test
    public void testcalcSquared3 (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 2;
        Integer expected = 4;
        //when
        Integer outcome = mainApplication.calcSquared(a);
        //then
        Assert.assertEquals(expected,outcome); }

        //TESTING TO THE POWER

    @Test
    public void testcalcToPower (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 2;
        int b = 2;
        int expected = 4;
        //when
        int outcome = mainApplication.calcToPower(a,b);
        //then
        Assert.assertEquals(expected,outcome);}

    @Test
    public void testcalcToPower2 (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 5;
        int b = 5;
        int expected = 3125;
        //when
        int outcome = mainApplication.calcToPower(a,b);
        //then
        Assert.assertEquals(expected,outcome);}

    @Test
    public void testcalcToPower3 (){
        //given
        MainApplication mainApplication = new MainApplication();
        int a = 4;
        int b = 3;
        int expected = 64;
        //when
        int outcome = mainApplication.calcToPower(a,b);
        //then
        Assert.assertEquals(expected,outcome);}

    }




