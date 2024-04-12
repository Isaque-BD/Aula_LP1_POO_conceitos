module pib.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens pib.example to javafx.fxml;

    exports pib.example;
}
