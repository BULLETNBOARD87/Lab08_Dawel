module com.mycompany.lab07_dawel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab07_dawel to javafx.fxml;
    exports com.mycompany.lab07_dawel;
}
