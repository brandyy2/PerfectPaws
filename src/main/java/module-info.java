module com.example.perfectpaws {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.perfectpaws to javafx.fxml;
    exports com.example.perfectpaws;
}