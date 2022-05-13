module com.example.remigo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.remigo to javafx.fxml;
    exports com.example.remigo;
}