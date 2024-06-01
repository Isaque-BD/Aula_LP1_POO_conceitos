module pib.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens pib.example to javafx.fxml;

    exports pib.example;
}
