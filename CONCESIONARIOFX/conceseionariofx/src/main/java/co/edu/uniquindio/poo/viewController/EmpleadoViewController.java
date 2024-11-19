package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdministradorController;
import co.edu.uniquindio.poo.controller.EmpleadoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.EstadoTransaccion;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class EmpleadoViewController {

    @FXML
    private TableColumn<Vehiculo, String> clmCodigo;

    @FXML
    private TableColumn<Transaccion, Double> clmPrecioTotal;

    @FXML
    private Button btnModificarCliente;

    @FXML
    private TableColumn<Transaccion, LocalDate> clmFecha;

    @FXML
    private TableColumn<Vehiculo, String> clmModelo;

    @FXML
    private TableColumn<Transaccion, String> clmCedulaT;

    @FXML
    private TableColumn<Vehiculo, Transmision> clmTipoCaja;

    @FXML
    private TableColumn<Cliente, String> clmDireccion;

    @FXML
    private TableColumn<Transaccion, String> clmCodigoT;

    @FXML
    private TableColumn<Cliente, String> clmApellido;

    @FXML
    private TableView<Transaccion> tblTransacciones;

    @FXML
    private TableColumn<Vehiculo, String> clmMarca;

    @FXML
    private TableColumn<Transaccion, String> clmCodigoV;

    @FXML
    private Button btnRegistrarCliente;

    @FXML
    private Button btnModificarVehiculo;

    @FXML
    private Button btnConsultarTransaccion;

    @FXML
    private TableView<Vehiculo> tblVehiculos;

    @FXML
    private TableColumn<Cliente, String> clmTelefono;

    @FXML
    private TableColumn<Cliente, String> clmNombre;

    @FXML
    private TableColumn<Transaccion, EstadoTransaccion> clmEstadoT;

    @FXML
    private Button btnModificarTransaccion;

    @FXML
    private TableColumn<Vehiculo, Estado> clmEstado;

    @FXML
    private Button btnEliminarVehiculo;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnAgregarVehiculo;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TableColumn<Cliente, String> clmCorreo;

    @FXML
    private TableView<Cliente> tblClientes;

    @FXML
    private TableColumn<Cliente, String> clmCedula;

    @FXML
    private Button btnCrearTransaccion;

    private App app;

    EmpleadoController empleadoController;

    private ObservableList<Cliente> clientes;
    private ObservableList<Vehiculo> vehiculos;
    private ObservableList<Transaccion> transacciones;

    Cliente selectedCliente;
    Vehiculo selectedVehiculo;
    Transaccion selectedTransaccion;

    public boolean agregarCliente;
    public boolean modificarCliente;
    public boolean agregarVehiculo;
    public boolean modificarVehiculo;
    public boolean agregarTransaccion;
    public boolean modificarTransaccion;


    
    public boolean isAgregarVehiculo() {
        return agregarVehiculo;
    }

    public void setAgregarVehiculo(boolean agregarVehiculo) {
        this.agregarVehiculo = agregarVehiculo;
    }

    public boolean isModificarVehiculo() {
        return modificarVehiculo;
    }

    public void setModificarVehiculo(boolean modificarVehiculo) {
        this.modificarVehiculo = modificarVehiculo;
    }

    @FXML
    void initialize() {
        empleadoController = new EmpleadoController(app.concesionario);

        clientes = FXCollections.observableArrayList();
        vehiculos = FXCollections.observableArrayList();
        transacciones = FXCollections.observableArrayList();

        clientes.addAll(empleadoController.obtenerListaClientes());
        vehiculos.addAll(empleadoController.obtenerListaVehiculos());
        transacciones.addAll(empleadoController.obtenerListaTransacciones());

        agregarCliente = false;
        modificarCliente = false;
        agregarVehiculo = false;
        modificarVehiculo = false;
        agregarTransaccion = false;
        modificarTransaccion = false;

        carga();
    }

    private void carga() {
        enlaceDataCliente();
        enlaceDataVehiculo();
        enlaceDataTransaccion();

        cargarTablaVehiculos();
        cargarTablaClientes();
        cargarTablaTransacciones();

        seleccionarVehiculo();
        seleccionarCliente();
        seleccionarTransaccion();
    }

    private void enlaceDataCliente() {
        clmCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        clmNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clmApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clmTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clmCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        clmDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
    }

    private void enlaceDataVehiculo() {
        clmCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        clmModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        clmEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        clmTipoCaja.setCellValueFactory(new PropertyValueFactory<>("transmision"));
    }

    private void enlaceDataTransaccion() {
        clmCodigoT.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        clmPrecioTotal.setCellValueFactory(new PropertyValueFactory<>("precioTotal"));
        clmCodigoV.setCellValueFactory(new PropertyValueFactory<>("codigoVehiculo"));
        clmCedulaT.setCellValueFactory(new PropertyValueFactory<>("cedulaCliente"));
        clmEstadoT.setCellValueFactory(new PropertyValueFactory<>("estadoTransaccion"));
    }

    private void cargarTablaVehiculos() {
        tblVehiculos.setItems(vehiculos);
    }

    private void cargarTablaClientes() {
        tblClientes.setItems(clientes);
    }

    private void cargarTablaTransacciones() {
        tblTransacciones.setItems(transacciones);
    }

    private void seleccionarVehiculo() {
        tblVehiculos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
        });
    }

    private void seleccionarCliente() {
        tblClientes.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
        });
    }

    private void seleccionarTransaccion() {
        tblTransacciones.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedTransaccion = newSelection;
        });
    }

    @FXML
    void regresarLogin(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
        app.getLoginViewController().limpiarCasillas();
    }

    @FXML
    void agregarVehiculo(ActionEvent event) {

        agregarVehiculo=true;

        app.openDatosVehiculoView();
        vehiculos.setAll(empleadoController.obtenerListaVehiculos());
    }

    @FXML
    void modificarVehiculo(ActionEvent event) {
       // modificarVehiculo= true;
        selectedVehiculo = tblVehiculos.getSelectionModel().getSelectedItem();
        if (selectedVehiculo == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar a un vehiculo.");
            alert.showAndWait();

        } else {

            modificarVehiculo = true;
            app.openDatosVehiculoView();
            tblVehiculos.refresh();
            tblVehiculos.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void eliminarVehiculo(ActionEvent event) {
        Vehiculo vehiculo = tblVehiculos.getSelectionModel().getSelectedItem();

        if (vehiculo == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar un vehiculo.");
            alert.showAndWait();
        } else {

            empleadoController.obtenerListaVehiculos().remove(vehiculo);
            vehiculos.remove(vehiculo);

            tblVehiculos.refresh();
        }

    }

    @FXML
    void registrarCliente(ActionEvent event) {
        agregarCliente = true;
        app.openDatosClienteView();
        clientes.setAll(empleadoController.obtenerListaClientes());
    }

    @FXML
    void modificarCliente(ActionEvent event) {
        selectedCliente = tblClientes.getSelectionModel().getSelectedItem();

        if (selectedCliente == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar a un cliente.");
            alert.showAndWait();

        } else {

            modificarCliente = true;
            app.openDatosClienteView();
            tblClientes.refresh();
            tblClientes.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void eliminarCliente(ActionEvent event) {
        Cliente cliente = tblClientes.getSelectionModel().getSelectedItem();

        if (cliente == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar a un cliente.");
            alert.showAndWait();
        } else {

            empleadoController.obtenerListaClientes().remove(cliente);
            clientes.remove(cliente);

            tblClientes.refresh();
        }
    }

    @FXML
    void consultarTransaccion(ActionEvent event) {
        app.openConsultaTransaccionView();
    }

    @FXML
    void terminarTransaccion(ActionEvent event) {
        Transaccion transaccion = tblTransacciones.getSelectionModel().getSelectedItem();

        if (transaccion.getEstadoTransaccion() == EstadoTransaccion.ACEPTADA) {
            app.openTransaccionView();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Solo puedes liquidar transacciones aceptadas por el cliente.");
            alert.showAndWait();
        }
    }

    @FXML
    void eliminarTransaccion(ActionEvent event) {
        Transaccion transaccion = tblTransacciones.getSelectionModel().getSelectedItem();

        if (transaccion == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes seleccionar una transaccion.");
            alert.showAndWait();
        } else {

            empleadoController.obtenerListaTransacciones().remove(transaccion);
            transacciones.remove(transaccion);

            tblTransacciones.refresh();
        }
    }

    public Cliente getSelectedCliente() {
        return selectedCliente;
    }

    public Vehiculo getSelectedVehiculo() {
        return selectedVehiculo;
    }

    public Transaccion getSelectedTransaccion() {
        return selectedTransaccion;
    }

    public void setApp(App app) {
        this.app = app;
    }

}
