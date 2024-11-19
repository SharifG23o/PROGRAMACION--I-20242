package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RestablecerController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RestablecerViewController {
    @FXML
    private TextField txtContraseniaNueva;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private Button btnVerificar;

    @FXML
    private TextField txtPregunta;

    private App app;

    RestablecerController restablecerController;

    @FXML
    void initialize() {
        restablecerController = new RestablecerController(app.concesionario);
        limpiarEspacios();
    }

    @FXML
    void cargarPregunta(ActionEvent event) {
        obtenerPregunta();
    }

    private void limpiarEspacios() {
        txtContraseniaNueva.clear();
        txtPregunta.clear();
        txtRespuesta.clear();
    }

    private void obtenerPregunta() {

        String usuario = app.getLoginViewController().getUsuario();

        for (Cliente cliente : restablecerController.obtenerListaClientes()) {
            if (cliente.getCuenta().equals(usuario)) {
                txtPregunta.setText(cliente.getPreguntaRecuperacion());
            }
        }
        for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
            if (vendedor.getCuenta().equals(usuario)) {
                txtPregunta.setText(vendedor.getPreguntaRecuperacion());
            }
        }
        if (restablecerController.obtenerAdministrador().getCuenta().equals(usuario)) {
            Administrador administrador = restablecerController.obtenerAdministrador();
            txtPregunta.setText(administrador.getPreguntaRecuperacion());
        }
    }

    @FXML
    void confirmarRespuesta(ActionEvent event) {
        if (verificarRespuestaCliente()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFO.");
            alert.setContentText("La respuesta es correcta. Puede ingresar la nueva contraseña.");
            alert.showAndWait();
        } else if (verificarRespuestaVendedor()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFO.");
            alert.setContentText("La respuesta es correcta. Puede ingresar la nueva contraseña.");
            alert.showAndWait();
        } else if (verificarRespuestaAdministrador()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFO.");
            alert.setContentText("La respuesta es correcta. Puede ingresar la nueva contraseña.");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("INFO.");
            alert.setContentText("La respuesta es incorrecta.");
            alert.showAndWait();
        }
    }

    private boolean verificarRespuestaCliente() {
        String respuesta = txtRespuesta.getText();
        boolean centinela = false;

        for (Cliente cliente : restablecerController.obtenerListaClientes()) {
            if (cliente.getRespuestaRecuperacion().equals(respuesta)) {
                centinela = true;
            }
        }
        return centinela;
    }

    private boolean verificarRespuestaVendedor() {
        String respuesta = txtRespuesta.getText();
        boolean centinela = false;

        for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
            if (vendedor.getRespuestaRecuperacion().equals(respuesta)) {
                centinela = true;
            }
        }
        return centinela;
    }

    private boolean verificarRespuestaAdministrador() {
        String respuesta = txtRespuesta.getText();
        boolean centinela = false;
        Administrador administrador = restablecerController.obtenerAdministrador();
        if (administrador.getRespuestaRecuperacion().equals(respuesta)) {
            centinela = true;
        }
        return centinela;
    }

    @FXML
    void reestablecerContra(ActionEvent event) {

        String usuario = app.getLoginViewController().getUsuario();
        String contraseniaNueva = txtContraseniaNueva.getText();

        if (contraseniaNueva.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR.");
            alert.setContentText("Debes rellenar el espacio.");
            alert.showAndWait();
        } else {
            if (verificarRespuestaCliente()) {
                for (Cliente cliente : restablecerController.obtenerListaClientes()) {
                    if (cliente.getCuenta().equals(usuario)) {
                        cliente.reestablecerContrasenia(contraseniaNueva);
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setTitle("INFO.");
                        alert.setContentText("Se ha reestablecido la contraseña.");
                        alert.showAndWait();
                    }
                }
            } else if (verificarRespuestaVendedor()) {
                for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
                    if (vendedor.getCuenta().equals(usuario)) {
                        vendedor.reestablecerContrasenia(contraseniaNueva);
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setTitle("INFO.");
                        alert.setContentText("Se ha reestablecido la contraseña.");
                        alert.showAndWait();
                    }
                }
            } else if (verificarRespuestaAdministrador()) {
                Administrador administrador = restablecerController.obtenerAdministrador();
                if (administrador.getCuenta().equals(usuario)) {
                    administrador.reestablecerContrasenia(contraseniaNueva);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText(null);
                    alert.setTitle("INFO.");
                    alert.setContentText("Se ha reestablecido la contraseña.");
                    alert.showAndWait();
                }

            } else if (verificarRespuestaCliente() & verificarRespuestaVendedor() & verificarRespuestaAdministrador()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR.");
                alert.setContentText("Verifica la respuesta.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void regresarLogin(ActionEvent event) {
        Stage stage = (Stage) btnRegresar.getScene().getWindow();
        stage.close();
    }

    public void setApp(App app) {
        this.app = app;
    }
}
