package com.jounin.kurenai.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ManagerLayouts extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("ManagerLayouts - start(): BEGIN");
        final VBox verticalBox = new VBox();

//        verticalBox.getChildren().add(new HorizontalBox().withText("One"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Two"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Three"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Four"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Five"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Six"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Seven"));
//        verticalBox.getChildren().add(new HorizontalBox().withText("Eight"));

        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());
        verticalBox.getChildren().add(new Square());

        final int widthScene = 800;
        final int heightScene = 600;
        final Scene mainWindow = new Scene(verticalBox, widthScene, heightScene);
        primaryStage.setScene(mainWindow);
        primaryStage.setTitle("ManagerLayouts");
        primaryStage.show();
        System.out.println("ManagerLayouts - start(): END");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
