package com.jounin.kurenai;

import com.jounin.kurenai.view.HorizontalBox;
import javafx.scene.layout.StackPane;

public class TestStackPane extends StackPane {

    public TestStackPane() {
    System.out.println("TestStackPane - TestStackPane(): BEGIN");
    final HorizontalBox horizontalBoxOne = new HorizontalBox().withText("One");
    final HorizontalBox horizontalBoxTwo = new HorizontalBox().withText("Two");
    final HorizontalBox horizontalBoxThree = new HorizontalBox().withText("Three");
    final HorizontalBox horizontalBoxFour = new HorizontalBox().withText("Four");
    final HorizontalBox horizontalBoxFive = new HorizontalBox().withText("Five");
    final HorizontalBox horizontalBoxSix = new HorizontalBox().withText("Six");

    getChildren().addAll(
        horizontalBoxTwo,
        horizontalBoxThree,
        horizontalBoxFour,
        horizontalBoxFive,
        horizontalBoxSix,
        horizontalBoxOne
    );

    this.setOnMouseClicked(
        event -> {
         if(event.getSceneX() > (getScene().getWidth()/2)) {
             System.out.println("TestStackPane - TestStackPane() - setOnMouseClicked: RIGHT");
             final int lastElementToBeFirst = 0;
             getChildren().get(lastElementToBeFirst).toFront();
         } else {
             System.out.println("TestStackPane - TestStackPane() - setOnMouseClicked: LEFT");
             final int firstElementToBeLast = 5;
             getChildren().get(firstElementToBeLast).toBack();
         }
        }
    );
        System.out.println("TestStackPane - TestStackPane(): END");
    }
}
