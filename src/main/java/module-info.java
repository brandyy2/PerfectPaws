module com.example.perfectpaws {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.perfectpaws to javafx.fxml;
    exports com.example.perfectpaws;
    exports ourPetInventoryStuff;
    opens ourPetInventoryStuff to javafx.fxml;
}