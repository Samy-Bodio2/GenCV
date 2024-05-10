package com.samydev.gencv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Screen screen = Screen.getPrimary();
        double screenWidth = screen.getBounds().getWidth();
        double screenHeight = screen.getBounds().getHeight();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main-Page.fxml"));
        System.out.println( screenWidth);
        Scene scene = new Scene(fxmlLoader.load(), screenWidth,screenHeight -66 );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}