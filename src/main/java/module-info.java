module com.jounin.kurenai {

    requires javafx.controls;
    requires javafx.fxml;

    opens com.jounin.kurenai.controller to javafx.fxml;

    exports com.jounin.kurenai.controller;
}