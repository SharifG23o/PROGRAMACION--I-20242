package co.edu.uniquindio.poo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AgregarReservaController {

    @FXML
    private ComboBox<String> vehiculoComboBox; // Cambia a tipo correcto
    @FXML
    private ComboBox<String> clienteComboBox;  // Cambia a tipo correcto
    @FXML
    private TextField tarifaBaseField;
    @FXML
    private TextField tarifaAdicionalField;
    @FXML
    private TextField numeroDiasField;
    @FXML
    private TextField costoTotalField;

    @FXML
    public void initialize() {
        // Llenar los ComboBoxes con datos de vehículos y clientes
        vehiculoComboBox.getItems().addAll("Vehículo 1", "Vehículo 2"); // Lógica real aquí
        clienteComboBox.getItems().addAll("Cliente 1", "Cliente 2"); // Lógica real aquí
    }

    @FXML
    public void handleAgregar() {
        String vehiculo = vehiculoComboBox.getValue();
        String cliente = clienteComboBox.getValue();
        String tarifaBase = tarifaBaseField.getText();
        String tarifaAdicional = tarifaAdicionalField.getText();
        String numeroDias = numeroDiasField.getText();
        String costoTotal = costoTotalField.getText();

        // Aquí puedes agregar la lógica para guardar la reserva en la base de datos o en una lista

        // Ejemplo de alerta de éxito
        showAlert("Reserva Agregada", "La reserva ha sido agregada correctamente.");
        
        // Limpiar campos
        clearFields();
    }

    @FXML
    public void handleCancelar() {
        closeWindow();
    }

    private void clearFields() {
        vehiculoComboBox.setValue(null);
        clienteComboBox.setValue(null);
        tarifaBaseField.clear();
        tarifaAdicionalField.clear();
        numeroDiasField.clear();
        costoTotalField.clear();
    }

    private void closeWindow() {
        Stage stage = (Stage) tarifaBaseField.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
