module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo to javafx.fxml;
    exports co.edu.uniquindio.poo;
    exports co.edu.uniquindio.poo.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.model to javafx.base;
    exports co.edu.uniquindio.poo.model;
}
