package com.jounin.kurenai.controller.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppFXML extends Application {
    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("AppFXML - start(): BEGIN");
        try {
            final String fileStyleCss = getClass().getResource("/Login.css").toString();
            System.out.println("AppFXML - start(): fileStyleCss: " + fileStyleCss);
            final URL fileConfigurationFXML = getClass().getResource("/Login.fxml");
            System.out.println("AppFXML - start(): fileConfigurationFXML: " + fileConfigurationFXML.toString());
            final GridPane root = FXMLLoader.load(fileConfigurationFXML);
            final int widthScene = 350;
            final int heightScene = 350;
            final Scene mainScene = new Scene(root,widthScene,heightScene);
            mainScene.getStylesheets().add(fileStyleCss);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Login Screen");
            primaryStage.setScene(mainScene);
            primaryStage.show();
        } catch (final IOException ioException) {
            ioException.getStackTrace();
            throw new RuntimeException(ioException);
        }
        System.out.println("AppFXML - start(): END");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
