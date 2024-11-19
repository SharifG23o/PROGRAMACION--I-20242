package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DatosVehiculoController;
import co.edu.uniquindio.poo.controller.LoginController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Cliente;
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
import co.edu.uniquindio.poo.model.Estado;
import javafx.event.ActionEvent;

public class DatosVehiculoViewController {

    @FXML
    private TextField txtCapacidadMaleteroCamioneta;

    @FXML
    private TextField txtNumeroBolsasAirePickUp;

    @FXML
    private TextField txtAireAcondicionadoPickUp;

    @FXML
    private RadioButton radioVan;

    @FXML
    private RadioButton radioMoto;

    @FXML
    private TextField txtNumeroBolsasAireDeportivo;

    @FXML
    private TextField txtAireAcondicionadoVan;

    @FXML
    private TextField txtCamaraReversaVan;

    @FXML
    private TextField txtNumeroBolsasAireCamioneta;

    @FXML
    private TextField txtSensorTraficoCruzadoSedan;

    @FXML
    private TextField txtEnchufableHibrido;

    @FXML
    private TextField txtAutonomiaElectrico;

    @FXML
    private TextField txtNumeroBolsasAireSedan;

    @FXML
    private TextField txtNumeroPasajerosPickUp;

    @FXML
    private RadioButton radioDiesel;

    @FXML
    private RadioButton radioManual;

    @FXML
    private RadioButton radioHibrido;

    @FXML
    private TextField txtNumeroPuertasPickUp;

    @FXML
    private TextField txtNumeroPasajerosBus;

    @FXML
    private TextField txtNumeroPasajerosCamioneta;

    @FXML
    private TextField txtSensorColisionCamioneta;

    @FXML
    private TextField txtCapacidadCargaPickUp;

    @FXML
    private TextField txtCaballosFuerzaDeportivo;

    @FXML
    private TextField txtNumeroPuertasSedan;

    @FXML
    private TextField txtVelocidadCruceroCamioneta;

    @FXML
    private TextField txtCapacidadMaleteroVan;

    @FXML
    private TextField txtNumeroPuertasCamioneta;

    @FXML
    private TextField txtVelocidadCruceroBus;

    @FXML
    private TextField txtNuevo;

    @FXML
    private TextField txtAireAcondicionadoCamion;

    @FXML
    private Label labelHibrido;

    @FXML
    private TextField txtTraccionPickUp;

    @FXML
    private TextField txtNumeroBolsasAireBus;

    @FXML
    private TextField txtAbsBus;

    @FXML
    private TextField txtAbsSedan;

    @FXML
    private Label labelElectrico;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtAireAcondicionadoSedan;

    @FXML
    private RadioButton radioCamioneta;

    @FXML
    private TextField txtAbsPickUp;

    @FXML
    private TextField txtLigeroHibrido;

    @FXML
    private VBox vboxTipoVehiculo;

    @FXML
    private TextField txtSensorColisionSedan;

    @FXML
    private Button btnSalir;

    @FXML
    private Label labelMoto;

    @FXML
    private TextField txtAbsCamioneta;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtVelMax;

    @FXML
    private Button btnGuardar;

    @FXML
    private RadioButton radioElectrico;

 

    @FXML
    private RadioButton radioPickUp;

    @FXML
    private TextField txtVelocidadCruceroSedan;

    @FXML
    private TextField txtCapacidadMaleteroSedan;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtNumeroPuertasBus;

    @FXML
    private RadioButton radioDeportivo;

    @FXML
    private TextField txtAbsCamion;

    @FXML
    private TextField txtAbsVan;

    @FXML
    private TextField txtNumeroPasajerosVan;

    @FXML
    private TextField txtTiempoCargaElectrico;

    @FXML
    private Label labelSedan;

    @FXML
    private TextField txtNumeroPuertasVan;

    @FXML
    private TextField txtNumeroEjesBus;

    @FXML
    private TextField txtCamaraReversaSedan;

    @FXML
    private RadioButton radioSinCombustion;

    @FXML
    private Label labelDeportivo;

    @FXML
    private TextField txtNumeroPuertasDeportivo;

    @FXML
    private RadioButton radioBus;

    @FXML
    private Label labelCamioneta;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Label labelCamion;

    @FXML
    private TextField txtAireAcondicionadoBus;

    @FXML
    private RadioButton radioAutomatico;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private Label labelVan;

    @FXML
    private TextField txtNumeroBolsasAireVan;

    @FXML
    private Button btnCargarDatos;

    @FXML
    private RadioButton radioCamion;

    @FXML
    private TextField txtDefensas;

    @FXML
    private TextField txtTraccionCamioneta;

    @FXML
    private RadioButton radioGasolina;

    @FXML
    private TextField txtNumeroPasajerosSedan;

    @FXML
    private TextField txtAsistentePermanenciaCarrilSedan;

    @FXML
    private TextField txtAsistentePermanenciaCarrilCamioneta;

    @FXML
    private Label labelPickUp;

    @FXML
    private TextField txtAireAcondicionadoCamioneta;

    @FXML
    private TextField txtTiempoCeroCienDeportivo;

    @FXML
    private TextField txtFrenosAire;

    @FXML
    private TextField txtCamaraReversaCamioneta;

    @FXML
    private TextField txtEspejosElectricosSedan;

    @FXML
    private TextField txtNumeroPasajerosDeportivo;

    @FXML
    private Label labelBus;

    @FXML
    private TextField txtCapacidadMaleteroBus;

   

    @FXML
    private TextField txtNumeroSalidasEmergenciaBus;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TextField txtCapacidadCargaCamion;

    @FXML
    private RadioButton radioSedan;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtSensorTraficoCruzadoCamioneta;

    @FXML
    private RadioButton radioLigero;

    @FXML
    private RadioButton radioMediano;

    @FXML
    private RadioButton radioPesado;

