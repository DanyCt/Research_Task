module com.example.object {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.object to javafx.fxml;
    exports com.example.object;
}