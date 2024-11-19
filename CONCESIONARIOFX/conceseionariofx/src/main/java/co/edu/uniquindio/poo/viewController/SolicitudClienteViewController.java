package co.edu.uniquindio.poo.viewController;

import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.controller.SolicitudClienteController;
import co.edu.uniquindio.poo.model.Alquiler;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Compra;
import co.edu.uniquindio.poo.model.EstadoTransaccion;
import co.edu.uniquindio.poo.model.Negocio;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Venta;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

public class SolicitudClienteViewController {
    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private DatePicker date1;

    private App app;

    SolicitudClienteController solicitudClienteController;

    @FXML
    void initialize() {
        solicitudClienteController = new SolicitudClienteController(app.concesionario);
    }

    @FXML
    void enviarTransaccion(ActionEvent event) {
        LinkedList<String> codigosExistentes = new LinkedList<>();
        for (Transaccion transaccion : solicitudClienteController.obtenerListaTransacciones()) {
            codigosExistentes.add(transaccion.getCodigo());
        }
        String codigo = generarCodigoUnico(codigosExistentes);
        String usuario = app.getLoginViewController().getUsuario();
        Cliente cliente = solicitudClienteController.verificarUsuario(usuario);
        Transaccion transaccion = new Transaccion(codigo, 0, date1.getValue(), cliente, null);
        transaccion.setEstadoTransaccion(EstadoTransaccion.PENDIENTE);
        cliente.getTransacciones().add(transaccion);
        Negocio negocio = crearNegocio(transaccion);
        transaccion.getNegocios().add(negocio);
        solicitudClienteController.agregarTransaccion(transaccion);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("INFO");
        alerta.setHeaderText(null);
        alerta.setContentText("Se ha creado la solicitud.");
        alerta.showAndWait();
    }

    private Negocio crearNegocio(Transaccion transaccion) {
        Negocio negocio = null;
        Vehiculo vehiculo = app.getClienteViewController().getSelectedVehiculo();
        if (app.getClienteViewController().comprarVehiculo) {
            negocio = new Compra(null, 0, vehiculo, transaccion, 0, false);
        } else if (app.getClienteViewController().alquilarVehiculo) {
            negocio = new Alquiler(null, 0, vehiculo, transaccion, 0, null, null);
        } else if (app.getVentaClienteViewController().venderVehiculo) {
            negocio = new Venta(null, 0, vehiculo, transaccion, 0);
        }
        return negocio;
    }

    public String generarCodigoUnico(LinkedList<String> codigosExistentes) {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int longitudCodigo = 6;
        String codigo;

        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < longitudCodigo; i++) {
                sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
            }
            codigo = sb.toString();
        } while (!codigosExistentes.add(codigo));

        return codigo;
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