    private App app;
    DatosVehiculoController datosVehiculoController;
    private ToggleGroup tipoVehiculoGroup;
    private ToggleGroup tipoCombustionGroup;
    private ToggleGroup tipoTransmisionGroup;
    private ToggleGroup tipoCamionGroup;
    private boolean motoT;
    private boolean camionT;
    private boolean busT;
    private boolean vanT;
    private boolean pickUpT;
    private boolean deportivoT;
    private boolean sedanT;
    private boolean camionetaT;
    private boolean electricoT;
    private boolean hibridoT;

    @FXML
    void initialize() {
        datosVehiculoController = new DatosVehiculoController(app.concesionario);
        tipoVehiculoGroup = new ToggleGroup();
        tipoCombustionGroup = new ToggleGroup();
        tipoTransmisionGroup = new ToggleGroup();
        tipoCamionGroup = new ToggleGroup();
        agruparTipoVehiculoBtn();
        agruparTipoCombustionBtn();
        agruparTipoTransmisionBtn();
        agruparTipoCamionBtn();
        motoT = false;
        camionT = false;
        busT = false;
        vanT = false;
        pickUpT = false;
        deportivoT = false;
        sedanT = false;
        camionetaT = false;
        electricoT = false;
        hibridoT = false;

    }

    private void agruparTipoCamionBtn() {
        radioLigero.setToggleGroup(tipoCamionGroup);
        radioMediano.setToggleGroup(tipoCamionGroup);
        radioPesado.setToggleGroup(tipoCamionGroup);
    }

    private void agruparTipoCombustionBtn() {
        radioGasolina.setToggleGroup(tipoCombustionGroup);
        radioDiesel.setToggleGroup(tipoCombustionGroup);
        radioSinCombustion.setToggleGroup(tipoCombustionGroup);
    }

    private void agruparTipoTransmisionBtn() {
        radioAutomatico.setToggleGroup(tipoTransmisionGroup);
        radioManual.setToggleGroup(tipoTransmisionGroup);
    }

    private void agruparTipoVehiculoBtn() {
        radioMoto.setToggleGroup(tipoVehiculoGroup);
        radioCamion.setToggleGroup(tipoVehiculoGroup);
        radioBus.setToggleGroup(tipoVehiculoGroup);
        radioVan.setToggleGroup(tipoVehiculoGroup);
        radioPickUp.setToggleGroup(tipoVehiculoGroup);
        radioDeportivo.setToggleGroup(tipoVehiculoGroup);
        radioCamioneta.setToggleGroup(tipoVehiculoGroup);
        radioSedan.setToggleGroup(tipoVehiculoGroup);
        radioElectrico.setToggleGroup(tipoVehiculoGroup);
        radioHibrido.setToggleGroup(tipoVehiculoGroup);

    }

    @FXML
    void determinarVehiculo(ActionEvent event) {

        labelMoto.setTextFill(Color.WHITE);
        labelCamion.setTextFill(Color.WHITE);
        labelCamioneta.setTextFill(Color.WHITE);
        labelBus.setTextFill(Color.WHITE);
        labelVan.setTextFill(Color.WHITE);
        labelPickUp.setTextFill(Color.WHITE);
        labelDeportivo.setTextFill(Color.WHITE);
        labelSedan.setTextFill(Color.WHITE);
        labelElectrico.setTextFill(Color.WHITE);
        labelHibrido.setTextFill(Color.WHITE);

        if (radioMoto.isSelected()) {
            labelMoto.setTextFill(Color.RED);
        } else if (radioCamion.isSelected()) {
            labelCamion.setTextFill(Color.RED);
        } else if (radioCamion.isSelected()) {
            labelCamioneta.setTextFill(Color.RED);
        } else if (radioBus.isSelected()) {
            labelBus.setTextFill(Color.RED);
        } else if (radioVan.isSelected()) {
            labelVan.setTextFill(Color.RED);
        } else if (radioPickUp.isSelected()) {
            labelPickUp.setTextFill(Color.RED);
        } else if (radioDeportivo.isSelected()) {
            labelDeportivo.setTextFill(Color.RED);
        } else if (radioSedan.isSelected()) {
            labelSedan.setTextFill(Color.RED);
        } else if (radioElectrico.isSelected()) {
            labelElectrico.setTextFill(Color.RED);
        } else if (radioHibrido.isSelected()) {
            labelHibrido.setTextFill(Color.RED);
        }
    }

    private void deshabilitartipoVehiculo() {
        radioMoto.setDisable(true);
        radioCamion.setDisable(true);
        radioBus.setDisable(true);
        radioVan.setDisable(true);
        radioPickUp.setDisable(true);
        radioDeportivo.setDisable(true);
        radioSedan.setDisable(true);
        radioCamioneta.setDisable(true);
        radioElectrico.setDisable(true);
        radioHibrido.setDisable(true);
    }

    @FXML
    void determinarCombustion(ActionEvent event) {
        if (radioGasolina.isSelected()) {
            datosVehiculoController.setCombustion(Combustion.GASOLINA);
        } else if (radioDiesel.isSelected()) {
            datosVehiculoController.setCombustion(Combustion.DIESEL);
        } else if (radioSinCombustion.isSelected()) {
            datosVehiculoController.setCombustion(Combustion.SINCOMBUSTION);
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Seleccionar Combustión");
            alerta.setHeaderText("No se ha seleccionado un tipo de combustión");
            alerta.setContentText("Por favor, seleccione una opción válida.");
            alerta.showAndWait();
        }
    }

    @FXML
    void determinarTransmision(ActionEvent event) {
        if (radioAutomatico.isSelected()) {
            datosVehiculoController.setTransmision(Transmision.AUTOMATICO);
        } else if (radioManual.isSelected()) {
            datosVehiculoController.setTransmision(Transmision.MANUAL);
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Seleccionar Transmision");
            alerta.setHeaderText("No se ha seleccionado un tipo de transmision");
            alerta.setContentText("Por favor, seleccione una opción válida.");
            alerta.showAndWait();
        }

    }

