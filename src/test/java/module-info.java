module kurenai {

    requires javafx.controls;
    requires javafx.fxml;
    requires com.jounin.kurenai;

    opens com.jounin.kurenai to javafx.fxml;
    exports com.jounin.kurenai;

}