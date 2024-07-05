package com.example.exeptions;

public class Example_2 {

    public static void main(String[] args) {

        int NumberFruit [] = {23,45,56,78} ;
        try {
            System.out.println("The number of fruits in posicion 4 is: "+ NumberFruit[4]);
        } catch (Exception e) {
            System.out.println("You tried to access a position that does not exist!");
        }finally {
            System.out.println("Execution completed");
        }
    }
}

