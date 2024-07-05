package com.example.exeptions;

import javafx.application.Application;
import javafx.stage.Stage;

public class Thorws extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
            String names [] = {"Juan", "Pablo"};
            String newName = names[1];
            int numberOne=2;
            int numberTwo=0;
                try {
                    int split = numberOne/numberTwo;
                    System.out.println("NUMBER"+split);
                }catch (ArithmeticException e){
                    System.out.println("NUMBER");
                    System.out.println(e.getMessage());

                }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("sdasd");
        }
    }
}
