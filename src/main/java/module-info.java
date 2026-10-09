module com.example.poo_ejemplo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.example.poo_ejemplo1 to javafx.fxml;
    exports com.example.poo_ejemplo1;
}