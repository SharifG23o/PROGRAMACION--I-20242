module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens co.edu.uniquindio.poo to javafx.fxml; 
    opens co.edu.uniquindio.poo.controller to javafx.fxml; 
    opens co.edu.uniquindio.poo.model to javafx.base; 

    exports co.edu.uniquindio.poo.application;
    exports co.edu.uniquindio.poo.controller;
}
