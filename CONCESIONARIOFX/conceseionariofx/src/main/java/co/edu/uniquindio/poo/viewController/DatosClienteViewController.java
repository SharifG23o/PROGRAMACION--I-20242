package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DatosClienteController;
import co.edu.uniquindio.poo.controller.DatosEmpleadoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DatosClienteViewController {

    @FXML
    private TextField respuestaRecuperacionField;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnCargar;

    @FXML
    private TextField preguntaRecuperacionField;

    @FXML
    private TextField direccionField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField apellidoField;

    @FXML
    private TextField cedulaField;

    @FXML
    private Button btnGuadar;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField cuentaField;

    @FXML
    private TextField correoField;

    @FXML
    private Button btnCancelar;

    @FXML
    private PasswordField contrasenaField;

    private App app;

    DatosClienteController datosClienteController;

    @FXML
    void initialize() {
        datosClienteController = new DatosClienteController(app.concesionario);
        limpiarEspacios();
    }

    @FXML
    void guardarCliente(ActionEvent event) {
        if (app.getEmpleadoViewController().agregarCliente) {
            agregarCliente();
        } else if (app.getEmpleadoViewController().modificarCliente) {
            modificarCliente();
        }
    }

    private void agregarCliente() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String cedula = cedulaField.getText();
        String telefono = telefonoField.getText();
        String correo = correoField.getText();
        String direccion = direccionField.getText();
        String contrasena = contrasenaField.getText();
        String cuenta = cuentaField.getText();
        String preguntaRecuperacion = preguntaRecuperacionField.getText();
        String respuestaRecuperacion = respuestaRecuperacionField.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() ||
                telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty() || contrasena.isEmpty()
                || cuenta.isEmpty() || preguntaRecuperacion.isEmpty()
                || respuestaRecuperacion.isEmpty()) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText("Todos los campos son obligatorios");
            alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
            alerta.showAndWait();
        } else {
            Cliente aux = new Cliente(nombre, apellido, cedula, telefono, correo, direccion, cuenta, contrasena,
                    preguntaRecuperacion, respuestaRecuperacion);
            if (datosClienteController.recuperarCliente(cedula) != null) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Usuario invalido");
                alerta.setHeaderText("");
                alerta.setContentText("El cliente ya existe");
                alerta.showAndWait();
            } else {

                datosClienteController.agregarCliente(aux);
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Usuario creado");
                alerta.setHeaderText("");
                alerta.setContentText("El cliente se ha creado con exito");
                alerta.showAndWait();
            }
        }
    }

    private void modificarCliente() {

        Cliente cliente = app.getEmpleadoViewController().getSelectedCliente();

        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String cedula = cedulaField.getText();
        String telefono = telefonoField.getText();
        String correo = correoField.getText();
        String direccion = direccionField.getText();
        String cuenta = cuentaField.getText();
        contrasenaField.setEditable(false);
        preguntaRecuperacionField.setEditable(false);
        respuestaRecuperacionField.setEditable(false);

        if (direccion.isEmpty() || cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()
                || correo.isEmpty() || cuenta.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes rellenar los espacios.");
            alert.showAndWait();

        } else {

            Cliente aux = new Cliente(nombre, apellido, cedula, telefono, correo, cuenta, contrasenaField.getText(),
                    preguntaRecuperacionField.getText(), respuestaRecuperacionField.getText(),
                    direccion);

            if (cliente.getCedula().equals(cedula)) {

                cliente.setNombre(aux.getNombre());
                cliente.setApellido(aux.getApellido());
                cliente.setCedula(aux.getCedula());
                cliente.setTelefono(aux.getTelefono());
                cliente.setCorreo(aux.getCorreo());
                cliente.setCuenta(aux.getCuenta());
                cliente.setDireccion(aux.getDireccion());

            } else if (datosClienteController.recuperarCliente(cedula) != null) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("El cliente ya existe.");
                alert.showAndWait();

            } else {

                cliente.setNombre(aux.getNombre());
                cliente.setApellido(aux.getApellido());
                cliente.setCedula(aux.getCedula());
                cliente.setTelefono(aux.getTelefono());
                cliente.setCorreo(aux.getCorreo());
                cliente.setCuenta(aux.getCuenta());
                cliente.setDireccion(aux.getDireccion());
            }
        }
    }

    @FXML
    void cargarDatos(ActionEvent event) {
        mostrarInformacionCliente(app.getEmpleadoViewController().getSelectedCliente());
    }

    private void mostrarInformacionCliente(Cliente cliente) {
        if (cliente != null) {
            nombreField.setText(cliente.getNombre());
            apellidoField.setText(cliente.getApellido());
            cedulaField.setText(cliente.getCedula());
            telefonoField.setText(cliente.getTelefono());
            correoField.setText(cliente.getCorreo());
            direccionField.setText(cliente.getDireccion());
            cuentaField.setText(cliente.getCuenta());
            contrasenaField.setText(cliente.getContrasenia());
            preguntaRecuperacionField.setText(cliente.getPreguntaRecuperacion());
            respuestaRecuperacionField.setText(cliente.getRespuestaRecuperacion());
        }
    }

    @FXML
    void limpiarCampos(ActionEvent event) {
        limpiarEspacios();
    }

    private void limpiarEspacios() {
        nombreField.clear();
        apellidoField.clear();
        cedulaField.clear();
        telefonoField.clear();
        correoField.clear();
        direccionField.clear();
        contrasenaField.clear();
        cuentaField.clear();
        preguntaRecuperacionField.clear();
        respuestaRecuperacionField.clear();
    }

    @FXML
    void regresarEmpleado(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
