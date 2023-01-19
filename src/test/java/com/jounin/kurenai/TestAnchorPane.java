package com.jounin.kurenai;

import com.jounin.kurenai.view.Square;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TestAnchorPane extends AnchorPane {

    public TestAnchorPane() {
        System.out.println("TestAnchorPane - TestAnchorPane(): BEGIN");
        final Square squareOne = new Square();
        final Square squareTwo = new Square();
        final Square squareThree = new Square();
        final Square squareFour = new Square();
        final Square squareFive = new Square();

        final double offsetTop = 10.0;
        final double offsetRight = 10.0;
        final double offsetLeft = 10.0;
        final double offsetBottom = 10.0;

        setTopAnchor(squareOne, offsetTop);
        setLeftAnchor(squareOne, offsetLeft);
        setTopAnchor(squareTwo, offsetTop);
        setRightAnchor(squareTwo, offsetRight);
        setBottomAnchor(squareThree, offsetBottom);
        setLeftAnchor(squareThree, offsetLeft);
        setBottomAnchor(squareFour, offsetBottom);
        setRightAnchor(squareFour, offsetRight);

        final HBox centerBox = new HBox();
        centerBox.setAlignment(Pos.CENTER);
        final double offsetToCenter = 110.0;
        setTopAnchor(centerBox, offsetToCenter);
        setBottomAnchor(centerBox, offsetToCenter);
        setLeftAnchor(centerBox, offsetToCenter);
        setRightAnchor(centerBox,offsetToCenter);

        centerBox.getChildren().add(squareFive);
        getChildren().addAll(squareOne, squareTwo, squareThree, squareFour, centerBox);
        System.out.println("TestAnchorPane - TestAnchorPane(): END");
    }
}