    @FXML
    void determinarCamion(ActionEvent event) {
        if (radioLigero.isSelected()) {
            datosVehiculoController.setTipoCamion(TipoCamion.LIGERO);
        } else if (radioMediano.isSelected()) {
            datosVehiculoController.setTipoCamion(TipoCamion.MEDIANO);
        } else if (radioPesado.isSelected()) {
            datosVehiculoController.setTipoCamion(TipoCamion.PESADO);
        }

    }

    private void determinarEstado() {
        datosVehiculoController.setEstado(Estado.DISPONIBLE);
    }

    @FXML
    void btnGuardarAction(ActionEvent event) {
        
        if (app.getEmpleadoViewController().agregarVehiculo) {
            
            agregarVehiculo(event);
        } else if (app.getEmpleadoViewController().modificarVehiculo) {
  
            btnActualizarAction(event);
        }
    }



    private void btnActualizarAction(ActionEvent event) {

        Vehiculo vehiculo = app.getEmpleadoViewController().getSelectedVehiculo();

        if (vehiculo == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Vehículo no seleccionado");
            alerta.setContentText("Por favor, selecciona un vehículo antes de intentar actualizar.");
            alerta.showAndWait();
            return;
        }

        txtCodigo.setEditable(false);
        deshabilitartipoVehiculo();

        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String nuevoAux = txtNuevo.getText().toLowerCase();
        boolean nuevo = nuevoAux.equals("si");
        int cambios = ingresarEntero(txtCambios, "Cambios");
        double velMax = ingresarDouble(txtVelMax, "Velocidad Máxima");
        double cilindraje = ingresarDouble(txtCilindraje, "Cilindraje");
        determinarCombustion(event);
        Combustion combustion = datosVehiculoController.getCombustion();
        determinarTransmision(event);
        Transmision transmision = datosVehiculoController.getTransmision();

        if (marca.isEmpty() || modelo.isEmpty() || nuevoAux.isEmpty() || combustion == null
                || transmision == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText("Todos los campos son obligatorios");
            alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
            alerta.showAndWait();

        } else if (cambios <= 0 || velMax <= 0 || cilindraje <= 0) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Datos Erróneos");
            alerta.setHeaderText("Cambios, Velocidad Máxima o Cilindraje son erróneos.");
            alerta.setContentText("No pueden haber datos numéricos menores o iguales a 0.");
            alerta.showAndWait();

        } else {

            try {

                vehiculo.setMarca(marca);
                vehiculo.setModelo(modelo);
                vehiculo.setNuevo(nuevo);
                vehiculo.setCambios(cambios);
                vehiculo.setVelMax(velMax);
                vehiculo.setCilindraje(cilindraje);
                vehiculo.setCombustion(combustion);
                vehiculo.setTransmision(transmision);

                if (vehiculo instanceof Moto) {
                    boolean defensas = ingresarBooleano(txtDefensas, "Defensas Moto");
                    ((Moto) vehiculo).setDefensas(defensas);

                } else if (vehiculo instanceof Camion) {

                    double capacidadCarga = ingresarDouble(txtCapacidadCargaCamion, "Capacidad de Carga");
                    int numEjes = ingresarEntero(txtNumeroEjes, "Número de Ejes");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoCamion,
                            "Aire Acondicionado Camion");
                    boolean abs = ingresarBooleano(txtAbsCamion, "ABS Camion");
                    boolean frenosAire = ingresarBooleano(txtFrenosAire, "Frenos Aire Camion");
                    ((Camion) vehiculo).setCapacidadCarga(capacidadCarga);
                    ((Camion) vehiculo).setNumeroEjes(numEjes);
                    ((Camion) vehiculo).setAireAcondicionado(aireAcondicionado);
                    ((Camion) vehiculo).setAbs(abs);
                    ((Camion) vehiculo).setFrenosAire(frenosAire);

                } else if (vehiculo instanceof Bus) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosBus, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasBus, "Número de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireBus, "Número de Bolsas de Aire");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroBus, "Capacidad Maletero");
                    boolean abs = ingresarBooleano(txtAbsBus, "ABS Bus");
                    ((Bus) vehiculo).setNumeroPasajeros(numPasajeros);
                    ((Bus) vehiculo).setNumeroPuertas(numPuertas);
                    ((Bus) vehiculo).setNumeroBolsasAire(numBolsaAire);
                    ((Bus) vehiculo).setCapacidadMaletero(capacidadMaletero);
                    ((Bus) vehiculo).setAbs(abs);

                } else if (vehiculo instanceof Van) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosVan, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasVan, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireVan, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoVan, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsVan, "ABS");
                    boolean camaraReversaVan = ingresarBooleano(txtCamaraReversaVan, "Camara de Reversa");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroVan, "Capacidad Maletero");

                    ((Van) vehiculo).setNumeroPasajeros(numPasajeros);
                    ((Van) vehiculo).setNumeroPuertas(numPuertas);
                    ((Van) vehiculo).setNumeroBolsasAire(numBolsaAire);
                    ((Van) vehiculo).setAireAcondicionado(aireAcondicionado);
                    ((Van) vehiculo).setAbs(abs);
                    ((Van) vehiculo).setCamaraReversa(camaraReversaVan);
                    ((Van) vehiculo).setCapacidadMaletero(capacidadMaletero);

                } else if (vehiculo instanceof PickUp) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosPickUp, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasPickUp, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAirePickUp, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoPickUp, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsPickUp, "ABS");
                    boolean traccion = ingresarBooleano(txtTraccionPickUp, "Tracción");
                    double capacidadCarga = ingresarDouble(txtCapacidadCargaPickUp, "Capacidad de Carga");

                    ((PickUp) vehiculo).setNumeroPasajeros(numPasajeros);
                    ((PickUp) vehiculo).setNumeroPuertas(numPuertas);
                    ((PickUp) vehiculo).setNumeroBolsasAire(numBolsaAire);
                    ((PickUp) vehiculo).setAireAcondicionado(aireAcondicionado);
                    ((PickUp) vehiculo).setAbs(abs);
                    ((PickUp) vehiculo).setTraccion(traccion);
                    ((PickUp) vehiculo).setCapacidadCarga(capacidadCarga);

                } else if (vehiculo instanceof Deportivo) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosDeportivo, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasDeportivo, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireDeportivo, "Numero de Bolsas de Aire");
                    int caballosFuerza = ingresarEntero(txtCaballosFuerzaDeportivo, "Caballos de Fuerza");
                    double tiempoCeroCien = ingresarDouble(txtTiempoCeroCienDeportivo, "Tiempo de 0 a 100");

                    ((Deportivo) vehiculo).setNumeroPasajeros(numPasajeros);
                    ((Deportivo) vehiculo).setNumeroPuertas(numPuertas);
                    ((Deportivo) vehiculo).setNumeroBolsasAire(numBolsaAire);
                    ((Deportivo) vehiculo).setCaballosFuerza(caballosFuerza);
                    ((Deportivo) vehiculo).setTiempoCeroCien(tiempoCeroCien);

                } else if (vehiculo instanceof Sedan) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosSedan, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasSedan, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireSedan, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoSedan, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsSedan, "ABS");
                    boolean velocidadCrucero = ingresarBooleano(txtVelocidadCruceroSedan, "Velocidad Crucero");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroSedan, "Capacidad Maletero");
                    boolean camaraReversa = ingresarBooleano(txtCamaraReversaSedan, "Camara de Reversa");
                    boolean sensorColicion = ingresarBooleano(txtSensorColisionSedan, "Sensor de Colicion");
                    boolean sensorTraficoCruzado = ingresarBooleano(txtSensorTraficoCruzadoSedan,
                            "Sensor de Trafico Cruzado");
                    boolean asistentePermanenciaCarril = ingresarBooleano(txtAsistentePermanenciaCarrilSedan,
                            "Asistente de Permanencia en el Carril");
                    boolean espejosElectricos = ingresarBooleano(txtEspejosElectricosSedan, "Espejos Electricos");

                    ((Sedan) vehiculo).setNumeroPasajeros(numPasajeros);
                    ((Sedan) vehiculo).setNumeroPuertas(numPuertas);
                    ((Sedan) vehiculo).setNumeroBolsasAire(numBolsaAire);
                    ((Sedan) vehiculo).setAireAcondicionado(aireAcondicionado);
                    ((Sedan) vehiculo).setAbs(abs);
                    ((Sedan) vehiculo).setVelocidadCrucero(velocidadCrucero);
                    ((Sedan) vehiculo).setCapacidadMaletero(capacidadMaletero);
                    ((Sedan) vehiculo).setCamaraReversa(camaraReversa);
                    ((Sedan) vehiculo).setSensorColision(sensorColicion);
                    ((Sedan) vehiculo).setSensorTraficoCruzado(sensorTraficoCruzado);
                    ((Sedan) vehiculo).setAsistentePermanenciaCarril(asistentePermanenciaCarril);
                    ((Sedan) vehiculo).setEspejosElectricos(espejosElectricos);

                } else if (vehiculo instanceof Camioneta) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosCamioneta, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasCamioneta, "Numero de Puertas");
                    int numBolsasAire = ingresarEntero(txtNumeroBolsasAireCamioneta, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoCamioneta, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsCamioneta, "ABS");
                    boolean velocidadCrucero = ingresarBooleano(txtVelocidadCruceroCamioneta, "Velocidad Crucero");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroCamioneta, "Capacidad Maletero");
                    boolean camaraReversa = ingresarBooleano(txtCamaraReversaCamioneta, "Camara de Reversa");
                    boolean sensorColision = ingresarBooleano(txtSensorColisionCamioneta, "Sensor de Colicion");
                    boolean sensorTraficoCruzado = ingresarBooleano(txtSensorTraficoCruzadoCamioneta,
                            "Sensor de Trafico Cruzado");
                    boolean asistentePermanenciaCarril = ingresarBooleano(txtAsistentePermanenciaCarrilCamioneta,
                            "Asistente de Permanencia en el Carril");
                    boolean traccion = ingresarBooleano(txtTraccionCamioneta, "Tracción");

                    ((Camioneta) vehiculo).setNumeroPasajeros(numPasajeros);
                    ((Camioneta) vehiculo).setNumeroPuertas(numPuertas);
                    ((Camioneta) vehiculo).setNumeroBolsasAire(numBolsasAire);
                    ((Camioneta) vehiculo).setAireAcondicionado(aireAcondicionado);
                    ((Camioneta) vehiculo).setAbs(abs);
                    ((Camioneta) vehiculo).setVelocidadCrucero(velocidadCrucero);
                    ((Camioneta) vehiculo).setCapacidadMaletero(capacidadMaletero);
                    ((Camioneta) vehiculo).setCamaraReversa(camaraReversa);
                    ((Camioneta) vehiculo).setSensorColision(sensorColision);
                    ((Camioneta) vehiculo).setSensorTraficoCruzado(sensorTraficoCruzado);
                    ((Camioneta) vehiculo).setAsistentePermanenciaCarril(asistentePermanenciaCarril);
                    ((Camioneta) vehiculo).setTraccion(traccion);

                } else if (vehiculo instanceof VehiculoElectrico) {
                    double autonomia = ingresarDouble(txtAutonomiaElectrico, "Autonomía");
                    double tiempoCarga = ingresarDouble(txtTiempoCargaElectrico, "Tiempo de Carga");

                    ((VehiculoElectrico) vehiculo).setAutonomia(autonomia);
                    ((VehiculoElectrico) vehiculo).setTiempoCarga(tiempoCarga);

                } else if (vehiculo instanceof VehiculoHibrido) {

                    boolean enchufable = ingresarBooleano(txtEnchufableHibrido, "Enchufable");
                    boolean ligero = ingresarBooleano(txtLigeroHibrido, "Ligero");

                    ((VehiculoHibrido) vehiculo).setEnchufable(enchufable);
                    ((VehiculoHibrido) vehiculo).setLigero(ligero);

                }

                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Actualización exitosa");
                alerta.setHeaderText("Vehículo actualizado");
                alerta.setContentText("Los datos del vehículo se han modificado correctamente.");
                alerta.showAndWait();
                app.getEmpleadoViewController().setModificarVehiculo(false);

            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText("Ha ocurrido un error al guardar el vehículo.");
                alerta.setContentText("Revisa los datos ingresados");
                alerta.showAndWait();
            }
        }
    }

    @FXML
    void btnCargarDatos(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Vehiculo");
                alerta.setHeaderText("A continuacion se cargara el vehiculo");
                alerta.setContentText("");
                alerta.showAndWait();
        Vehiculo vehiculo = app.getEmpleadoViewController().getSelectedVehiculo();
        mostrarInformacionVehiculo(vehiculo);

    }


    private void selectedCombustion(Vehiculo vehiculo){
        if (vehiculo.getCombustion()==Combustion.DIESEL){
            radioDiesel.setSelected(true);
        }else if (vehiculo.getCombustion()==Combustion.GASOLINA){
            radioGasolina.setSelected(true);
        }else if(vehiculo.getCombustion()==Combustion.SINCOMBUSTION){
            radioSinCombustion.setSelected(true);
        }
    }

    private void selectedTransmision (Vehiculo vehiculo){
        if (vehiculo.getTransmision()==Transmision.AUTOMATICO){
            radioAutomatico.setSelected(true);
        }else if (vehiculo.getTransmision()==Transmision.MANUAL){
            radioManual.setSelected(true);
        }
    }

    private void selectedCamion (Camion camion){
        if (camion.getTipo()==TipoCamion.LIGERO){
            radioLigero.setSelected(true);
        }else if (camion.getTipo()==TipoCamion.MEDIANO){
            radioMediano.setSelected(true);
        }else if (camion.getTipo()==TipoCamion.PESADO){
            radioPesado.setSelected(true);
        }
    }

    private void mostrarInformacionVehiculo(Vehiculo vehiculo) {
        

            txtCodigo.setText(vehiculo.getCodigo());
            txtMarca.setText(vehiculo.getMarca());
            txtModelo.setText(vehiculo.getModelo());
            txtNuevo.setText(vehiculo.getNuevo() ? "Si" : "No");
            txtCambios.setText(String.valueOf(vehiculo.getCambios()));
            txtVelMax.setText(String.valueOf(vehiculo.getVelMax()));
            txtCilindraje.setText(String.valueOf(vehiculo.getCilindraje()));
            selectedCombustion(vehiculo);
            selectedTransmision(vehiculo);

            // Datos específicos según el tipo de vehículo
            if (vehiculo instanceof Moto) {
                Moto moto = (Moto) vehiculo;
                txtDefensas.setText(moto.isDefensas() ? "Si" : "No");
            } else if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                selectedCamion(camion);
                txtCapacidadCargaCamion.setText(String.valueOf(camion.getCapacidadCarga()));
                txtNumeroEjes.setText(String.valueOf(camion.getNumeroEjes()));
                txtAireAcondicionadoCamion.setText(camion.isAireAcondicionado() ? "Si" : "No");
                txtAbsCamion.setText(camion.isAbs() ? "Si" : "No");
                txtFrenosAire.setText(camion.isFrenosAire() ? "Si" : "No");
            } else if (vehiculo instanceof Bus) {
                Bus bus = (Bus) vehiculo;
                txtNumeroPasajerosBus.setText(String.valueOf(bus.getNumeroPasajeros()));
                txtNumeroPuertasBus.setText(String.valueOf(bus.getNumeroPuertas()));
                txtNumeroBolsasAireBus.setText(String.valueOf(bus.getNumeroBolsasAire()));
                txtCapacidadMaleteroBus.setText(String.valueOf(bus.getCapacidadMaletero()));
                txtAbsBus.setText(bus.isAbs() ? "Si" : "No");
            } else if (vehiculo instanceof Van) {
                Van van = (Van) vehiculo;
                txtNumeroPasajerosVan.setText(String.valueOf(van.getNumeroPasajeros()));
                txtNumeroPuertasVan.setText(String.valueOf(van.getNumeroPuertas()));
                txtNumeroBolsasAireVan.setText(String.valueOf(van.getNumeroBolsasAire()));
                txtAireAcondicionadoVan.setText(van.isAireAcondicionado() ? "Si" : "No");
                txtAbsVan.setText(van.isAbs() ? "Si" : "No");
                txtCamaraReversaVan.setText(van.isCamaraReversa() ? "Si" : "No");
                txtCapacidadMaleteroVan.setText(String.valueOf(van.getCapacidadMaletero()));
            } else if (vehiculo instanceof PickUp) {
                PickUp pickUp = (PickUp) vehiculo;
                txtNumeroPasajerosPickUp.setText(String.valueOf(pickUp.getNumeroPasajeros()));
                txtNumeroPuertasPickUp.setText(String.valueOf(pickUp.getNumeroPuertas()));
                txtNumeroBolsasAirePickUp.setText(String.valueOf(pickUp.getNumeroBolsasAire()));
                txtAireAcondicionadoPickUp.setText(pickUp.isAireAcondicionado() ? "Si" : "No");
                txtAbsPickUp.setText(pickUp.isAbs() ? "Si" : "No");
                txtTraccionPickUp.setText(pickUp.isTraccion() ? "Si" : "No");
                txtCapacidadCargaPickUp.setText(String.valueOf(pickUp.getCapacidadCarga()));
            } else if (vehiculo instanceof Deportivo) {
                Deportivo deportivo = (Deportivo) vehiculo;
                txtNumeroPasajerosDeportivo.setText(String.valueOf(deportivo.getNumeroPasajeros()));
                txtNumeroPuertasDeportivo.setText(String.valueOf(deportivo.getNumeroPuertas()));
                txtNumeroBolsasAireDeportivo.setText(String.valueOf(deportivo.getNumeroBolsasAire()));
                txtCaballosFuerzaDeportivo.setText(String.valueOf(deportivo.getCaballosFuerza()));
                txtTiempoCeroCienDeportivo.setText(String.valueOf(deportivo.getTiempoCeroCien()));
            } else if (vehiculo instanceof Sedan) {
                Sedan sedan = (Sedan) vehiculo;
                txtNumeroPasajerosSedan.setText(String.valueOf(sedan.getNumeroPasajeros()));
                txtNumeroPuertasSedan.setText(String.valueOf(sedan.getNumeroPuertas()));
                txtNumeroBolsasAireSedan.setText(String.valueOf(sedan.getNumeroBolsasAire()));
                txtAireAcondicionadoSedan.setText(sedan.isAireAcondicionado() ? "Si" : "No");
                txtAbsSedan.setText(sedan.isAbs() ? "Si" : "No");
                txtVelocidadCruceroSedan.setText(sedan.isVelocidadCrucero() ? "Si" : "No");
                txtCapacidadMaleteroSedan.setText(String.valueOf(sedan.getCapacidadMaletero()));
                txtCamaraReversaSedan.setText(sedan.isCamaraReversa() ? "Si" : "No");
                txtSensorColisionSedan.setText(sedan.isSensorColision() ? "Si" : "No");
                txtSensorTraficoCruzadoSedan.setText(sedan.isSensorTraficoCruzado() ? "Si" : "No");
                txtAsistentePermanenciaCarrilSedan.setText(sedan.isAsistentePermanenciaCarril() ? "Si" : "No");
                txtEspejosElectricosSedan.setText(sedan.isEspejosElectricos() ? "Si" : "No");
            } else if (vehiculo instanceof Camioneta) {
                Camioneta camioneta = (Camioneta) vehiculo;
                txtNumeroPasajerosCamioneta.setText(String.valueOf(camioneta.getNumeroPasajeros()));
                txtNumeroPuertasCamioneta.setText(String.valueOf(camioneta.getNumeroPuertas()));
                txtNumeroBolsasAireCamioneta.setText(String.valueOf(camioneta.getNumeroBolsasAire()));
                txtAireAcondicionadoCamioneta.setText(camioneta.isAireAcondicionado() ? "Si" : "No");
                txtAbsCamioneta.setText(camioneta.isAbs() ? "Si" : "No");
                txtVelocidadCruceroCamioneta.setText(camioneta.isVelocidadCrucero() ? "Si" : "No");
                txtCapacidadMaleteroCamioneta.setText(String.valueOf(camioneta.getCapacidadMaletero()));
                txtCamaraReversaCamioneta.setText(camioneta.isCamaraReversa() ? "Si" : "No");
                txtSensorColisionCamioneta.setText(camioneta.isSensorColision() ? "Si" : "No");
                txtSensorTraficoCruzadoCamioneta.setText(camioneta.isSensorTraficoCruzado() ? "Si" : "No");
                txtAsistentePermanenciaCarrilCamioneta.setText(camioneta.isAsistentePermanenciaCarril() ? "Si" : "No");
                txtTraccionCamioneta.setText(camioneta.getTraccion() ? "Si" : "No");
            } else if (vehiculo instanceof VehiculoElectrico) {
                VehiculoElectrico electrico = (VehiculoElectrico) vehiculo;
                txtAutonomiaElectrico.setText(String.valueOf(electrico.getAutonomia()));
                txtTiempoCargaElectrico.setText(String.valueOf(electrico.getTiempoCarga()));
            } else if (vehiculo instanceof VehiculoHibrido) {
                VehiculoHibrido hibrido = (VehiculoHibrido) vehiculo;
                txtEnchufableHibrido.setText(hibrido.Enchufable() ? "Si" : "No");
                txtLigeroHibrido.setText(hibrido.Ligero() ? "Si" : "No");
            }
        }
    

    private void agregarVehiculo(ActionEvent event) {
        String codigo = txtCodigo.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String nuevoAux = txtNuevo.getText().toLowerCase();
        boolean nuevo = nuevoAux.equals("si");
        int cambios = ingresarEntero(txtCambios, "Cambios");
        double velMax = ingresarDouble(txtVelMax, "Velocidad Máxima");
        double cilindraje = ingresarDouble(txtCilindraje, "Cilindraje");
        determinarCombustion(event);
        Combustion combustion = datosVehiculoController.getCombustion();
        determinarTransmision(event);
        Transmision transmision = datosVehiculoController.getTransmision();

        if (codigo.isEmpty() || marca.isEmpty() || modelo.isEmpty() || nuevoAux.isEmpty() || combustion == null
                || transmision == null) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText("Todos los campos son obligatorios");
            alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
            alerta.showAndWait();
        } else if (cambios <= 0 || velMax <= 0 || cilindraje <= 0) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Datos Erróneos");
            alerta.setHeaderText("Cambios, Velocidad Máxima o Cilindraje son erróneos.");
            alerta.setContentText("No pueden haber datos numéricos menores o iguales a 0.");
            alerta.showAndWait();
        } else {

            try {
                determinarEstado();
                Estado estado = datosVehiculoController.getEstado();
                Vehiculo auxVehiculo = null;
                if (radioMoto.isSelected()) {
                    boolean defensas = ingresarBooleano(txtDefensas, "Defensas Moto");
                    auxVehiculo = new Moto(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, defensas,
                            combustion,
                            transmision);
                    auxVehiculo.setEstado(estado);

                } else if (radioCamion.isSelected()) {

                    double capacidadCarga = ingresarDouble(txtCapacidadCargaCamion, "Capacidad de Carga");
                    int numEjes = ingresarEntero(txtNumeroEjes, "Número de Ejes");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoCamion,
                            "Aire Acondicionado Camion");
                    boolean abs = ingresarBooleano(txtAbsCamion, "ABS Camion");
                    boolean frenosAire = ingresarBooleano(txtFrenosAire, "Frenos Aire Camion");

                    determinarCamion(event);

                    TipoCamion tipoCamion = datosVehiculoController.getTipoCamion();
                    auxVehiculo = new Camion(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, capacidadCarga,
                            aireAcondicionado, frenosAire, abs, numEjes, tipoCamion, combustion,
                            transmision);

                    auxVehiculo.setEstado(estado);

                } else if (radioBus.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosBus, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasBus, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireBus, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoBus, "Aire Acondicionado Bus");
                    boolean abs = ingresarBooleano(txtAbsBus, "ABS Bus");
                    boolean velocidadCruceroBus = ingresarBooleano(txtVelocidadCruceroBus, "Velocidad Crucero Bus");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroBus, "Cpacidad Maletero Bus");
                    int numeroSalidasEmergencia = ingresarEntero(txtNumeroSalidasEmergenciaBus,
                            "Numero Salidas de Emergencia");
                    int numEjes = ingresarEntero(txtNumeroEjesBus, "Número de Ejes");

                    auxVehiculo = new Bus(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs,
                            velocidadCruceroBus, capacidadMaletero, numEjes, numeroSalidasEmergencia);

                    auxVehiculo.setEstado(estado);

                } else if (radioVan.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosVan, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasVan, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireVan, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoVan, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsVan, "ABS");
                    boolean camaraReversaVan = ingresarBooleano(txtCamaraReversaVan, "Camara de Reversa");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroVan, "Capacidad Maletero");

                    auxVehiculo = new Van(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs, camaraReversaVan,
                            capacidadMaletero);

                    auxVehiculo.setEstado(estado);

                } else if (radioPickUp.isSelected()) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosPickUp, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasPickUp, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAirePickUp, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoPickUp, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsPickUp, "ABS");
                    boolean traccion = ingresarBooleano(txtTraccionPickUp, "Tracción");
                    double capacidadCarga = ingresarDouble(txtCapacidadCargaPickUp, "Capacidad de Carga");

                    auxVehiculo = new PickUp(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs, traccion,
                            capacidadCarga);

                    auxVehiculo.setEstado(estado);

                } else if (radioDeportivo.isSelected()) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosDeportivo, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasDeportivo, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireDeportivo, "Numero de Bolsas de Aire");
                    int caballosFuerza = ingresarEntero(txtCaballosFuerzaDeportivo, "Caballos de Fuerza");
                    double tiempoCeroCien = ingresarDouble(txtTiempoCeroCienDeportivo, "Tiempo de 0 a 100");

                    auxVehiculo = new Deportivo(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, caballosFuerza, tiempoCeroCien);

                    auxVehiculo.setEstado(estado);

                } else if (radioSedan.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosSedan, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasSedan, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireSedan, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoSedan, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsSedan, "ABS");
                    boolean velocidadCrucero = ingresarBooleano(txtVelocidadCruceroSedan, "Velocidad Crucero");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroSedan, "Capacidad Maletero");
                    boolean camaraReversa = ingresarBooleano(txtCamaraReversaSedan, "Camara de Reversa");
                    boolean sensorColicion = ingresarBooleano(txtSensorColisionSedan, "Sensor de Colicion");
                    boolean sensorTraficoCruzado = ingresarBooleano(txtSensorTraficoCruzadoSedan,
                            "Sensor de Trafico Cruzado");
                    boolean asistentePermanenciaCarril = ingresarBooleano(txtAsistentePermanenciaCarrilSedan,
                            "Asistente de Permanencia en el Carril");
                    boolean espejosElectricos = ingresarBooleano(txtEspejosElectricosSedan, "Espejos Electricos");

                    auxVehiculo = new Sedan(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero,
                            capacidadMaletero, camaraReversa, sensorColicion, sensorTraficoCruzado,
                            asistentePermanenciaCarril, espejosElectricos);

                    auxVehiculo.setEstado(estado);

                } else if (radioCamioneta.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosCamioneta, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasCamioneta, "Numero de Puertas");
                    int numBolsasAire = ingresarEntero(txtNumeroBolsasAireCamioneta, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoCamioneta, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsCamioneta, "ABS");
                    boolean velocidadCrucero = ingresarBooleano(txtVelocidadCruceroCamioneta, "Velocidad Crucero");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroCamioneta, "Capacidad Maletero");
                    boolean camaraReversa = ingresarBooleano(txtCamaraReversaCamioneta, "Camara de Reversa");
                    boolean sensorColision = ingresarBooleano(txtSensorColisionCamioneta, "Sensor de Colicion");
                    boolean sensorTraficoCruzado = ingresarBooleano(txtSensorTraficoCruzadoCamioneta,
                            "Sensor de Trafico Cruzado");
                    boolean asistentePermanenciaCarril = ingresarBooleano(txtAsistentePermanenciaCarrilCamioneta,
                            "Asistente de Permanencia en el Carril");
                    boolean traccion = ingresarBooleano(txtTraccionCamioneta, "Tracción");

                    auxVehiculo = new Camioneta(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas,
                            numBolsasAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero,
                            capacidadMaletero,
                            camaraReversa, sensorColision, sensorTraficoCruzado, asistentePermanenciaCarril, traccion);

                    auxVehiculo.setEstado(estado);

                } else if (radioElectrico.isSelected()) {
                    double autonomia = ingresarDouble(txtAutonomiaElectrico, "Autonomía");
                    double tiempoCarga = ingresarDouble(txtTiempoCargaElectrico, "Tiempo de Carga");

                    auxVehiculo = new VehiculoElectrico(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje,
                            tiempoCarga, autonomia, combustion,
                            transmision);

                    auxVehiculo.setEstado(estado);

                } else if (radioHibrido.isSelected()) {

                    boolean enchufable = ingresarBooleano(txtEnchufableHibrido, "Enchufable");
                    boolean ligero = ingresarBooleano(txtLigeroHibrido, "Ligero");

                    auxVehiculo = new VehiculoHibrido(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje,
                            enchufable, ligero, combustion,
                            transmision);

                    auxVehiculo.setEstado(estado);

                }

                if (auxVehiculo != null) {
                    if (datosVehiculoController.verificarVehiculo(codigo) != null) {
                        Alert alerta1 = new Alert(Alert.AlertType.ERROR);
                        alerta1.setTitle("El Vehiculo ya existe");
                        alerta1.setHeaderText("");
                        alerta1.setContentText("Hay un vehiculo asociado al codigo ingresado");
                        alerta1.showAndWait();
                    } else {
                        datosVehiculoController.agregarVehiculo(auxVehiculo);
                        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                        alerta.setTitle("Creacion Exitosa");
                        alerta.setHeaderText("El vehiculo se ha creado con exito");
                        alerta.setContentText("El vehiculo se ha guardado con exito");
                        alerta.showAndWait();
                        app.getEmpleadoViewController().setAgregarVehiculo(false);
                    }
                }
            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText("Ha ocurrido un error al guardar el vehículo.");
                alerta.setContentText("Revisa los datos ingresados");
                alerta.showAndWait();
            }
        }
    }

    private boolean ingresarBooleano(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim().toLowerCase();

        if (valor.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campo vacío");
            alerta.setHeaderText("Falta información en el campo " + nombreCampo);
            alerta.setContentText("Por favor, rellene el campo antes de continuar.");
            alerta.showAndWait();
            throw new IllegalArgumentException("El campo " + nombreCampo + " está vacío.");
        }

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

    private int ingresarEntero(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim();

        if (valor.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campo vacío");
            alerta.setHeaderText("Falta información en el campo " + nombreCampo);
            alerta.setContentText("Por favor, rellene el campo antes de continuar.");
            alerta.showAndWait();
            throw new IllegalArgumentException("El campo " + nombreCampo + " está vacío.");
          
        }

        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Valor no válido");
            alerta.setHeaderText("El campo " + nombreCampo + " contiene un valor no válido.");
            alerta.setContentText("Por favor, ingrese un número entero válido.");
            alerta.showAndWait();
            throw new IllegalArgumentException("Valor no válido para el campo " + nombreCampo + ": " + valor);
        }
    }

    private double ingresarDouble(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim();

        if (valor.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campo vacío");
            alerta.setHeaderText("Falta información en el campo " + nombreCampo);
            alerta.setContentText("Por favor, rellene el campo antes de continuar.");
            alerta.showAndWait();
            throw new IllegalArgumentException("El campo " + nombreCampo + " está vacío.");
        }

        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Valor no válido");
            alerta.setHeaderText("El campo " + nombreCampo + " contiene un valor no válido.");
            alerta.setContentText("Por favor, ingrese un número válido (puede incluir decimales).");
            alerta.showAndWait();
            throw new IllegalArgumentException("Valor no válido para el campo " + nombreCampo + ": " + valor);
        }
    }

    @FXML
    void btnLimpiarAction(ActionEvent event) {
        txtCodigo.clear();
        txtMarca.clear();
        txtModelo.clear();
        txtNuevo.clear();
        txtCambios.clear();
        txtVelMax.clear();
        txtCilindraje.clear();
        tipoCamionGroup.selectToggle(null);
        tipoCombustionGroup.selectToggle(null);
        tipoTransmisionGroup.selectToggle(null);
        txtDefensas.clear();
        txtAireAcondicionadoCamion.clear();
        txtFrenosAire.clear();
        tipoCamionGroup.selectToggle(null);
        txtNumeroPasajerosBus.clear();
        txtNumeroPuertasBus.clear();
        txtNumeroBolsasAireBus.clear();
        txtAireAcondicionadoBus.clear();
        txtAbsBus.clear();
        txtVelocidadCruceroBus.clear();
        txtCapacidadMaleteroBus.clear();
        txtNumeroSalidasEmergenciaBus.clear();
        txtNumeroEjesBus.clear();
        txtNumeroPasajerosVan.clear();
        txtNumeroPuertasVan.clear();
        txtNumeroBolsasAireVan.clear();
        txtAireAcondicionadoVan.clear();
        txtAbsVan.clear();
        txtCamaraReversaVan.clear();
        txtCapacidadMaleteroVan.clear();
        txtNumeroPasajerosPickUp.clear();
        txtNumeroPuertasPickUp.clear();
        txtNumeroBolsasAirePickUp.clear();
        txtAireAcondicionadoPickUp.clear();
        txtAbsPickUp.clear();
        txtTraccionPickUp.clear();
        txtCapacidadCargaPickUp.clear();
        txtNumeroBolsasAireDeportivo.clear();
        txtNumeroPasajerosDeportivo.clear();
        txtNumeroBolsasAireDeportivo.clear();
        txtCaballosFuerzaDeportivo.clear();
        txtTiempoCeroCienDeportivo.clear();
        txtNumeroPasajerosSedan.clear();
        txtNumeroPuertasSedan.clear();
        txtNumeroBolsasAireSedan.clear();
        txtAireAcondicionadoSedan.clear();
        txtAbsSedan.clear();
        txtVelocidadCruceroSedan.clear();
        txtCapacidadMaleteroSedan.clear();
        txtCapacidadMaleteroSedan.clear();
        txtSensorColisionSedan.clear();
        txtSensorTraficoCruzadoSedan.clear();
        txtAsistentePermanenciaCarrilSedan.clear();
        txtEspejosElectricosSedan.clear();
        txtNumeroPasajerosCamioneta.clear();
        txtNumeroPuertasCamioneta.clear();
        txtNumeroBolsasAireCamioneta.clear();
        txtAireAcondicionadoCamioneta.clear();
        txtAbsCamioneta.clear();
        txtVelocidadCruceroCamioneta.clear();
        txtCapacidadMaleteroCamioneta.clear();
        txtCamaraReversaCamioneta.clear();
        txtSensorColisionCamioneta.clear();
        txtSensorTraficoCruzadoCamioneta.clear();
        txtAsistentePermanenciaCarrilCamioneta.clear();
        txtTraccionCamioneta.clear();
        txtAutonomiaElectrico.clear();
        txtTiempoCargaElectrico.clear();
        txtEnchufableHibrido.clear();
        txtLigeroHibrido.clear();

    }

    @FXML
    private void txtCodigoAction(ActionEvent event) {
        // Lógica para manejar el evento
    }

    public void setApp(App app) {
        this.app = app;
    }



    @FXML
    void btnSalirAction(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }

}
