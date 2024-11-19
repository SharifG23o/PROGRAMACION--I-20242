package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ConsultaSolicitudesController;
import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.EstadoTransaccion;
import co.edu.uniquindio.poo.model.Negocio;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vendedor;
import co.edu.uniquindio.poo.model.Venta;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ConsultaSolicitudesViewController {

    @FXML
    private Button btnCargarOferta;

    @FXML
    private TableView<Transaccion> tblSolicitudes;

    @FXML
    private TableColumn<Transaccion, String> clmCodigo;

    @FXML
    private TableColumn<Transaccion, String> clmCodigoVendedor;

    @FXML
    private TableColumn<Transaccion, String> clmFecha;

    @FXML
    private RadioButton radioAlquiler;

    @FXML
    private RadioButton radioVenta;

    @FXML
    private RadioButton radioCompra;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnRechazar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtOferta;

    private App app;

    private ConsultaSolicitudesController consultaSolicitudesController;

    private ObservableList<Transaccion> transacciones;

    public void setApp(App app) {
        this.app = app;
    }

    private Transaccion selectedTransaccion;

    ToggleGroup toggleGroup;

    public Transaccion getSelectedTransaccion() {
        return selectedTransaccion;
    }

    @FXML
    void initialize() {
        consultaSolicitudesController = new ConsultaSolicitudesController(app.concesionario);

        toggleGroup = new ToggleGroup();

        transacciones = FXCollections.observableArrayList();

        seleccionarTransaccion();
        enlazarOpciones();
        enlazarDatosTabla();

        tblSolicitudes.setItems(transacciones);
    }

    private void seleccionarTransaccion() {
        tblSolicitudes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedTransaccion = newSelection;
        });
        mostrarInformacionTransaccion(selectedTransaccion);
    }

    private void mostrarInformacionTransaccion(Transaccion transaccion) {
        if (transaccion != null) {
            for (Negocio negocio : transaccion.getNegocios()) {
                if (negocio instanceof Compra) {
                    radioCompra.setSelected(true);
                    txtOferta.setText(((Compra) negocio).getPrecioCompra() + "");
                } else if (negocio instanceof Venta) {
                    radioVenta.setSelected(true);
                    txtOferta.setText(((Venta) negocio).getPrecioVenta() + "");
                } else if (negocio instanceof Alquiler) {
                    radioAlquiler.setSelected(true);
                    txtOferta.setText(((Alquiler) negocio).getPrecioAlquiler() + "");
                }
            }
        }
    }

    private void enlazarOpciones() {
        radioAlquiler.setToggleGroup(toggleGroup);
        radioCompra.setToggleGroup(toggleGroup);
        radioVenta.setToggleGroup(toggleGroup);
        radioAlquiler.setDisable(true);
        radioCompra.setDisable(true);
        radioVenta.setDisable(true);
    }

    private void enlazarDatosTabla() {
        clmCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        clmCodigoVendedor.setCellValueFactory(new PropertyValueFactory<>("codigoVendedor"));
    }

    @FXML
    void aceptarOferta(ActionEvent event) {
        Transaccion transaccionSeleccionada = tblSolicitudes.getSelectionModel().getSelectedItem();
        selectedTransaccion = transaccionSeleccionada;

        if (transaccionSeleccionada != null) {
            for (Negocio negocio : transaccionSeleccionada.getNegocios()) {
                if (negocio instanceof Alquiler) {
                    app.openDatosAlquilerView();
                    transaccionSeleccionada.setEstadoTransaccion(EstadoTransaccion.ACEPTADA);
                    mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Transacción aceptada correctamente.");
                    transaccionSeleccionada.getCliente().getTransacciones().add(transaccionSeleccionada);
                } else {
                    transaccionSeleccionada.setEstadoTransaccion(EstadoTransaccion.ACEPTADA);
                    mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Transacción aceptada correctamente.");
                    transaccionSeleccionada.getCliente().getTransacciones().add(transaccionSeleccionada);
                }
            }
        } else {
            mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Debe seleccionar una transacción.");
        }
    }

    @FXML
    void rechazarOferta(ActionEvent event) {
        Transaccion transaccionSeleccionada = tblSolicitudes.getSelectionModel().getSelectedItem();
        selectedTransaccion = transaccionSeleccionada;

        if (transaccionSeleccionada != null) {
            transaccionSeleccionada.setEstadoTransaccion(EstadoTransaccion.RECHAZADA);
            mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Transacción rechazada correctamente.");
        } else {
            mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Debe seleccionar una transacción.");
        }
    }

    @FXML
    void cargarDatos(ActionEvent event) {
        cargarTransaccionesCliente();
    }

    private void cargarTransaccionesCliente() {
        String usuario = app.getLoginViewController().getUsuario();
        Cliente cliente = consultaSolicitudesController.obtenerClientePorUsuario(usuario);
        List<Transaccion> transaccionesPendientes = new ArrayList<>();

        for (Transaccion transaccion : cliente.getTransacciones()) {
            if (transaccion.getEstadoTransaccion() == EstadoTransaccion.PENDIENTE & transaccion.getVendedor() != null) {
                transaccionesPendientes.add(transaccion);
            }
        }
        transacciones.setAll(transaccionesPendientes);
        tblSolicitudes.setItems(transacciones);
    }

    @FXML
    void cargarDatosOferta(ActionEvent event) {
        Transaccion transaccion = tblSolicitudes.getSelectionModel().getSelectedItem();
        mostrarInformacionTransaccion(transaccion);
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    @FXML
    void regresarCliente(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

}
