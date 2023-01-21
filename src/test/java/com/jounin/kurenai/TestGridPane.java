package com.jounin.kurenai;

import com.jounin.kurenai.view.HorizontalBox;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TestGridPane extends GridPane {

    public TestGridPane() {
        System.out.println("TestGridPane - TestGridPane(): BEGIN");
        final HorizontalBox horizontalBoxOne = new HorizontalBox().withText("One");
        final HorizontalBox horizontalBoxTwo = new HorizontalBox().withText("Two");
        final HorizontalBox horizontalBoxThree = new HorizontalBox().withText("Three");
        final HorizontalBox horizontalBoxFour = new HorizontalBox().withText("Four");
        final HorizontalBox horizontalBoxFive = new HorizontalBox().withText("Five");
        final HorizontalBox horizontalBoxSix = new HorizontalBox().withText("Six");

        setGridLinesVisible(true);
        getColumnConstraints().addAll(
            columnConstraints(),
            columnConstraints(),
            columnConstraints(),
            columnConstraints(),
            columnConstraints()
        );
        getRowConstraints().addAll(
            rowConstraints(),
            rowConstraints(),
            rowConstraints(),
            rowConstraints(),
            rowConstraints()
        );

        final int outlineSpacing = 10;
        setVgap(outlineSpacing);
        setHgap(outlineSpacing);

        add(horizontalBoxOne, 0, 0, 2,2);
        add(horizontalBoxTwo, 1, 1, 2, 2);
        add(horizontalBoxThree, 4,2, 1, 3);
        add(horizontalBoxFour, 3, 1);
        add(horizontalBoxFive, 0,4,2,1);
        add(horizontalBoxSix, 3, 3);
        System.out.println("TestGridPane - TestGridPane(): END");
    }

    private ColumnConstraints columnConstraints() {
        System.out.println("TestGridPane - columnConstraints(): BEGIN");
        final ColumnConstraints columnConstraints = new ColumnConstraints();
        final int twentyPercent = 20;
        columnConstraints.setPercentWidth(twentyPercent);
        columnConstraints.setFillWidth(true);
        System.out.println("TestGridPane - columnConstraints(): END");
        return columnConstraints;
    }

    private RowConstraints rowConstraints() {
        System.out.println("TestGridPane - rowConstraints(): BEGIN");
        final RowConstraints rowConstraints = new RowConstraints();
        final int twentyPercent = 20;
        rowConstraints.setPercentHeight(twentyPercent);
        rowConstraints.setFillHeight(true);
        System.out.println("TestGridPane - rowConstraints(): END");
        return rowConstraints;
    }

}
