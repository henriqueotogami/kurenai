package com.jounin.kurenai;

import com.jounin.kurenai.view.Square;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TestTilePane extends TilePane {

    public TestTilePane() {
        System.out.println("TestTilePane - TestTilePane(): BEGIN");
        final List<Square> squareList = new ArrayList<>();
        for(int index = 1; 10 > index; index++) {
            final Square square = new Square(index * 10);
            squareList.add(square);
        }
        setPadding(new Insets(20,10,20,10));
        final int outlineWindowSpacing = 10;
        setVgap(outlineWindowSpacing);
        setHeight(outlineWindowSpacing);
        setOrientation(Orientation.VERTICAL);
        setTileAlignment(Pos.BOTTOM_RIGHT);
        getChildren().addAll(squareList);
        System.out.println("TestTilePane - TestTilePane(): END");
    }
}
