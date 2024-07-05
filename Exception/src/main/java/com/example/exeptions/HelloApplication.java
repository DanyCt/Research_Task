package com.example.exeptions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
     //Metodo
    public static void main(String[] args) {
        //try debe estar dentro de un metodo por simple logica


         try {
             String names [] = {"Juan", "Pablo"};
             String lastNameArray = names[2];

         }catch (ArrayIndexOutOfBoundsException e){ //Expection nos limita que exepcion es
                System.out.println("The closet exist on array");

             }finally {
             System.out.println("There is an issue please check");
         }
       }
    }
