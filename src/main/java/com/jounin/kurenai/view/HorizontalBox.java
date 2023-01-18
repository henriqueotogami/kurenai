package com.jounin.kurenai.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HorizontalBox extends HBox {

    private static int indexColor = 0;

    private String[] arrayColors = {
      "#c33c5e", "#39aac6", "28d79a",
      "#fb750e", "#6657a8", "#f9060e"
    };

    public HorizontalBox() { this(100,100); }

    public HorizontalBox(final int width, final int height) {
        System.out.println("HorizontalBox - HorizontalBox(): BEGIN");
        setAlignment(Pos.CENTER);
        setMinWidth(width);
        setMinHeight(height);
        final Color colorWeb = Color.web(arrayColors[indexColor]);
        final BackgroundFill backgroundFill = new BackgroundFill(colorWeb, CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(backgroundFill));
        indexColor++;
        if(indexColor == 6) indexColor = 0;
        System.out.println("HorizontalBox - HorizontalBox(): END");
    }

    public HorizontalBox withText(final String text) {
        final Label label = new Label(text);
        label.setFont(new Font(24));
        getChildren().add(label);
        return this;
    }
}
