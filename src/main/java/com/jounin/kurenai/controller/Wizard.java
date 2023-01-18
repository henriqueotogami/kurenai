package com.jounin.kurenai.controller;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {

    private Stage mainWindow;
    private Scene stepOne;
    private Scene stepTwo;
    private Scene stepThree;
    private Scene stepFour;


    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("Counter - start(): BEGIN");
        mainWindow = primaryStage;
        createStepOne();
        createStepTwo();
        createStepThree();
        mainWindow.setScene(stepOne);
        mainWindow.setTitle("Wizard :: Step One ");
        mainWindow.show();
        System.out.println("Counter - start(): END");
    }

    private void createStepOne(){
        System.out.println("Counter - createStepOne(): BEGIN");
        final Button buttonNextStep = new Button("Go to second step");

        buttonNextStep.setOnAction(
            event -> {
                mainWindow.setScene(stepTwo);
                mainWindow.setTitle("Wizard :: Step Two ");
            }
        );

        final HBox horizontalBox = new HBox();
        horizontalBox.setAlignment(Pos.CENTER);
        horizontalBox.getChildren().add(buttonNextStep);
        final int widthScene = 400;
        final int heightScene = 400;
        stepOne = new Scene(horizontalBox,widthScene,heightScene);
        System.out.println("Counter - createStepOne(): END");
    }

    private void createStepTwo() {
        System.out.println("Counter - createStepTwo(): BEGIN");
        final Button buttonPreviousStep = new Button("Back to first step");
        final Button buttonNextStep = new Button("Go to third step");

        buttonPreviousStep.setOnAction(
            event -> {
                mainWindow.setScene(stepOne);
                mainWindow.setTitle("Wizard :: Step One ");
            }
        );

        buttonNextStep.setOnAction(
            event -> {
             mainWindow.setScene(stepThree);
                mainWindow.setTitle("Wizard :: Step Three ");
            }
        );

        final HBox horizontalBox = new HBox();
        horizontalBox.setAlignment(Pos.CENTER);
        horizontalBox.getChildren().add(buttonPreviousStep);
        horizontalBox.getChildren().add(buttonNextStep);
        final int widthScene = 400;
        final int heightScene = 400;
        stepTwo = new Scene(horizontalBox,widthScene,heightScene);
        System.out.println("Counter - createStepTwo(): END");
    }
    private void createStepThree() {
        System.out.println("Counter - createStepThree(): BEGIN");
        final Button buttonPreviousStep = new Button("Back to second step");
        final Button buttonExit = new Button("Exit app");

        buttonPreviousStep.setOnAction(
                event -> {
                    mainWindow.setScene(stepTwo);
                    mainWindow.setTitle("Wizard :: Step Two ");
                }
        );

        buttonExit.setOnAction(
                event -> {
                    System.exit(0);
                }
        );

        final HBox horizontalBox = new HBox();
        horizontalBox.setAlignment(Pos.CENTER);
        horizontalBox.getChildren().add(buttonPreviousStep);
        horizontalBox.getChildren().add(buttonExit);
        final int widthScene = 400;
        final int heightScene = 400;
        stepThree = new Scene(horizontalBox,widthScene,heightScene);
        System.out.println("Counter - createStepThree(): END");
    }

    public static void main(final String[] args) {
        launch(args);
    }
}
