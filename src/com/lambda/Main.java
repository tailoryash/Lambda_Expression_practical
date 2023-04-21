package com.lambda;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        1st way to define lambda expression
//        MyInterface myInter = (int a, int b) -> {
//            return a + b;
//        };
//        System.out.println(myInter.addition(5, 10));
//        2nd way to define lambda expression

        MyInterface myInter = (a, b) -> a + b;
        System.out.println("Addition : " + myInter.addition(5, 10));
    }
}