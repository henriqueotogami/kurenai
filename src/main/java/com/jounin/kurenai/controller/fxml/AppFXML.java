package com.jounin.kurenai.controller.fxml;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppFXML extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("AppFXML - start(): BEGIN");
        primaryStage.show();
        System.out.println("AppFXML - start(): END");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
