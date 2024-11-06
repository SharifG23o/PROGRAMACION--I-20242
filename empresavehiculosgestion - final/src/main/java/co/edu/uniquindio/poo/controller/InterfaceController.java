package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Reserva;
import co.edu.uniquindio.poo.model.Vehiculo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InterfaceController {
    private List<Cliente> clientes = new ArrayList<>(); // Lista para almacenar los clientes
    private List<Vehiculo> vehiculos = new ArrayList<>(); // Lista para almacenar los vehículos
    private List<Reserva> reservas = new ArrayList<>(); // Lista para almacenar las reservas

    // Referencias a la interfaz
    @FXML
    private TextField nombreField;
    @FXML
    private TextField identificacionField;
    @FXML
    private TextField celularField;
    @FXML
    private TextField correoField;
    @FXML
    private TextField direccionField;
    @FXML
    private TableView<Cliente> clientesTable;
    @FXML
    private TableColumn<Cliente, String> nombreColumn;
    @FXML
    private TableColumn<Cliente, String> identificacionColumn;
    @FXML
    private TableColumn<Cliente, String> celularColumn;
    @FXML
    private TableColumn<Cliente, String> correoColumn;
    @FXML
    private TableColumn<Cliente, String> direccionColumn;

    @FXML
    private TextField modeloField;
    @FXML
    private TextField marcaField;
    @FXML
    private TextField anioField;
    @FXML
    private TextField matriculaField; 
    @FXML
    private TableView<Vehiculo> vehiculosTable;
    @FXML
    private TableColumn<Vehiculo, String> modeloColumn;
    @FXML
    private TableColumn<Vehiculo, String> marcaColumn;
    @FXML
    private TableColumn<Vehiculo, Integer> anioColumn;

    @FXML
    private TextField clienteIdField;
    @FXML
    private TextField vehiculoIdField;
    @FXML
    private TextField fechaPrestamoField;
    @FXML
    private TableView<Reserva> prestamosTable;
    @FXML
    private TableColumn<Reserva, String> clienteIdColumn;
    @FXML
    private TableColumn<Reserva, String> vehiculoIdColumn;
    @FXML
    private TableColumn<Reserva, String> fechaPrestamoColumn;

    // Método para agregar cliente
    @FXML
    public void agregarCliente() {
        String nombre = nombreField.getText();
        String identificacion = identificacionField.getText();
        String celular = celularField.getText();
        String correo = correoField.getText();
        String direccion = direccionField.getText();

        if (nombre.isEmpty() || identificacion.isEmpty()) {
            mostrarAlerta("Error", "Nombre e Identificación son obligatorios.");
            return;
        }

        Cliente nuevoCliente = new Cliente(nombre, identificacion, celular, correo, direccion);
        clientes.add(nuevoCliente);
        mostrarAlerta("Éxito", "Cliente agregado con éxito.");
        actualizarTablaClientes();
    }

    // Método para buscar cliente
    @FXML
    public void buscarCliente() {
        String identificacion = identificacionField.getText();
        Cliente cliente = buscarClientePorIdentificacion(identificacion);
        if (cliente != null) {
            nombreField.setText(cliente.getNombre());
            celularField.setText(cliente.getCelular());
            correoField.setText(cliente.getCorreo());
            direccionField.setText(cliente.getDireccion());
        } else {
            mostrarAlerta("Error", "Cliente no encontrado.");
        }
    }

    // Método para actualizar cliente
    @FXML
    public void actualizarCliente() {
        String identificacion = identificacionField.getText();
        Cliente cliente = buscarClientePorIdentificacion(identificacion);
        if (cliente != null) {
            cliente.setNombre(nombreField.getText());
            cliente.setCelular(celularField.getText());
            cliente.setCorreo(correoField.getText());
            cliente.setDireccion(direccionField.getText());
            mostrarAlerta("Éxito", "Cliente actualizado con éxito.");
            actualizarTablaClientes();
        } else {
            mostrarAlerta("Error", "Cliente no encontrado.");
        }
    }

    // Método para eliminar cliente
    @ FXML
    public void eliminarCliente() {
        String identificacion = identificacionField.getText();
        Cliente cliente = buscarClientePorIdentificacion(identificacion);
        if (cliente != null) {
            clientes.remove(cliente);
            mostrarAlerta("Éxito", "Cliente eliminado con éxito.");
            actualizarTablaClientes();
        } else {
            mostrarAlerta("Error", "Cliente no encontrado.");
        }
    }

    // Método para agregar vehículo
    @FXML
    public void agregarVehiculo() {
        String matricula = matriculaField.getText();
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        String anioTexto = anioField.getText();

        if (matricula.isEmpty() || marca.isEmpty() || modelo.isEmpty() || anioTexto.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios.");
            return;
        }

        int anio;
        try {
            anio = Integer.parseInt(anioTexto);
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "El año debe ser un número válido.");
            return;
        }

        Vehiculo nuevoVehiculo = new Auto(matricula, marca, modelo, LocalDate.now(), anio);
        vehiculos.add(nuevoVehiculo);
        mostrarAlerta("Éxito", "Vehículo agregado con éxito.");
        actualizarTablaVehiculos();
    }

    // Método para buscar vehículo
    @FXML
    public void buscarVehiculo() {
        String matricula = matriculaField.getText();
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            modeloField.setText(vehiculo.getModelo());
            marcaField.setText(vehiculo.getMarca());
            anioField.setText(String.valueOf(vehiculo.getAnio()));
        } else {
            mostrarAlerta("Error", "Vehículo no encontrado.");
        }
    }

    // Método para actualizar vehículo
    @FXML
    public void actualizarVehiculo() {
        String matricula = matriculaField.getText();
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            vehiculo.setMarca(marcaField.getText());
            vehiculo.setModelo(modeloField.getText());
            vehiculo.setAnio(Integer.parseInt(anioField.getText()));
            mostrarAlerta("Éxito", "Vehículo actualizado con éxito.");
            actualizarTablaVehiculos();
        } else {
            mostrarAlerta("Error", "Vehículo no encontrado.");
        }
    }

    // Método para eliminar vehículo
    @FXML
    public void eliminarVehiculo() {
        String matricula = matriculaField.getText();
        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);
        if (vehiculo != null) {
            vehiculos.remove(vehiculo);
            mostrarAlerta("Éxito", "Vehículo eliminado con éxito.");
            actualizarTablaVehiculos();
        } else {
            mostrarAlerta("Error", "Vehículo no encontrado.");
        }
    }

    // Método para agregar préstamo
    @FXML
    public void agregarPrestamo() {
        String clienteId = clienteIdField.getText();
        String vehiculoId = vehiculoIdField.getText();
        String fechaTexto = fechaPrestamoField.getText();

        if (clienteId.isEmpty() || vehiculoId.isEmpty() || fechaTexto.isEmpty()) {
            mostrarAlerta("Error", "Todos los campos son obligatorios.");
            return;
        }

        @SuppressWarnings("unused")
        LocalDate fechaPrestamo;
        try {
            fechaPrestamo = LocalDate.parse(fechaTexto);
        } catch (Exception e) {
            mostrarAlerta("Error", "Fecha de préstamo no válida.");
            return;
        }

        Reserva nuevaReserva = new Reserva(3456.88,32456.88,2);
        reservas.add(nuevaReserva);
        mostrarAlerta("Éxito", "Préstamo agregado con éxito.");
        actualizarTablaPrestamos();
    }

    // Método para actualizar préstamo
    @FXML
    public void actualizarPrestamo() {
       
    }

    // Método para eliminar préstamo
    @FXML
    public void eliminarPrestamo() {
        
    }

    // Método para actualizar la tabla de clientes
    private void actualizarTablaClientes() {
        clientesTable.getItems().clear();
        clientesTable.getItems().addAll(clientes);
    }

    // Método para actualizar la tabla de vehículos
    private void actualizarTablaVehiculos() {
        vehiculosTable.getItems().clear();
        vehiculosTable.getItems().addAll(vehiculos);
    }

    // Método para actualizar la tabla de préstamos
    private void actualizarTablaPrestamos() {
        prestamosTable.getItems().clear();
        prestamosTable.getItems().addAll(reservas);
    }

    // Método auxiliar para mostrar alertas
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    // Métodos de búsqueda auxiliares
    private Cliente buscarClientePorIdentificacion(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null;
    }

    private Vehiculo buscarVehiculoPorMatricula(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }


    @FXML
public void buscarPrestamo() {
    String clienteId = clienteIdField.getText();
    String vehiculoId = vehiculoIdField.getText();

    for (Reserva reserva : reservas) {
        if (reserva.getCliente().equals(clienteId) && reserva.getVehiculo().equals(vehiculoId)) {
            fechaPrestamoField.setText(reserva.getFecha().toString());
            return;
        }
    }
    mostrarAlerta("Error", "Préstamo no encontrado.");
}
}