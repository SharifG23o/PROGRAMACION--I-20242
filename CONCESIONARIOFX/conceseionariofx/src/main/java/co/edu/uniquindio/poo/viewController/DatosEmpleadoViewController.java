package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DatosEmpleadoController;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DatosEmpleadoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private Button btnCargar;

    @FXML
    private URL location;

    @FXML
    private TextField apellidoField;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnGuardarEmpleado;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private TextField cedulaField;

    @FXML
    private TextField codigoEmpleadoField;

    @FXML
    private TextField correoField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField telefonoField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private TextField usuarioField;

    @FXML
    private TextField respuestaRecuperacionField;

    @FXML
    private TextField preguntaRecuperacionField;

    private App app;

    DatosEmpleadoController datosEmpleadoController;

    @FXML
    void initialize() {
        datosEmpleadoController = new DatosEmpleadoController(app.concesionario);
        limpiarEspacios();
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
        codigoEmpleadoField.clear();
        contrasenaField.clear();
        usuarioField.clear();
        preguntaRecuperacionField.clear();
        respuestaRecuperacionField.clear();
    }

    @FXML
    void guardarEmpleado(ActionEvent event) {
        if (app.getAdministradorViewController().agregarEmpleado) {
            agregarEmpleado();
        } else if (app.getAdministradorViewController().modificarEmpleado) {
            modificarEmpleado();
        }
    }

    private void agregarEmpleado() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String cedula = cedulaField.getText();
        String telefono = telefonoField.getText();
        String correo = correoField.getText();
        String codigoEmpleado = codigoEmpleadoField.getText();
        String contrasena = contrasenaField.getText();
        String usuario = usuarioField.getText();
        String preguntaRecuperacion = preguntaRecuperacionField.getText();
        String respuestaRecuperacion = respuestaRecuperacionField.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() ||
                telefono.isEmpty() || correo.isEmpty() || codigoEmpleado.isEmpty()) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText("Todos los campos son obligatorios");
            alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
            alerta.showAndWait();
        } else {
            Vendedor aux = new Vendedor(nombre, apellido, cedula, telefono, correo, usuario, contrasena,
                    preguntaRecuperacion, respuestaRecuperacion,
                    codigoEmpleado);
            if (datosEmpleadoController.recuperarVendedor(cedula, codigoEmpleado) != null) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Usuario invalido");
                alerta.setHeaderText("");
                alerta.setContentText("El vendedor ya existe");
                alerta.showAndWait();
            } else {

                datosEmpleadoController.agregarVendedor(aux);
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Usuario creado");
                alerta.setHeaderText("");
                alerta.setContentText("El vendedor se ha creado con exito");
                alerta.showAndWait();
            }
        }
    }

    private void modificarEmpleado() {

        Vendedor vendedor = app.getAdministradorViewController().getSelectedVendedor();

        String codigoEmpleado = codigoEmpleadoField.getText();
        String cedula = cedulaField.getText();
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String telefono = telefonoField.getText();
        String correo = correoField.getText();
        String cuenta = usuarioField.getText();

        if (codigoEmpleado.isEmpty() || cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty()
                || correo.isEmpty() || cuenta.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes rellenar los espacios.");
            alert.showAndWait();

        } else {

            Vendedor aux = new Vendedor(nombre, apellido, cedula, telefono, correo, cuenta, contrasenaField.getText(),
                    preguntaRecuperacionField.getText(), respuestaRecuperacionField.getText(),
                    codigoEmpleado);

            if (vendedor.getCedula().equals(cedula) & vendedor.getCodigoEmpleado().equals(codigoEmpleado)) {

                vendedor.setNombre(aux.getNombre());
                vendedor.setApellido(aux.getApellido());
                vendedor.setCedula(aux.getCedula());
                vendedor.setTelefono(aux.getTelefono());
                vendedor.setCorreo(aux.getCorreo());
                vendedor.setCuenta(aux.getCuenta());
                vendedor.setCodigoEmpleado(aux.getCodigoEmpleado());

            } else if (datosEmpleadoController.recuperarVendedor(cedula, codigoEmpleado) != null) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("El cliente ya existe.");
                alert.showAndWait();

            } else {

                vendedor.setNombre(aux.getNombre());
                vendedor.setApellido(aux.getApellido());
                vendedor.setCedula(aux.getCedula());
                vendedor.setTelefono(aux.getTelefono());
                vendedor.setCorreo(aux.getCorreo());
                vendedor.setCuenta(aux.getCuenta());
                vendedor.setCodigoEmpleado(aux.getCodigoEmpleado());
            }
        }
    }

    @FXML
    void cargarDatos(ActionEvent event) {
        mostrarInformacionVendedor(app.getAdministradorViewController().getSelectedVendedor());
        contrasenaField.setEditable(false);
        preguntaRecuperacionField.setEditable(false);
        respuestaRecuperacionField.setEditable(false);
    }

    private void mostrarInformacionVendedor(Vendedor vendedor) {
        if (vendedor != null) {
            nombreField.setText(vendedor.getNombre());
            apellidoField.setText(vendedor.getApellido());
            cedulaField.setText(vendedor.getCedula());
            telefonoField.setText(vendedor.getTelefono());
            correoField.setText(vendedor.getCorreo());
            codigoEmpleadoField.setText(vendedor.getCodigoEmpleado());
            usuarioField.setText(vendedor.getCuenta());
            contrasenaField.setText(vendedor.getContrasenia());
            preguntaRecuperacionField.setText(vendedor.getPreguntaRecuperacion());
            respuestaRecuperacionField.setText(vendedor.getRespuestaRecuperacion());
        }
    }

    @FXML
    void cancelarAction(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
