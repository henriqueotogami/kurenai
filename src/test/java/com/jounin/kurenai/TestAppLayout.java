package com.jounin.kurenai;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestAppLayout extends Application {
    @Override
    public void start(final Stage primaryStage) throws Exception {
        System.out.println("TestAppLayout - start(): BEGIN");
        Parent root = null;
        final int widthScene = 800;
        final int heightScene = 600;

//        root = new TestAnchorPane();
//        root = new TestBorderPane();
        root = new TestFlowPane();
        final Scene mainScene = new Scene(root, widthScene, heightScene);

        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Layout Manager");
        primaryStage.show();
        System.out.println("TestAppLayout - start(): END");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
