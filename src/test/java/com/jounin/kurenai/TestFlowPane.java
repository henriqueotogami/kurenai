package com.jounin.kurenai;

import com.jounin.kurenai.view.Square;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TestFlowPane extends FlowPane {

    TestFlowPane() {
        System.out.println("TestFlowPane - TestFlowPane(): BEGIN");
        final Square squareOne = new Square();
        final Square squareTwo = new Square();
        final Square squareThree = new Square();
        final Square squareFour = new Square();
        final Square squareFive = new Square();

        final int horizontalSquareSpacing = 10;
        final int verticalSquareSpacing = 10;
        final int outlineWindowSpacing = 10;

        setHgap(horizontalSquareSpacing);
        setVgap(verticalSquareSpacing);
        setPadding(new Insets(outlineWindowSpacing));

        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER);

        getChildren().addAll(squareOne, squareTwo, squareThree, squareFour, squareFive);
        System.out.println("TestFlowPane - TestFlowPane(): END");
    }
}
