package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import co.edu.uniquindio.poo.controller.ConsultaSolicitudesController;
import co.edu.uniquindio.poo.controller.DatosVehiculoController;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.AdministradorViewController;
import co.edu.uniquindio.poo.viewController.ClienteViewController;
import co.edu.uniquindio.poo.viewController.ConsultaSolicitudesViewController;
import co.edu.uniquindio.poo.viewController.ConsultaTransaccionViewController;
import co.edu.uniquindio.poo.viewController.DatosAlquilerViewController;
import co.edu.uniquindio.poo.viewController.DatosClienteViewController;
import co.edu.uniquindio.poo.viewController.DatosEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.DatosVehiculoViewController;
import co.edu.uniquindio.poo.viewController.EmpleadoViewController;
import co.edu.uniquindio.poo.viewController.LoginViewController;
import co.edu.uniquindio.poo.viewController.RestablecerViewController;
import co.edu.uniquindio.poo.viewController.SolicitudClienteViewController;
import co.edu.uniquindio.poo.viewController.TransaccionViewController;
import co.edu.uniquindio.poo.viewController.VentaClienteViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage loginStage;
    private Stage restablecerStage;
    private Stage administradorStage;
    private Stage empleadoStage;
    private Stage consultaTransaccionStage;
    private Stage clienteStage;
    private Stage ventaClienteStage;
    private Stage solicitudClienteStage;
    private Stage datosEmpleadoStage;
    private Stage datosClienteStage;
    private Stage datosVehiculoStage;
    private Stage transaccionStage;
    private Stage datosAlquilerStage;
    private Stage consultaSolcitudesStage;

    LoginViewController loginViewController;
    RestablecerViewController restablecerViewController;
    AdministradorViewController administradorViewController;
    EmpleadoViewController empleadoViewController;
    ConsultaTransaccionViewController consultaTransaccionViewController;
    ClienteViewController clienteViewController;
    VentaClienteViewController ventaClienteViewController;
    SolicitudClienteViewController solicitudClienteViewController;
    DatosEmpleadoViewController datosEmpleadoViewController;
    DatosClienteViewController datosClienteViewController;
    DatosVehiculoViewController datosVehiculoViewController;
    TransaccionViewController transaccionViewController;
    DatosAlquilerViewController datosAlquilerViewController;
    ConsultaSolicitudesViewController consultaSolicitudesViewController;

    public static Concesionario concesionario = new Concesionario("TU CARRO UQ");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage loginStage) throws IOException {
        this.loginStage = loginStage;
        this.loginStage.setTitle("Gestion de la Empresa");
        openLoginView();
    }

    public void openLoginView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
            Parent root = loader.load();

            loginViewController = loader.getController();
            loginViewController.setApp(this);

            Scene scene = new Scene(root);
            loginStage = new Stage();
            loginStage.setScene(scene);

            loginStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openRestablecerView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("RestablecerView.fxml"));
            Parent root = loader.load();

            restablecerViewController = loader.getController();
            restablecerViewController.setApp(this);

            Scene scene = new Scene(root);
            restablecerStage = new Stage();
            restablecerStage.initModality(Modality.WINDOW_MODAL);
            restablecerStage.setScene(scene);

            restablecerStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openAdministradorView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("AdministradorView.fxml"));
            Parent root = loader.load();

            administradorViewController = loader.getController();
            administradorViewController.setApp(this);

            Scene scene = new Scene(root);
            administradorStage = new Stage();
            administradorStage.setScene(scene);

            administradorStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openEmpleadoView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmpleadoView.fxml"));
            Parent root = loader.load();

            empleadoViewController = loader.getController();
            empleadoViewController.setApp(this);

            Scene scene = new Scene(root);
            empleadoStage = new Stage();
            empleadoStage.setScene(scene);

            empleadoStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openConsultaTransaccionView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultaTransaccionView.fxml"));
            Parent root = loader.load();

            consultaTransaccionViewController = loader.getController();
            consultaTransaccionViewController.setApp(this);

            Scene scene = new Scene(root);
            consultaTransaccionStage = new Stage();
            consultaTransaccionStage.initModality(Modality.WINDOW_MODAL);
            consultaTransaccionStage.setScene(scene);

            consultaTransaccionStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openClienteView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ClienteView.fxml"));
            Parent root = loader.load();

            clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(root);
            clienteStage = new Stage();
            clienteStage.setScene(scene);

            clienteStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openVentaClienteView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("VentaClienteView.fxml"));
            Parent root = loader.load();

            ventaClienteViewController = loader.getController();
            ventaClienteViewController.setApp(this);

            Scene scene = new Scene(root);
            ventaClienteStage = new Stage();
            ventaClienteStage.initModality(Modality.WINDOW_MODAL);
            ventaClienteStage.setScene(scene);

            ventaClienteStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openSolicitudClienteView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("SolicitudClienteView.fxml"));
            Parent root = loader.load();

            solicitudClienteViewController = loader.getController();
            solicitudClienteViewController.setApp(this);

            Scene scene = new Scene(root);
            solicitudClienteStage = new Stage();
            solicitudClienteStage.initModality(Modality.WINDOW_MODAL);
            solicitudClienteStage.setScene(scene);

            solicitudClienteStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openDatosEmpleadoView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DatosEmpleadoView.fxml"));
            Parent root = loader.load();

            datosEmpleadoViewController = loader.getController();
            datosEmpleadoViewController.setApp(this);

            Scene scene = new Scene(root);
            datosEmpleadoStage = new Stage();
            datosEmpleadoStage.initModality(Modality.WINDOW_MODAL);
            datosEmpleadoStage.setScene(scene);

            datosEmpleadoStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openDatosClienteView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DatosClienteView.fxml"));
            Parent root = loader.load();

            datosClienteViewController = loader.getController();
            datosClienteViewController.setApp(this);

            Scene scene = new Scene(root);
            datosClienteStage = new Stage();
            datosClienteStage.initModality(Modality.WINDOW_MODAL);
            datosClienteStage.setScene(scene);

            datosClienteStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openDatosVehiculoView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DatosVehiculoView.fxml"));
            Parent root = loader.load();

            datosVehiculoViewController = loader.getController();
            datosVehiculoViewController.setApp(this);

            Scene scene = new Scene(root);
            datosVehiculoStage = new Stage();
            datosVehiculoStage.initModality(Modality.WINDOW_MODAL);
            datosVehiculoStage.setScene(scene);

            datosVehiculoStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openTransaccionView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("TransaccionView.fxml"));
            Parent root = loader.load();

            transaccionViewController = loader.getController();
            transaccionViewController.setApp(this);

            Scene scene = new Scene(root);
            transaccionStage = new Stage();
            transaccionStage.initModality(Modality.WINDOW_MODAL);
            transaccionStage.setScene(scene);

            transaccionStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openConsultaSolicitudesView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ConsultaSolicitudesView.fxml"));
            Parent root = loader.load();

            consultaSolicitudesViewController = loader.getController();
            consultaSolicitudesViewController.setApp(this);

            Scene scene = new Scene(root);
            consultaSolcitudesStage = new Stage();
            consultaSolcitudesStage.initModality(Modality.WINDOW_MODAL);
            consultaSolcitudesStage.setScene(scene);

            consultaSolcitudesStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openDatosAlquilerView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DatosAlquilerView.fxml"));
            Parent root = loader.load();

            datosAlquilerViewController = loader.getController();
            datosAlquilerViewController.setApp(this);

            Scene scene = new Scene(root);
            datosAlquilerStage = new Stage();
            datosAlquilerStage.initModality(Modality.WINDOW_MODAL);
            datosAlquilerStage.setScene(scene);

            datosAlquilerStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LoginViewController getLoginViewController() {
        return loginViewController;
    }

    public RestablecerViewController getRestablecerViewController() {
        return restablecerViewController;
    }

    public AdministradorViewController getAdministradorViewController() {
        return administradorViewController;
    }

    public DatosEmpleadoViewController getDatosEmpleadoViewController() {
        return datosEmpleadoViewController;
    }

    public DatosClienteViewController getDatosClienteViewController() {
        return datosClienteViewController;
    }

    public EmpleadoViewController getEmpleadoViewController() {
        return empleadoViewController;
    }

    public ClienteViewController getClienteViewController() {
        return clienteViewController;
    }

    public VentaClienteViewController getVentaClienteViewController() {
        return ventaClienteViewController;
    }

    public SolicitudClienteViewController getSolicitudClienteViewController() {
        return solicitudClienteViewController;
    }

    public DatosVehiculoViewController getDatosVehiculoViewController() {
        return datosVehiculoViewController;
    }

    public ConsultaTransaccionViewController getConsultaTransaccionViewController() {
        return consultaTransaccionViewController;
    }

    public TransaccionViewController getTransaccionViewController() {
        return transaccionViewController;
    }

    public DatosAlquilerViewController getDatosAlquilerViewController() {
        return datosAlquilerViewController;
    }

    public ConsultaSolicitudesViewController getConsultaSolicitudesViewController() {
        return consultaSolicitudesViewController;
    }

}