module com.example.exchange {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.jsoup;

    opens com.example.exchange to javafx.fxml;
    exports com.example.exchange;
}