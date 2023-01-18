package com.jounin.kurenai.view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends Rectangle {
    private static int indexColor = 0;

    private String[] arrayColors = {
            "#c33c5e", "#39aac6", "28d79a",
            "#fb750e", "#6657a8", "#f9060e"
    };

    public Square() { this(100,100); }

    public Square(final int width, final int height) {
        System.out.println("Square - Square(): BEGIN");
        setWidth(width);
        setHeight(height);
        final Color colorWeb = Color.web(arrayColors[indexColor]);
        setFill(colorWeb);
        indexColor++;
        if(indexColor == 6) indexColor = 0;
        System.out.println("Square - Square(): END");
    }

}
