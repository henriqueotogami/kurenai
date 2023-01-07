package com.jounin.kurenai.controller;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FirstAppFX extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("FirstAppFX - start(): BEGIN");

        final Button buttonLetterA = new Button("A");
        final Button buttonLetterB = new Button("B");
        final Button buttonLetterC = new Button("C");

        buttonLetterA.setOnAction(event -> System.out.println("Letter A was pressed."));
        buttonLetterB.setOnAction(event -> System.out.println("Letter B was pressed."));
        buttonLetterC.setOnAction(event -> System.exit(0));

        final HBox horizontalBox = new HBox();
        horizontalBox.setAlignment(Pos.CENTER);
        horizontalBox.getChildren().add(buttonLetterA);
        horizontalBox.getChildren().add(buttonLetterB);
        horizontalBox.getChildren().add(buttonLetterC);

        final int widthScene = 100;
        final int heightScene = 400;
        final Scene uniqueScene = new Scene(horizontalBox,widthScene,heightScene);

        primaryStage.setScene(uniqueScene);
        primaryStage.show();
        System.out.println("FirstAppFX - start(): END");
    }

    public static void main(String[] args) { launch(); }
}
