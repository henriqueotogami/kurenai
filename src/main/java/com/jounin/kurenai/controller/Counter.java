package com.jounin.kurenai.controller;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("Counter - start(): BEGIN");

        final Label labelTitle = new Label("Counter");
        final Label labelNumber = new Label("0");

        final Button buttonIncrement = new Button("+");
        final Button buttonDecrement = new Button("-");

        final HBox horizontalBox = new HBox();
        horizontalBox.setAlignment(Pos.CENTER);
        horizontalBox.setSpacing(10);
        horizontalBox.getChildren().add(buttonDecrement);
        horizontalBox.getChildren().add(buttonIncrement);

        final VBox mainVerticalBox = new VBox();
        mainVerticalBox.setAlignment(Pos.CENTER);
        mainVerticalBox.setSpacing(10);
        mainVerticalBox.getChildren().add(labelTitle);
        mainVerticalBox.getChildren().add(labelNumber);
        mainVerticalBox.getChildren().add(horizontalBox);

        final int widthScene = 400;
        final int heightScene = 400;
        final Scene mainScene = new Scene(mainVerticalBox, widthScene,heightScene);

        primaryStage.setScene(mainScene);
        primaryStage.show();
        System.out.println("Counter - start(): END");
    }

    public static void main(final String[] args) {
        launch(args);
    }
}
