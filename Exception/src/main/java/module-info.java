module com.example.exeptions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exeptions to javafx.fxml;
    exports com.example.exeptions;
}