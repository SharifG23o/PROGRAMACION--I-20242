package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ConsultaTransaccionController;
import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.Negocio;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Venta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ConsultaTransaccionViewController {
    @FXML
    private Button btnSalir;

    @FXML
    private RadioButton radioCompra;

    @FXML
    private Button btnCargar;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private RadioButton radioAlquiler;

    @FXML
    private RadioButton radioVenta;

    @FXML
    private Button btnEnviarOferta;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private TextField txtOferta;

    private App app;

    ConsultaTransaccionController consultaTransaccionController;

    ToggleGroup toggleGroup;

    @FXML
    void initialize() {
        consultaTransaccionController = new ConsultaTransaccionController(app.concesionario);

        toggleGroup = new ToggleGroup();

        corregirOpciones();
    }

    private void corregirOpciones() {
        radioAlquiler.setToggleGroup(toggleGroup);
        radioCompra.setToggleGroup(toggleGroup);
        radioVenta.setToggleGroup(toggleGroup);
        radioCompra.setDisable(true);
        radioVenta.setDisable(true);
        radioAlquiler.setDisable(true);
    }
//Hola
    @FXML
    void enviarOferta(ActionEvent event) {
        try {
            String ofertaString = txtOferta.getText();
            if (ofertaString.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Debes llenar el campo Oferta.");
                alert.showAndWait();
            } else {
                double oferta = Double.parseDouble(ofertaString);
                Transaccion transaccion = app.getEmpleadoViewController().getSelectedTransaccion();
                for (Negocio negocio : transaccion.getNegocios()) {
                    if (negocio instanceof Compra) {
                        ((Compra) negocio).setPrecioCompra(oferta);
                    } else if (negocio instanceof Venta) {
                        ((Venta) negocio).setPrecioVenta(oferta);
                    } else if (negocio instanceof Alquiler) {
                        ((Alquiler) negocio).setPrecioAlquiler(oferta);
                    }
                }
                transaccion.setVendedor(consultaTransaccionController.verificarUsuario(app.getLoginViewController().getUsuario()));
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO");
                alert.setContentText("Se ha realizado la oferta al cliente.");
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Formato incorrecto en el campo Oferta.");
            alert.showAndWait();
        }
    }

    @FXML
    void cargarDatos(ActionEvent event) {
        Transaccion transaccion = app.getEmpleadoViewController().getSelectedTransaccion();
        Cliente cliente = transaccion.getCliente();
        if (cliente != null) {
            txtNombreCliente.setText(cliente.getNombre());
            txtApellidoCliente.setText(cliente.getApellido());
            txtCedulaCliente.setText(cliente.getCedula());
            for (Negocio negocio : transaccion.getNegocios()) {
                if (negocio instanceof Compra) {
                    radioCompra.setSelected(true);
                } else if (negocio instanceof Venta) {
                    radioVenta.setSelected(true);
                } else if (negocio instanceof Alquiler) {
                    radioAlquiler.setSelected(true);
                }
            }
        }
    }

    @FXML
    void regresarEmpleado(ActionEvent event) {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
