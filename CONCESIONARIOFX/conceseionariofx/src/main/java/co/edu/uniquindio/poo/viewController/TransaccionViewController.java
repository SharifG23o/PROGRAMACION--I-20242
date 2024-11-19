package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.TransaccionController;
import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.EstadoTransaccion;
import co.edu.uniquindio.poo.model.Negocio;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Venta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TransaccionViewController {
    @FXML
    private DatePicker dtpckFechaInicio;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnCargar;

    @FXML
    private TextField txtPrecioCompra;

    @FXML
    private TextField txtRevision;

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtImpuestoTransaccion;

    @FXML
    private TextField txtCodigoTransaccion;

    @FXML
    private TextField txtPrecioAlquiler;

    @FXML
    private TextField txtPrecioVenta;

    @FXML
    private DatePicker dtpckFechaFin;

    private App app;

    TransaccionController transaccionController;

    @FXML
    void guardarTransaccion(ActionEvent event) {
        try {
            String codigoNegocio = txtCodigoTransaccion.getText();
            String impuestoNegocioString = txtImpuestoTransaccion.getText();
            String revisionString = txtRevision.getText();
            if (codigoNegocio.isEmpty() || impuestoNegocioString.isEmpty() || revisionString.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Debes rellenar los campos: Codigo Transaccion, Impuesto Transaccion o Revision.");
                alert.showAndWait();
            } else {
                double impuestoNegocio = Double.parseDouble(impuestoNegocioString);
                boolean revision = ingresarBooleano(txtRevision, "Revision");
                Transaccion transaccion = app.getEmpleadoViewController().getSelectedTransaccion();
                for (Negocio negocio : transaccion.getNegocios()) {
                    negocio.setCodigo(codigoNegocio);
                    negocio.setImpuesto(impuestoNegocio);
                    if (negocio instanceof Compra) {
                        if (revision == true) {
                            ((Compra) negocio).setRevisionVehiculo(revision);
                            negocio.getVehiculo().setEstado(Estado.DISPONIBLE);
                            transaccion.setEstadoTransaccion(EstadoTransaccion.TERMINADA);
                            transaccion.calcularPrecioTotal();
                        } else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setHeaderText(null);
                            alert.setTitle("INFO");
                            alert.setContentText(
                                    "La transaccion de Compra ha sido rechazada por la falta de la Revision del Vehiculo.");
                            alert.showAndWait();
                            transaccion.setEstadoTransaccion(EstadoTransaccion.RECHAZADA);
                        }
                    } else if (negocio instanceof Alquiler) {       
                        negocio.getVehiculo().setEstado(Estado.ALQUILADO);
                        transaccion.setEstadoTransaccion(EstadoTransaccion.TERMINADA);
                        transaccion.calcularPrecioTotal();
                    } else if (negocio instanceof Venta) {
                        negocio.getVehiculo().setEstado(Estado.VENDIDO);
                        transaccion.setEstadoTransaccion(EstadoTransaccion.TERMINADA);
                        transaccion.calcularPrecioTotal();
                    }
                }
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Verifique el campo: Impuesto Transaccion.");
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

    @FXML
    void cargarDatos(ActionEvent event) {
        Transaccion transaccion = app.getEmpleadoViewController().getSelectedTransaccion();

        for (Negocio negocio : transaccion.getNegocios()) {
            if (negocio instanceof Compra) {
                txtPrecioCompra.setText(((Compra) negocio).getPrecioCompra() + "");
            } else if (negocio instanceof Venta) {
                txtPrecioVenta.setText(((Venta) negocio).getPrecioVenta() + "");
            } else if (negocio instanceof Alquiler) {
                txtPrecioAlquiler.setText(((Alquiler) negocio).getPrecioAlquiler() + "");
                dtpckFechaInicio.setValue(((Alquiler) negocio).getFechaInicio());
                dtpckFechaFin.setValue(((Alquiler) negocio).getFechaFinal());
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
