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
       
        showAlert("Agregar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleBuscarCliente() {
        
        showAlert("Buscar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleActualizarCliente() {
        
        showAlert("Actualizar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleEliminarCliente() {
        
        showAlert("Eliminar Cliente", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleLimpiarCampos() {
        
        showAlert("Limpiar Campos", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleAgregarVehiculo() {
        
        showAlert("Agregar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleBuscarVehiculo() {
        
        showAlert("Buscar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleActualizarVehiculo() {
        
        showAlert("Actualizar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleEliminarVehiculo() {
       
        showAlert("Eliminar Vehículo", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleAgregarReserva() {
        
        showAlert("Agregar Reserva", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleBuscarReserva() {
       
        showAlert("Buscar Reserva", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleActualizarReserva() {
       
        showAlert("Actualizar Reserva", "Funcionalidad no implementada.");
    }

    @FXML
    public void handleEliminarReserva() {
       
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