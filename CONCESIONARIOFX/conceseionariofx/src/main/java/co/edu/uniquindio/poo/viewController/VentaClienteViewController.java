package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.controller.VentaClienteController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Combustion;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.VehiculoElectrico;
import co.edu.uniquindio.poo.model.VehiculoHibrido;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VentaClienteViewController {

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblModelo;

    @FXML
    private Label lblCambios;

    @FXML
    private Label lblNumeroSalidasEmergencia;

    @FXML
    private Label lblEspejosElectricos;

    @FXML
    private Label lblVelocidadCrucero;

    @FXML
    private Label lblFrenosAire;

    @FXML
    private TextField txtNumeroSalidasEmergencia;

    @FXML
    private TextField txtEspejosElectricos;

    @FXML
    private TextField txtVelocidadCrucero;

    @FXML
    private TextField txtFrenosAire;

    @FXML
    private TextField txtSensorTraficoCruzado;

    @FXML
    private RadioButton radioVan;

    @FXML
    private Label lblEnchufable;

    @FXML
    private Label lblTipoCombustion;

    @FXML
    private RadioButton radioMoto;

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
    private RadioButton radioBus;

    @FXML
    private RadioButton radioHibrido;

    @FXML
    private TextField txtCodigo;

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
    private RadioButton radioCamion;

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
    private TextField txtAireAcondicionado;

    @FXML
    private Label lblCarga;

    @FXML
    private Label lblBolsasAire;

    @FXML
    private Label lblTipoCamion;

    @FXML
    private TextField txtTraccion;

    @FXML
    private Label lblSensorColision;

    @FXML
    private GridPane gridVehiculo;

    @FXML
    private Label lblDefensas;

    @FXML
    private TextField txtModelo;

    @FXML
    private Label lblVelMax;

    @FXML
    private Label lblAsistentePermanenciaCarril;

    @FXML
    private RadioButton radioCamioneta;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtTipoTransmision;

    @FXML
    private VBox vboxTipoVehiculo;

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
    private RadioButton radioSedan;

    @FXML
    private RadioButton radioElectrico;

    @FXML
    private RadioButton radioPickUp;

    @FXML
    private TextField txtCapacidadMaletero;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtTipoCamion;

    @FXML
    private RadioButton radioDeportivo;

    @FXML
    private Label lblCapacidadCarga;

    private App app;

    VentaClienteController ventaClienteController;

    ToggleGroup toggleGroup;

    private Vehiculo vehiculoAgregado;

    public boolean venderVehiculo;

    void initialize() {
        ventaClienteController = new VentaClienteController(app.concesionario);

        toggleGroup = new ToggleGroup();

        venderVehiculo = false;

        agruparOpciones();
    }

    private void agruparOpciones() {
        radioMoto.setToggleGroup(toggleGroup);
        radioBus.setToggleGroup(toggleGroup);
        radioCamion.setToggleGroup(toggleGroup);
        radioCamioneta.setToggleGroup(toggleGroup);
        radioDeportivo.setToggleGroup(toggleGroup);
        radioElectrico.setToggleGroup(toggleGroup);
        radioHibrido.setToggleGroup(toggleGroup);
        radioPickUp.setToggleGroup(toggleGroup);
        radioSedan.setToggleGroup(toggleGroup);
        radioVan.setToggleGroup(toggleGroup);
    }

    @FXML
    void seleccionarVehiculo(ActionEvent event) {

        limpiarSeleccion();

        lblCodigo.setStyle("-fx-text-fill: red;");
        lblMarca.setStyle("-fx-text-fill: red;");
        lblModelo.setStyle("-fx-text-fill: red;");
        lblNuevo.setStyle("-fx-text-fill: red;");
        lblCambios.setStyle("-fx-text-fill: red;");
        lblVelMax.setStyle("-fx-text-fill: red;");
        lblCilindraje.setStyle("-fx-text-fill: red;");
        lblTipoCombustion.setStyle("-fx-text-fill: red;");
        lblTipoTransmision.setStyle("-fx-text-fill: red;");

        if (radioMoto.isSelected()) {
            lblDefensas.setStyle("-fx-text-fill: red;");
        } else if (radioCamion.isSelected()) {
            lblCapacidadCarga.setStyle("-fx-text-fill: red;");
            lblAireAcondicionado.setStyle("-fx-text-fill: red;");
            lblFrenosAire.setStyle("-fx-text-fill: red;");
            lblAbs.setStyle("-fx-text-fill: red;");
            lblNumeroEjes.setStyle("-fx-text-fill: red;");
            lblTipoCamion.setStyle("-fx-text-fill: red;");
        } else if (radioHibrido.isSelected()) {
            lblEnchufable.setStyle("-fx-text-fill: red;");
            lblLigero.setStyle("-fx-text-fill: red;");
        } else if (radioElectrico.isSelected()) {
            lblAutonomia.setStyle("-fx-text-fill: red;");
            lblCarga.setStyle("-fx-text-fill: red;");
        } else {
            lblNumeroPasajeros.setStyle("-fx-text-fill: red;");
            lblNumeroPuertas.setStyle("-fx-text-fill: red;");
            lblBolsasAire.setStyle("-fx-text-fill: red;");
            if (radioDeportivo.isSelected()) {
                lblCaballosFuerza.setStyle("-fx-text-fill: red;");
                lblTiempo.setStyle("-fx-text-fill: red;");
            } else {
                lblAireAcondicionado.setStyle("-fx-text-fill: red;");
                lblAbs.setStyle("-fx-text-fill: red;");
                if (radioVan.isSelected()) {
                    lblCamaraReversa.setStyle("-fx-text-fill: red;");
                    lblCapacidadMaletero.setStyle("-fx-text-fill: red;");
                } else if (radioPickUp.isSelected()) {
                    lblTraccion.setStyle("-fx-text-fill: red;");
                    lblCapacidadCarga.setStyle("-fx-text-fill: red;");
                } else {
                    lblVelocidadCrucero.setStyle("-fx-text-fill: red;");
                    lblCapacidadMaletero.setStyle("-fx-text-fill: red;");
                    if (radioBus.isSelected()) {
                        lblNumeroEjes.setStyle("-fx-text-fill: red;");
                        lblNumeroSalidasEmergencia.setStyle("-fx-text-fill: red;");
                    } else {
                        lblCamaraReversa.setStyle("-fx-text-fill: red;");
                        lblSensorColision.setStyle("-fx-text-fill: red;");
                        lblSensorTraficoCruzado.setStyle("-fx-text-fill: red;");
                        lblAsistentePermanenciaCarril.setStyle("-fx-text-fill: red;");
                        if (radioSedan.isSelected()) {
                            lblEspejosElectricos.setStyle("-fx-text-fill: red;");
                        } else if (radioCamioneta.isSelected()) {
                            lblTraccion.setStyle("-fx-text-fill: red;");
                        }
                    }
                }
            }
        }
    }

    private void limpiarSeleccion() {
        lblNuevo.setStyle("-fx-text-fill: black;");
        lblCambios.setStyle("-fx-text-fill: black;");
        lblVelMax.setStyle("-fx-text-fill: black;");
        lblCilindraje.setStyle("-fx-text-fill: black;");
        lblDefensas.setStyle("-fx-text-fill: black;");
        lblCapacidadCarga.setStyle("-fx-text-fill: black;");
        lblAireAcondicionado.setStyle("-fx-text-fill: black;");
        lblAbs.setStyle("-fx-text-fill: black;");
        lblNumeroEjes.setStyle("-fx-text-fill: black;");
        lblNumeroPasajeros.setStyle("-fx-text-fill: black;");
        lblNumeroPuertas.setStyle("-fx-text-fill: black;");
        lblBolsasAire.setStyle("-fx-text-fill: black;");
        lblCaballosFuerza.setStyle("-fx-text-fill: black;");
        lblTiempo.setStyle("-fx-text-fill: black;");
        lblTraccion.setStyle("-fx-text-fill: black;");
        lblAutonomia.setStyle("-fx-text-fill: black;");
        lblCarga.setStyle("-fx-text-fill: black;");
        lblEnchufable.setStyle("-fx-text-fill: black;");
        lblLigero.setStyle("-fx-text-fill: black;");
        lblTipoCombustion.setStyle("-fx-text-fill: black;");
        lblTipoTransmision.setStyle("-fx-text-fill: black;");
        lblCamaraReversa.setStyle("-fx-text-fill: black;");
        lblCapacidadMaletero.setStyle("-fx-text-fill: black;");
        lblSensorColision.setStyle("-fx-text-fill: black;");
        lblSensorTraficoCruzado.setStyle("-fx-text-fill: black;");
        lblAsistentePermanenciaCarril.setStyle("-fx-text-fill: black;");
        lblNumeroSalidasEmergencia.setStyle("-fx-text-fill: black;");
        lblEspejosElectricos.setStyle("-fx-text-fill: black;");
        lblVelocidadCrucero.setStyle("-fx-text-fill: black;");
        lblFrenosAire.setStyle("-fx-text-fill: black;");
        lblTipoCamion.setStyle("-fx-text-fill: black;");
    }

    @FXML
    void venderVehiculo(ActionEvent event) {
        try {
            String codigo = txtCodigo.getText();
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            String nuevoString = txtNuevo.getText();
            String cambiosString = txtCambios.getText();
            String velMaxString = txtVelMax.getText();
            String cilindrajeString = txtCilindraje.getText();
            String defensasString = txtDefensas.getText();
            String capacidadCargaString = txtCapacidadCarga.getText();
            String aireAcondicionadoString = txtAireAcondicionado.getText();
            String absString = txtAbs.getText();
            String numeroEjesString = txtNumeroEjes.getText();
            String numeroPasajerosString = txtNumeroPasajeros.getText();
            String numeroPuertasString = txtNumeroPuertas.getText();
            String numeroBolsasAireString = txtNumeroBolsasAire.getText();
            String caballosFuerzaString = txtCaballosFuerza.getText();
            String tiempoCeroCienString = txtTiempo0100.getText();
            String traccionString = txtTraccion.getText();
            String autonomiaString = txtAutonomia.getText();
            String tiempoCargaString = txtTiempoCarga.getText();
            String enchufableString = txtEnchufable.getText();
            String ligeroString = txtLigero.getText();
            String tipoCombustionString = txtTipoCombustion.getText();
            String tipoTransmisionString = txtTipoTransmision.getText();
            String camaraReversaString = txtCamaraReversa.getText();
            String capacidadMaleteroString = txtCapacidadMaletero.getText();
            String sensorColisionString = txtSensorColision.getText();
            String sensorTraficoCruzadoString = txtSensorTraficoCruzado.getText();
            String asistentePermanenciaCarrilString = txtAsistentePermanenciaCarril.getText();
            String numeroSalidasEmergenciaString = txtNumeroSalidasEmergencia.getText();
            String espejosElectricoString = txtAsistentePermanenciaCarril.getText();
            String velocidadCruceroString = txtVelocidadCrucero.getText();
            String frenosAireString = txtFrenosAire.getText();
            String tipoCamionString = txtTipoCamion.getText();

            if (codigo.isEmpty() || marca.isEmpty() || modelo.isEmpty() || nuevoString.isEmpty()
                    || cambiosString.isEmpty() || velMaxString.isEmpty() || cilindrajeString.isEmpty()
                    || tipoTransmisionString.isEmpty() || tipoCombustionString.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText(
                        "Debes rellenar los espacios: Codigo, Marca, Modelo, Nuevo, Cambios, Velocidad Maxima o Cilindraje.");
                alert.showAndWait();
            } else {
                boolean nuevo = ingresarBooleano(txtNuevo, "Nuevo");
                int cambios = Integer.parseInt(cambiosString);
                double velMax = Integer.parseInt(velMaxString);
                double cilindraje = Integer.parseInt(cilindrajeString);
                Transmision transmision = determinarTransmision(tipoTransmisionString);
                Combustion combustion = determinarCombustion(tipoCombustionString);
                if (transmision != null & combustion != null) {
                    if (radioMoto.isSelected()) {
                        if (defensasString.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setHeaderText(null);
                            alert.setTitle("ERROR");
                            alert.setContentText("Debes rellenar los espacios: Defensas.");
                            alert.showAndWait();
                        } else {
                            boolean defensas = ingresarBooleano(txtDefensas, "Defensas");
                            Vehiculo vehiculo = new Moto(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje,
                                    defensas, combustion, transmision);
                            if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                vehiculoAgregado = vehiculo;
                                generarSolicitudTransaccion();
                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("ERROR");
                                alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                alert.showAndWait();
                            }
                        }
                    } else if (radioCamion.isSelected()) {
                        if (capacidadCargaString.isEmpty() || aireAcondicionadoString.isEmpty()
                                || frenosAireString.isEmpty() || absString.isEmpty() || numeroEjesString.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setHeaderText(null);
                            alert.setTitle("ERROR");
                            alert.setContentText(
                                    "Debes rellenar los espacios: Capacidad Carga, Aire Acondicionado, Frenos Aire, Abs o Numero Ejes.");
                            alert.showAndWait();
                        } else {
                            double capacidadCarga = Double.parseDouble(capacidadCargaString);
                            boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionado, "Aire Acondicionado");
                            boolean frenosAire = ingresarBooleano(txtFrenosAire, "Frenos Aire");
                            boolean abs = ingresarBooleano(txtAbs, "Abs");
                            TipoCamion tipoCamion = determinarCamion(tipoCamionString);
                            int numeroEjes = Integer.parseInt(numeroEjesString);
                            if (tipoCamion != null) {
                                Vehiculo vehiculo = new Camion(codigo, marca, modelo, nuevo, cambios, velMax,
                                        cilindraje,
                                        capacidadCarga, aireAcondicionado, frenosAire, abs, numeroEjes, tipoCamion,
                                        combustion,
                                        transmision);
                                if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                    ventaClienteController.agregarVehiculoVenta(vehiculo);
                                    vehiculo.setEstado(Estado.NODISPONIBLE);
                                    vehiculoAgregado = vehiculo;
                                    generarSolicitudTransaccion();
                                } else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setHeaderText(null);
                                    alert.setTitle("ERROR");
                                    alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                    alert.showAndWait();
                                }
                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("ERROR");
                                alert.setContentText("Verifique el campo: Tipo Camion.");
                                alert.showAndWait();
                            }
                        }
                    } else if (radioHibrido.isSelected()) {
                        if (enchufableString.isEmpty() || ligeroString.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setHeaderText(null);
                            alert.setTitle("ERROR");
                            alert.setContentText("Verifique los campos: Enchufable o Ligero.");
                            alert.showAndWait();
                        } else {
                            boolean enchufable = ingresarBooleano(txtEnchufable, "Enchufable");
                            boolean ligero = ingresarBooleano(txtLigero, "Ligero");
                            Vehiculo vehiculo = new VehiculoHibrido(codigo, marca, modelo, nuevo, cambios, velMax,
                                    cilindraje, enchufable, ligero, combustion, transmision);
                            if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                vehiculoAgregado = vehiculo;
                                generarSolicitudTransaccion();
                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("ERROR");
                                alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                alert.showAndWait();
                            }
                        }
                    } else if (radioElectrico.isSelected()) {
                        if (autonomiaString.isEmpty() || tiempoCargaString.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setHeaderText(null);
                            alert.setTitle("ERROR");
                            alert.setContentText("Verifique los campos: Autonomia o Tiempo Carga.");
                            alert.showAndWait();
                        } else {
                            double autonomia = Double.parseDouble(autonomiaString);
                            double tiempoCarga = Double.parseDouble(tiempoCargaString);
                            Vehiculo vehiculo = new VehiculoElectrico(codigo, marca, modelo, nuevo, cambios, velMax,
                                    cilindraje, autonomia, tiempoCarga, Combustion.SINCOMBUSTION, transmision);
                            if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                vehiculoAgregado = vehiculo;
                                generarSolicitudTransaccion();
                            } else {
                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                alert.setHeaderText(null);
                                alert.setTitle("ERROR");
                                alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                alert.showAndWait();
                            }
                        }
                    } else {
                        if (numeroPasajerosString.isEmpty() || numeroPuertasString.isEmpty()
                                || numeroBolsasAireString.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setHeaderText(null);
                            alert.setTitle("ERROR");
                            alert.setContentText(
                                    "Debes rellenar los espacios: Numero Pasajeros, Numero Puertas o Numero Bolsas Aire.");
                            alert.showAndWait();
                        } else {
                            int numeroPasajeros = Integer.parseInt(numeroPasajerosString);
                            int numeroPuertas = Integer.parseInt(numeroPuertasString);
                            int numeroBolsasAire = Integer.parseInt(numeroBolsasAireString);
                            if (radioDeportivo.isSelected()) {
                                if (caballosFuerzaString.isEmpty() || tiempoCeroCienString.isEmpty()) {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setHeaderText(null);
                                    alert.setTitle("ERROR");
                                    alert.setContentText("Verifique los campos: Caballos Fuerza o Tiempo Cero a Cien.");
                                    alert.showAndWait();
                                } else {
                                    int caballosFuerza = Integer.parseInt(caballosFuerzaString);
                                    double tiempoCeroCien = Double.parseDouble(tiempoCeroCienString);
                                    Vehiculo vehiculo = new Deportivo(codigo, marca, modelo, nuevo, cambios, velMax,
                                            cilindraje, numeroPasajeros, numeroPuertas, numeroBolsasAire, combustion,
                                            transmision, caballosFuerza, tiempoCeroCien);
                                    if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                        ventaClienteController.agregarVehiculoVenta(vehiculo);
                                        vehiculo.setEstado(Estado.NODISPONIBLE);
                                        vehiculoAgregado = vehiculo;
                                        generarSolicitudTransaccion();
                                    } else {
                                        Alert alert = new Alert(Alert.AlertType.ERROR);
                                        alert.setHeaderText(null);
                                        alert.setTitle("ERROR");
                                        alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                        alert.showAndWait();
                                    }
                                }
                            } else {
                                if (aireAcondicionadoString.isEmpty() || absString.isEmpty()) {
                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                    alert.setHeaderText(null);
                                    alert.setTitle("ERROR");
                                    alert.setContentText(
                                            "Debes rellenar los espacios: Aire Acondicionado o Abs.");
                                    alert.showAndWait();
                                } else {
                                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionado,
                                            "Aire Acondicionado");
                                    boolean abs = ingresarBooleano(txtAbs, "Abs");
                                    if (radioPickUp.isSelected()) {
                                        if (traccionString.isEmpty() || capacidadCargaString.isEmpty()) {
                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                            alert.setHeaderText(null);
                                            alert.setTitle("ERROR");
                                            alert.setContentText(
                                                    "Verifique los campos: Traccion o Capacidad Carga.");
                                            alert.showAndWait();
                                        } else {
                                            boolean traccion = ingresarBooleano(txtTraccion, "Traccion");
                                            double capacidadCarga = Double.parseDouble(capacidadCargaString);
                                            Vehiculo vehiculo = new PickUp(codigo, marca, modelo, nuevo, cambios,
                                                    velMax, cilindraje, numeroPasajeros, numeroPuertas,
                                                    numeroBolsasAire, combustion, transmision, aireAcondicionado, abs,
                                                    traccion, capacidadCarga);
                                            if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                                vehiculoAgregado = vehiculo;
                                                generarSolicitudTransaccion();
                                            } else {
                                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                                alert.setHeaderText(null);
                                                alert.setTitle("ERROR");
                                                alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                                alert.showAndWait();
                                            }
                                        }
                                    } else if (radioVan.isSelected()) {
                                        if (camaraReversaString.isEmpty() || capacidadMaleteroString.isEmpty()) {
                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                            alert.setHeaderText(null);
                                            alert.setTitle("ERROR");
                                            alert.setContentText(
                                                    "Verifique los campos: Camara Reversa o Capacidad Maletero.");
                                            alert.showAndWait();
                                        } else {
                                            boolean camaraReversa = ingresarBooleano(txtCamaraReversa,
                                                    "Camara Reversa");
                                            double capacidadMaletero = Double.parseDouble(capacidadMaleteroString);
                                            Vehiculo vehiculo = new Van(codigo, marca, modelo, nuevo, cambios, velMax,
                                                    cilindraje, numeroPasajeros, numeroPuertas, numeroBolsasAire,
                                                    combustion, transmision, aireAcondicionado, abs, camaraReversa,
                                                    capacidadMaletero);
                                            if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                                vehiculoAgregado = vehiculo;
                                                generarSolicitudTransaccion();
                                            } else {
                                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                                alert.setHeaderText(null);
                                                alert.setTitle("ERROR");
                                                alert.setContentText("Por favor cambia el codigo del vehiculo.");
                                                alert.showAndWait();
                                            }
                                        }
                                    } else {
                                        if (velocidadCruceroString.isEmpty() || capacidadMaleteroString.isEmpty()) {
                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                            alert.setHeaderText(null);
                                            alert.setTitle("ERROR");
                                            alert.setContentText(
                                                    "Debes rellenar los espacios: Velocidad Crucero o Capacidad Maletero.");
                                            alert.showAndWait();
                                        } else {
                                            boolean velocidadCrucero = ingresarBooleano(txtVelocidadCrucero,
                                                    "Velocidad Crucero");
                                            double capacidadMaletero = Double.parseDouble(capacidadMaleteroString);
                                            if (radioBus.isSelected()) {
                                                if (numeroEjesString.isEmpty()
                                                        || numeroSalidasEmergenciaString.isEmpty()) {
                                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                                    alert.setHeaderText(null);
                                                    alert.setTitle("ERROR");
                                                    alert.setContentText(
                                                            "Verifique los campos: Numero Ejes o Numero Salidas de Emergencia.");
                                                    alert.showAndWait();
                                                } else {
                                                    int numeroEjes = Integer.parseInt(numeroEjesString);
                                                    int numeroSalidasEmergencia = Integer
                                                            .parseInt(numeroSalidasEmergenciaString);
                                                    Vehiculo vehiculo = new Bus(codigo, marca, modelo, nuevo, cambios,
                                                            velMax, cilindraje, numeroPasajeros, numeroPuertas,
                                                            numeroBolsasAire, combustion, transmision,
                                                            aireAcondicionado, abs, velocidadCrucero, capacidadMaletero,
                                                            numeroEjes, numeroSalidasEmergencia);
                                                    if (ventaClienteController.verificarVehiculo(codigo) == null) {
                                                        ventaClienteController.agregarVehiculoVenta(vehiculo);
                                                        vehiculo.setEstado(Estado.NODISPONIBLE);
                                                        vehiculoAgregado = vehiculo;
                                                        generarSolicitudTransaccion();
                                                    } else {
                                                        Alert alert = new Alert(Alert.AlertType.ERROR);
                                                        alert.setHeaderText(null);
                                                        alert.setTitle("ERROR");
                                                        alert.setContentText(
                                                                "Por favor cambia el codigo del vehiculo.");
                                                        alert.showAndWait();
                                                    }
                                                }
                                            } else {
                                                if (camaraReversaString.isEmpty() || sensorColisionString.isEmpty()
                                                        || sensorTraficoCruzadoString.isEmpty()
                                                        || asistentePermanenciaCarrilString.isEmpty()) {
                                                    Alert alert = new Alert(Alert.AlertType.ERROR);
                                                    alert.setHeaderText(null);
                                                    alert.setTitle("ERROR");
                                                    alert.setContentText(
                                                            "Debes rellenar los espacios: Camara Reversa, Sensor Colision, Sensor Trafico Cruzado o Asistente Permanencia Carril.");
                                                    alert.showAndWait();
                                                } else {
                                                    boolean camaraReversa = ingresarBooleano(txtCamaraReversa,
                                                            "Camara Reversa");
                                                    boolean sensorColision = ingresarBooleano(txtSensorColision,
                                                            "Sensor Colision");
                                                    boolean sensorTraficoCruzado = ingresarBooleano(
                                                            txtSensorTraficoCruzado, "Sensor Trafico Cruzado");
                                                    boolean asistentePermanenciaCarril = ingresarBooleano(
                                                            txtAsistentePermanenciaCarril,
                                                            "Asistente Permanencia Carril");
                                                    if (radioSedan.isSelected()) {
                                                        if (espejosElectricoString.isEmpty()) {
                                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                                            alert.setHeaderText(null);
                                                            alert.setTitle("ERROR");
                                                            alert.setContentText(
                                                                    "Verifique los campos: Espejos Electricos.");
                                                            alert.showAndWait();
                                                        } else {
                                                            boolean espejosElectricos = ingresarBooleano(
                                                                    txtEspejosElectricos, "Espejos Electricos");
                                                            Vehiculo vehiculo = new Sedan(codigo, marca, modelo, nuevo,
                                                                    cambios, velMax, cilindraje, numeroPasajeros,
                                                                    numeroPuertas, numeroBolsasAire, combustion,
                                                                    transmision, aireAcondicionado, abs,
                                                                    velocidadCrucero, capacidadMaletero, camaraReversa,
                                                                    sensorColision, sensorTraficoCruzado,
                                                                    asistentePermanenciaCarril, espejosElectricos);
                                                            if (ventaClienteController
                                                                    .verificarVehiculo(codigo) == null) {
                                                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                                                vehiculoAgregado = vehiculo;
                                                                generarSolicitudTransaccion();
                                                            } else {
                                                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                                                alert.setHeaderText(null);
                                                                alert.setTitle("ERROR");
                                                                alert.setContentText(
                                                                        "Por favor cambia el codigo del vehiculo.");
                                                                alert.showAndWait();
                                                            }
                                                        }
                                                    } else if (radioCamioneta.isSelected()) {
                                                        if (traccionString.isEmpty()) {
                                                            Alert alert = new Alert(Alert.AlertType.ERROR);
                                                            alert.setHeaderText(null);
                                                            alert.setTitle("ERROR");
                                                            alert.setContentText(
                                                                    "Verifique los campos: Traccion.");
                                                            alert.showAndWait();
                                                        } else {
                                                            boolean traccion = ingresarBooleano(txtTraccion,
                                                                    "Traccion");
                                                            Vehiculo vehiculo = new Camioneta(codigo, marca, modelo,
                                                                    nuevo, cambios, velMax, cilindraje, numeroPasajeros,
                                                                    numeroPuertas, numeroBolsasAire, combustion,
                                                                    transmision, aireAcondicionado, abs,
                                                                    velocidadCrucero, capacidadMaletero, camaraReversa,
                                                                    sensorColision, sensorTraficoCruzado,
                                                                    asistentePermanenciaCarril, traccion);
                                                            if (ventaClienteController
                                                                    .verificarVehiculo(codigo) == null) {
                                                                ventaClienteController.agregarVehiculoVenta(vehiculo);
                                                                vehiculo.setEstado(Estado.NODISPONIBLE);
                                                                vehiculoAgregado = vehiculo;
                                                                generarSolicitudTransaccion();
                                                            } else {
                                                                Alert alert = new Alert(Alert.AlertType.ERROR);
                                                                alert.setHeaderText(null);
                                                                alert.setTitle("ERROR");
                                                                alert.setContentText(
                                                                        "Por favor cambia el codigo del vehiculo.");
                                                                alert.showAndWait();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("ERROR");
                    alert.setContentText("Verifique los campos: Tipo de Transmision o Tipo de Combustion.");
                    alert.showAndWait();
                }
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Verifique la informacion ingresada.");
            alert.showAndWait();
        }
    }

    private boolean ingresarBooleano(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim().toLowerCase();

        if (valor.equals("si")) {
            return true;
        } else if (valor.equals("no")) {
            return false;
        } else {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Valor no válido");
            alerta.setHeaderText("El campo " + nombreCampo + " contiene un valor no válido.");
            alerta.setContentText("Por favor, ingrese 'si' o 'no'.");
            alerta.showAndWait();
            throw new IllegalArgumentException("Valor no válido para el campo " + nombreCampo);
        }
    }

    private Transmision determinarTransmision(String transmisionString) {
        Transmision transmision = null;
        if (transmisionString.equals("automatico")) {
            transmision = Transmision.AUTOMATICO;
        } else if (transmisionString.equals("manual")) {
            transmision = Transmision.MANUAL;
        }
        return transmision;
    }

    private Combustion determinarCombustion(String combustionString) {
        Combustion combustion = null;
        if (combustionString.equals("gasolina")) {
            combustion = Combustion.GASOLINA;
        } else if (combustionString.equals("diesel")) {
            combustion = Combustion.DIESEL;
        } else if (combustionString.contains("sin combustion")) {
            combustion = Combustion.SINCOMBUSTION;
        }
        return combustion;
    }

    private TipoCamion determinarCamion(String tipoCamionString) {
        TipoCamion tipoCamion = null;
        if (tipoCamionString.equals("ligero")) {
            tipoCamion = TipoCamion.LIGERO;
        } else if (tipoCamionString.equals("mediano")) {
            tipoCamion = TipoCamion.MEDIANO;
        } else if (tipoCamionString.equals("pesado")) {
            tipoCamion = TipoCamion.PESADO;
        }
        return tipoCamion;
    }

    private void generarSolicitudTransaccion() {
        venderVehiculo = true;
        app.openSolicitudClienteView();
    }

    @FXML
    void regresarCliente(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
        app.openClienteView();
    }

    public Vehiculo getVehiculo() {
        return vehiculoAgregado;
    }

    public void setApp(App app) {
        this.app = app;
    }

}
