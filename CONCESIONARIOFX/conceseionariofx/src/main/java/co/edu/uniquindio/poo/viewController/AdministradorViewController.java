package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;
import java.util.LinkedList;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdministradorController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AdministradorViewController {

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnModificarE;

    @FXML
    private TableColumn<Cliente, String> clmTelefonoC;

    @FXML
    private TableView<Transaccion> tblReportes;

    @FXML
    private TableColumn<Vendedor, String> clmTelefonoE;

    @FXML
    private TableView<Cliente> tblClientes;

    @FXML
    private TableColumn<Transaccion, String> clmCodigoReportes;

    @FXML
    private Label lblFecha2;

    @FXML
    private Button btnAgregarE;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Transaccion, LocalDate> clmFechaReportes;

    @FXML
    private TableColumn<Cliente, String> clmDireccionC;

    @FXML
    private TableColumn<Vendedor, String> clmCodigoE;

    @FXML
    private TableColumn<Vendedor, String> clmCedulaE;

    @FXML
    private Button btnVerReportes;

    @FXML
    private TableColumn<Cliente, String> clmCorreoC;

    @FXML
    private TableColumn<Cliente, String> clmCuentaC;

    @FXML
    private Button btnBloquearE;

    @FXML
    private TableColumn<Vendedor, String> clmCorreoE;

    @FXML
    private TableColumn<Vendedor, String> clmCuentaE;

    @FXML
    private TableColumn<Cliente, String> clmCodigoEmpleado;

    @FXML
    private DatePicker date2;

    @FXML
    private DatePicker date1;

    @FXML
    private TableColumn<Transaccion, Integer> clmPrecioTotalReportes;

    @FXML
    private Label lblFceha1;

    @FXML
    private TableColumn<Cliente, String> clmCedulaC;

    @FXML
    private TableView<Vendedor> tblEmpleados;

    @FXML
    private TableColumn<Cliente, String> clmNombreC;

    @FXML
    private TableColumn<Vendedor, String> clmApellidoE;

    @FXML
    private TableColumn<Cliente, String> clmApellidoC;

    @FXML
    private TableColumn<Vendedor, String> clmNombreE;

    private App app;

    AdministradorController administradorController;

    private ObservableList<Cliente> clientes;
    private ObservableList<Vendedor> vendedores;
    private ObservableList<Transaccion> transacciones;

    public boolean agregarEmpleado;
    public boolean modificarEmpleado;

    Vendedor selectedVendedor;

    @FXML
    void initialize() {
        administradorController = new AdministradorController(app.concesionario);

        clientes = FXCollections.observableArrayList();
        vendedores = FXCollections.observableArrayList();
        transacciones = FXCollections.observableArrayList();

        clientes.addAll(administradorController.obtenerListaClientes());
        vendedores.addAll(administradorController.obtenerListaVendedores());

        agregarEmpleado = false;
        modificarEmpleado = false;

        carga();
    }

    private void carga() {
        enlaceDataCliente();
        enlaceDataVendedor();
        enlaceDataTransaccion();

        cargarTablaVendedores();
        cargarTablaClientes();

        seleccionarVendedor();

        limpiarEspacios();
    }

    private void enlaceDataCliente() {
        clmCedulaC.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        clmNombreC.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clmApellidoC.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clmTelefonoC.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clmCorreoC.setCellValueFactory(new PropertyValueFactory<>("correo"));
        clmDireccionC.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        clmCuentaC.setCellValueFactory(new PropertyValueFactory<>("cuenta"));
    }

    private void enlaceDataVendedor() {
        clmCodigoE.setCellValueFactory(new PropertyValueFactory<>("codigoEmpleado"));
        clmCedulaE.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        clmNombreE.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clmApellidoE.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clmTelefonoE.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clmCorreoE.setCellValueFactory(new PropertyValueFactory<>("correo"));
        clmCuentaE.setCellValueFactory(new PropertyValueFactory<>("cuenta"));
    }

    private void enlaceDataTransaccion() {
        clmCodigoReportes.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmCodigoEmpleado.setCellValueFactory(new PropertyValueFactory<>("codigoEmpleado"));
        clmFechaReportes.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        clmPrecioTotalReportes.setCellValueFactory(new PropertyValueFactory<>("precioTotal"));
    }

    private void cargarTablaVendedores() {
        tblEmpleados.setItems(vendedores);
    }

    private void cargarTablaClientes() {
        tblClientes.setItems(clientes);
    }

    private void seleccionarVendedor() {
        tblEmpleados.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVendedor = newSelection;
        });
    }

    @FXML
    void agregarEmpleado(ActionEvent event) {
        agregarEmpleado = true;
        app.openDatosEmpleadoView();
        vendedores.setAll(administradorController.obtenerListaVendedores());
    }

    @FXML
    void modificarEmpleado(ActionEvent event) {
        selectedVendedor = tblEmpleados.getSelectionModel().getSelectedItem();

        if (selectedVendedor == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar a un cliente.");
            alert.showAndWait();

        } else {
            
            modificarEmpleado = true;
            app.openDatosEmpleadoView();
            tblEmpleados.refresh();
            tblEmpleados.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void bloquearCuenta(ActionEvent event) {
        Vendedor vendedor = tblEmpleados.getSelectionModel().getSelectedItem();

        if (vendedor == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar a un cliente.");
            alert.showAndWait();
        } else {

            administradorController.obtenerListaVendedores().remove(vendedor);
            vendedores.remove(vendedor);

            tblEmpleados.refresh();
        }
    }

    @FXML
    void verReportesAction(ActionEvent event) {

        LocalDate fechaInicio = date1.getValue();
        LocalDate fechaFinal = date2.getValue();

        if (fechaInicio == null || fechaFinal == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes rellenar los espacios.");
            alert.showAndWait();
        } else if (fechaInicio.isAfter(fechaFinal)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("La fecha 1 debe ser anterior que la fecha 2.");
            alert.showAndWait();
        } else {
            LinkedList<Vendedor> vendedoresFecha = administradorController.obtenerVendedoresFecha(fechaInicio, fechaFinal);

            for (Vendedor vendedor : vendedoresFecha) {
                for (Transaccion transaccion : vendedor.getTransacciones()) {
                    transacciones.add(transaccion);
                }
                tblReportes.setItems(transacciones);
            }
        } 
    }

    @FXML
    void regresarLogin(ActionEvent event) {
        Stage stage = (Stage) btnRegresar.getScene().getWindow();
        stage.close();
        app.getLoginViewController().limpiarCasillas();
    }

    @FXML
    void limpiarCasillas(ActionEvent event) {
        limpiarEspacios();
    }

    private void limpiarEspacios() {
        date1.setValue(null);
        date2.setValue(null);
    }

    public Vendedor getSelectedVendedor() {
        return selectedVendedor;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
