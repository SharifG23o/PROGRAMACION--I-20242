package co.edu.uniquindio.poo.viewController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.VehiculoElectrico;
import co.edu.uniquindio.poo.model.VehiculoHibrido;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClienteViewController {

    @FXML
    private Label lblCambios;

    @FXML
    private Label lblFrenosAire;

    @FXML
    private Label lblNumeroSalidasEmergencia;

    @FXML
    private Label lblEspejosElectricos;

    @FXML
    private Label lblVelocidadCrucero;

    @FXML
    private TextField txtFrenosAire;

    @FXML
    private TextField txtNumeroSalidasEmergencia;

    @FXML
    private TextField txtEspejosElectricos;

    @FXML
    private TextField txtVelocidadCrucero;

    @FXML
    private TextField txtSensorTraficoCruzado;

    @FXML
    private TableColumn<Vehiculo, String> clmModelo;

    @FXML
    private Label lblInfoVehiculo;

    @FXML
    private Label lblEnchufable;

    @FXML
    private Label lblTipoCombustion;

    @FXML
    private Label lblAireAcondicionado;

    @FXML
    private TextField txtTipoCombustion;

    @FXML
    private Label lblSensorTraficoCruzado;

    @FXML
    private TextField txtNumeroPasajeros;

    @FXML
    private TextField txtTiempoCarga;

    @FXML
    private Label lblCamaraReversa;

    @FXML
    private TextField txtAbs;

    @FXML
    private TextField txtLigero;

    @FXML
    private TextField txtNumeroBolsasAire;

    @FXML
    private Button btnVender;

    @FXML
    private TableView<Vehiculo> tblVehiculos;

    @FXML
    private Label lblNumeroPuertas;

    @FXML
    private Label lblTraccion;

    @FXML
    private Label lblLigero;

    @FXML
    private Label lblCapacidadMaletero;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private TextField txtAsistentePermanenciaCarril;

    @FXML
    private Label lblAutonomia;

    @FXML
    private Label lblAbs;

    @FXML
    private Label lblCilindraje;

    @FXML
    private TextField txtCamaraReversa;

    @FXML
    private TableColumn<Vehiculo, String> clmCodigo;

    @FXML
    private Label lblNumeroEjes;

    @FXML
    private TextField txtDefensas;

    @FXML
    private TextField txtSensorColision;

    @FXML
    private Label lblNumeroPasajeros;

    @FXML
    private TextField txtAutonomia;

    @FXML
    private TextField txtCaballosFuerza;

    @FXML
    private TextField txtNumeroPuertas;

    @FXML
    private Label lblTipoTransmision;

    @FXML
    private TextField txtEnchufable;

    @FXML
    private Label lblNuevo;

    @FXML
    private TextField txtNuevo;

    @FXML
    private TableColumn<Vehiculo, Vehiculo> clmVehiculo;

    @FXML
    private TextField txtAireAcondicionado;

    @FXML
    private Label lblCarga;

    @FXML
    private Label lblBolsasAire;

    @FXML
    private TextField txtTraccion;

    @FXML
    private Label lblSensorColision;

    @FXML
    private TableColumn<Vehiculo, String> clmMarca;

    @FXML
    private GridPane gridVehiculo;

    @FXML
    private Label lblVehiculosDisponibles;

    @FXML
    private Button btnAlquilar;

    @FXML
    private Label lblDefensas;

    @FXML
    private Label lblVelocidad;

    @FXML
    private Label lblAsistentePermanenciaCarril;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtTipoTransmision;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblCaballosFuerza;

    @FXML
    private TextField txtTiempo0100;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtVelMax;

    @FXML
    private Label lblTiempo;

    @FXML
    private Button btnConsultarPendientes;

    @FXML
    private Button btnComprar;

    @FXML
    private TextField txtCapacidadMaletero;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private Label lblCapacidadCarga;

    @FXML
    private Label lblTituloGestionCliente;

    private App app;

    ClienteController clienteController;

    private ObservableList<Vehiculo> vehiculos;

    Vehiculo selectedVehiculo;

    public boolean comprarVehiculo;
    public boolean alquilarVehiculo;

    @FXML
    void initialize() {
        clienteController = new ClienteController(app.concesionario);

        vehiculos = FXCollections.observableArrayList();

        comprarVehiculo = false;
        alquilarVehiculo = false;

        carga();
    }

    private void carga() {
        enlaceDataVehiculo();

        cargarTablaVehiculos();

        seleccionarVehiculo();
    }

    private void enlaceDataVehiculo() {
        clmCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        clmModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        clmVehiculo.setCellValueFactory(new PropertyValueFactory<>("tipoVehiculo"));
    }

    private void cargarTablaVehiculos() {
        ArrayList<Vehiculo> vehiculosList = clienteController.obtenerListaVehiculos();
        for (Vehiculo vehiculo : vehiculosList) {
            if (vehiculo.getEstado() == Estado.DISPONIBLE) {
                vehiculos.add(vehiculo);
            }
        }
        tblVehiculos.setItems(vehiculos);
    }

    private void seleccionarVehiculo() {
        tblVehiculos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVehiculo = newSelection;
            mostrarInformacionVehiculo(selectedVehiculo);
        });
    }

    private void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            txtNuevo.setText(vehiculo.getNuevo() == true ? "Si" : "No");
            txtCambios.setText(vehiculo.getCambios() + "");
            txtVelMax.setText(vehiculo.getVelMax() + "");
            txtCilindraje.setText(vehiculo.getCilindraje() + "");
            if (vehiculo instanceof Camion) {
                txtCapacidadCarga.setText(((Camion) vehiculo).getCapacidadCarga() + "");
                txtAireAcondicionado.setText(((Camion) vehiculo).isAireAcondicionado() == true ? "Si" : "No");
                // txtFrenosAire FALTA
                txtAbs.setText(((Camion) vehiculo).isAbs() == true ? "Si" : "No");
                txtNumeroEjes.setText(((Camion) vehiculo).getNumeroEjes() + "");
            }
            if (vehiculo instanceof Moto) {
                txtDefensas.setText(((Moto) vehiculo).isDefensas() == true ? "Si" : "No");
            }
            if (vehiculo instanceof VehiculoHibrido) {
                txtEnchufable.setText(((VehiculoHibrido) vehiculo).Enchufable() == true ? "Si" : "No");
                txtLigero.setText(((VehiculoHibrido) vehiculo).Ligero() == true ? "Si" : "No");
            }
            if (vehiculo instanceof VehiculoElectrico) {
                txtAutonomia.setText(((VehiculoElectrico) vehiculo).getAutonomia() + "");
                txtTiempoCarga.setText(((VehiculoElectrico) vehiculo).getTiempoCarga() + "");
            }
            if (vehiculo instanceof Deportivo) {
                txtNumeroPasajeros.setText(((Deportivo) vehiculo).getNumeroPasajeros() + "");
                txtNumeroPuertas.setText(((Deportivo) vehiculo).getNumeroPuertas() + "");
                txtNumeroBolsasAire.setText(((Deportivo) vehiculo).getNumeroBolsasAire() + "");
                txtCaballosFuerza.setText(((Deportivo) vehiculo).getCaballosFuerza() + "");
                txtTiempo0100.setText(((Deportivo) vehiculo).getTiempoCeroCien() + "");
            }
            if (vehiculo instanceof PickUp) {
                txtNumeroPasajeros.setText(((PickUp) vehiculo).getNumeroPasajeros() + "");
                txtNumeroPuertas.setText(((PickUp) vehiculo).getNumeroPuertas() + "");
                txtNumeroBolsasAire.setText(((PickUp) vehiculo).getNumeroBolsasAire() + "");
                txtAireAcondicionado.setText(((PickUp) vehiculo).isAireAcondicionado() == true ? "Si" : "No");
                txtAbs.setText(((PickUp) vehiculo).isAbs() == true ? "Si" : "No");
                txtTraccion.setText(((PickUp) vehiculo).isTraccion() == true ? "Si" : "No");
                txtCapacidadCarga.setText(((PickUp) vehiculo).getCapacidadCarga() + "");
            }
            if (vehiculo instanceof Van) {
                txtNumeroPasajeros.setText(((Van) vehiculo).getNumeroPasajeros() + "");
                txtNumeroPuertas.setText(((Van) vehiculo).getNumeroPuertas() + "");
                txtNumeroBolsasAire.setText(((Van) vehiculo).getNumeroBolsasAire() + "");
                txtAireAcondicionado.setText(((Van) vehiculo).isAireAcondicionado() == true ? "Si" : "No");
                txtAbs.setText(((Van) vehiculo).isAbs() == true ? "Si" : "No");
                txtCamaraReversa.setText(((Van) vehiculo).isCamaraReversa() == true ? "Si" : "No");
                txtCapacidadMaletero.setText(((Van) vehiculo).getCapacidadMaletero() + "");
            }
            if (vehiculo instanceof Bus) {
                txtNumeroPasajeros.setText(((Bus) vehiculo).getNumeroPasajeros() + "");
                txtNumeroPuertas.setText(((Bus) vehiculo).getNumeroPuertas() + "");
                txtNumeroBolsasAire.setText(((Bus) vehiculo).getNumeroBolsasAire() + "");
                txtAireAcondicionado.setText(((Bus) vehiculo).isAireAcondicionado() == true ? "Si" : "No");
                txtAbs.setText(((Bus) vehiculo).isAbs() == true ? "Si" : "No");
                txtVelocidadCrucero.setText(((Bus) vehiculo).isVelocidadCrucero() == true ? "Si" : "No");
                txtCapacidadMaletero.setText(((Bus) vehiculo).getCapacidadMaletero() + "");
                txtNumeroEjes.setText(((Bus) vehiculo).getNumeroEjes() + "");
                txtNumeroSalidasEmergencia.setText(((Bus) vehiculo).getNumeroSalidasEmergencia() + "");
            }
            if (vehiculo instanceof Sedan) {
                txtNumeroPasajeros.setText(((Sedan) vehiculo).getNumeroPasajeros() + "");
                txtNumeroPuertas.setText(((Sedan) vehiculo).getNumeroPuertas() + "");
                txtNumeroBolsasAire.setText(((Sedan) vehiculo).getNumeroBolsasAire() + "");
                txtAireAcondicionado.setText(((Sedan) vehiculo).isAireAcondicionado() == true ? "Si" : "No");
                txtAbs.setText(((Sedan) vehiculo).isAbs() == true ? "Si" : "No");
                txtVelocidadCrucero.setText(((Sedan) vehiculo).isVelocidadCrucero() == true ? "Si" : "No");
                txtCamaraReversa.setText(((Sedan) vehiculo).isCamaraReversa() == true ? "Si" : "No");
                txtNumeroBolsasAire.setText(((Sedan) vehiculo).getNumeroBolsasAire() + "");
                txtSensorColision.setText(((Sedan) vehiculo).isSensorColision() == true ? "Si" : "No");
                txtSensorTraficoCruzado.setText(((Sedan) vehiculo).isSensorTraficoCruzado() == true ? "Si" : "No");
                txtAsistentePermanenciaCarril
                        .setText(((Sedan) vehiculo).isAsistentePermanenciaCarril() == true ? "Si" : "No");
                txtEspejosElectricos.setText(((Sedan) vehiculo).isEspejosElectricos() == true ? "Si" : "No");
            }
            if (vehiculo instanceof Camioneta) {
                txtNumeroPasajeros.setText(((Camioneta) vehiculo).getNumeroPasajeros() + "");
                txtNumeroPuertas.setText(((Camioneta) vehiculo).getNumeroPuertas() + "");
                txtNumeroBolsasAire.setText(((Camioneta) vehiculo).getNumeroBolsasAire() + "");
                txtAireAcondicionado.setText(((Camioneta) vehiculo).isAireAcondicionado() == true ? "Si" : "No");
                txtAbs.setText(((Camioneta) vehiculo).isAbs() == true ? "Si" : "No");
                txtVelocidadCrucero.setText(((Camioneta) vehiculo).isVelocidadCrucero() == true ? "Si" : "No");
                txtCamaraReversa.setText(((Camioneta) vehiculo).isCamaraReversa() == true ? "Si" : "No");
                txtNumeroBolsasAire.setText(((Camioneta) vehiculo).getNumeroBolsasAire() + "");
                txtSensorColision.setText(((Camioneta) vehiculo).isSensorColision() == true ? "Si" : "No");
                txtSensorTraficoCruzado.setText(((Camioneta) vehiculo).isSensorTraficoCruzado() == true ? "Si" : "No");
                txtAsistentePermanenciaCarril
                        .setText(((Camioneta) vehiculo).isAsistentePermanenciaCarril() == true ? "Si" : "No");
                txtTraccion.setText(((Camioneta) vehiculo).getTraccion() == true ? "Si" : "No");
            }
        }
    }

    @FXML
    void venderVehiculo(ActionEvent event) {
        Stage stage = (Stage) btnVender.getScene().getWindow();
        stage.close();
        app.openVentaClienteView();
    }

    @FXML
    void comprarVehiculo(ActionEvent event) {
        if (selectedVehiculo == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("ERROR");
            alerta.setHeaderText(null);
            alerta.setContentText("Debes seleccionar un vehiculo.");
            alerta.showAndWait();
        } else {
            comprarVehiculo = true;
            app.openSolicitudClienteView();
            tblVehiculos.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void alquilarVehiculo(ActionEvent event) {
        if (selectedVehiculo == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("ERROR");
            alerta.setHeaderText(null);
            alerta.setContentText("Debes seleccionar un vehiculo.");
            alerta.showAndWait();
        } else {
            alquilarVehiculo = true;
            app.openSolicitudClienteView();
            tblVehiculos.getSelectionModel().clearSelection();
        }
    }

    @FXML
    void regresarLogin(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
        app.getLoginViewController().limpiarCasillas();
    }

    @FXML
    void consultarPendientes(ActionEvent event) {
        app.openConsultaSolicitudesView();
    }

    public Vehiculo getSelectedVehiculo() {
        return selectedVehiculo;
    }

    public void setApp(App app) {
        this.app = app;
    }
}