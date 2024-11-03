module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens co.edu.uniquindio.poo to javafx.fxml; // Abre el paquete principal para FXML
    opens co.edu.uniquindio.poo.controller to javafx.fxml; // Abre el paquete de controladores para FXML
    opens co.edu.uniquindio.poo.model to javafx.base; // Abre el paquete model para acceso desde JavaFX

    exports co.edu.uniquindio.poo.application;
    exports co.edu.uniquindio.poo.controller;
}
