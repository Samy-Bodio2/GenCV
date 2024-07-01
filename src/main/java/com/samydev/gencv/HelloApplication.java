package com.samydev.gencv;

import com.itextpdf.text.DocumentException;
import com.samydev.gencv.Service.GeneratePdf;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javafx.stage.Stage;
import java.io.IOException;

@SpringBootApplication
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, DocumentException {
        Screen screen = Screen.getPrimary();
        double screenWidth = screen.getBounds().getWidth();
        double screenHeight = screen.getBounds().getHeight();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Create-Page.fxml"));
        System.out.println( screenWidth);
        Scene scene = new Scene(fxmlLoader.load(), 600,400 );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        GeneratePdf gn = new GeneratePdf();
        gn.genCvPdf();
    }

    public static void main(String[] args) {
        launch();
    }
}