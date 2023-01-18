package com.jounin.kurenai;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestAppLayout extends Application {
    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("TestAppLayout - start(): BEGIN");
        final int widthScene = 800;
        final int heightScene = 600;
        final Scene mainScene = new Scene(new TestAnchorPane(), widthScene, heightScene);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Layout Manager");
        primaryStage.show();
        System.out.println("TestAppLayout - start(): END");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
