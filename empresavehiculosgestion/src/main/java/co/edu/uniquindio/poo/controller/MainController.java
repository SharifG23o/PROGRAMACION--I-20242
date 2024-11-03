package co.edu.uniquindio.poo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainController {

    @FXML
    private TableView<?> tablaClientes;
    @FXML
    private TableColumn<?, ?> colNombre;
    @FXML
    private TableColumn<?, ?> colIdentificacion;
    @FXML
    private TableColumn<?, ?> colCelular;
    @FXML
    private TableColumn<?, ?> colEmail;
    @FXML
    private TableColumn<?, ?> colDireccion;

    @FXML
    private TableView<?> tablaVehiculos;
    @FXML
    private TableColumn<?, ?> colMatricula;
    @FXML
    private TableColumn<?, ?> colMarca;
    @FXML
    private TableColumn<?, ?> colModelo;
    @FXML
    private TableColumn<?, ?> colAnio;
    @FXML
    private TableColumn<?, ?> colTipo;
    @FXML
    private TableColumn<?, ?> colNumeroPuertas;
    @FXML
    private TableColumn<?, ?> colCapacidadCarga;
    @FXML
    private TableColumn<?, ?> colTipoCaja;

    @FXML
    private TableView<?> tablaReservas;
    @FXML
    private TableColumn<?, ?> colIdReserva;
    @FXML
    private TableColumn<?, ?> colVehiculo;
    @FXML
    private TableColumn<?, ?> colCliente;
    @FXML
    private TableColumn<?, ?> colTarifaBase;
    @FXML
    private TableColumn<?, ?> colTarifaAdicional;
    @FXML
    private TableColumn<?, ?> colNumeroDias;
    @FXML
    private TableColumn<?, ?> colCostoTotal;

    @FXML
    public void handleAgregarCliente() {
        // Lógica para agregar cliente
        showAlert("Agregar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleBuscarCliente() {
        // Lógica para buscar cliente
        showAlert("Buscar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleActualizarCliente() {
        // Lógica para actualizar cliente
        showAlert("Actualizar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleEliminarCliente() {
        // Lógica para eliminar cliente
        showAlert("Eliminar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleLimpiarCampos() {
        // Lógica para limpiar campos
        showAlert("Limpiar Campos", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleAgregarVehiculo() {
        // Lógica para agregar vehículo
        showAlert("Agregar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleBuscarVehiculo() {
        // Lógica para buscar vehículo
        showAlert("Buscar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleActualizarVehiculo() {
        // Lógica para actualizar vehículo
        showAlert("Actualizar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleEliminarVehiculo() {
        // Lógica para eliminar vehículo
        showAlert("Eliminar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleAgregarReserva() {
        // Lógica para agregar reserva
        showAlert("Agregar Reserva", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleBuscarReserva() {
        // Lógica para buscar reserva
        showAlert("Buscar Reserva", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleActualizarReserva() {
        // Lógica para actualizar reserva
        showAlert("Actualizar Reserva", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleEliminarReserva() {
        // Lógica para eliminar reserva
        showAlert("Eliminar Reserva", "Funcionalidad no implementada.");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
