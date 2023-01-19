package com.jounin.kurenai;

import com.jounin.kurenai.view.HorizontalBox;
import javafx.scene.layout.BorderPane;

public class TestBorderPane extends BorderPane {

    public TestBorderPane() {
        System.out.println("TestBorderPane - TestBorderPane(): BEGIN");
        final HorizontalBox horizontalBoxOne = new HorizontalBox().withText("Top");
        final HorizontalBox horizontalBoxTwo = new HorizontalBox().withText("Left");
        final HorizontalBox horizontalBoxThree = new HorizontalBox().withText("Right");
        final HorizontalBox horizontalBoxFour = new HorizontalBox().withText("Bottom");
        final HorizontalBox horizontalBoxFive = new HorizontalBox().withText("Central area");

        setTop(horizontalBoxOne);
        setLeft(horizontalBoxTwo);
        setRight(horizontalBoxThree);
        setBottom(horizontalBoxFour);
        setCenter(horizontalBoxFive);
        System.out.println("TestBorderPane - TestBorderPane(): END");
    }

}
