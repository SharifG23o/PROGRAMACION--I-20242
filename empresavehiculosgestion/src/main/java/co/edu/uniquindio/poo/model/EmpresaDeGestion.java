package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeGestion {

    private String nombre;
    private String nit;

    // Listas de clientes, vehículos y reservas
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;
    private List<Reserva> reservas;

    public EmpresaDeGestion(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos CRUD para clientes

    public boolean agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getIdentificacion()) == null) {
            clientes.add(cliente);
            System.out.println("Cliente agregado: " + cliente);
            return true;
        } else {
            System.out.println("Cliente con identificación " + cliente.getIdentificacion() + " ya existe.");
            return false;
        }
    }

    public Cliente buscarCliente(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean actualizarCliente(String identificacion, String nombre, String celular, String correo, String direccion) {
        Cliente cliente = buscarCliente(identificacion);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setCelular(celular);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            System.out.println("Cliente actualizado: " + cliente);
            return true;
        }
        return false;
    }

    public boolean eliminarCliente(String identificacion) {
        Cliente cliente = buscarCliente(identificacion);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado: " + cliente);
            return true;
        }
        return false;
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clientes;
    }

    // Métodos CRUD para vehículos

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        if (buscarVehiculo(vehiculo.getMarca()) == null) {
            vehiculos.add(vehiculo);
            System.out.println("Vehículo agregado: " + vehiculo);
            return true;
        } else {
            System.out.println("Vehículo con placa " + vehiculo.getMarca() + " ya existe.");
            return false;
        }
    }

    public Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    public boolean actualizarVehiculo(String placa, String marca, String modelo) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo != null) {
            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            System.out.println("Vehículo actualizado: " + vehiculo);
            return true;
        }
        return false;
    }

    public boolean eliminarVehiculo(String placa) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo != null) {
            vehiculos.remove(vehiculo);
            System.out.println("Vehículo eliminado: " + vehiculo);
            return true;
        }
        return false;
    }

    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculos;
    }

    // Métodos CRUD para reservas

    public boolean agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva agregada: " + reserva);
        return true;
    }

    public Reserva buscarReserva(int index) {
        if (index >= 0 && index < reservas.size()) {
            return reservas.get(index);
        }
        return null;
    }

    public boolean actualizarReserva(int index, double tarifaBase, double tarifaAdicional, int numeroDiasReserva) {
        Reserva reserva = buscarReserva(index);
        if (reserva != null) {
            reserva.setTarifaBase(tarifaBase);
            reserva.setTarifaAdicional(tarifaAdicional);
            reserva.setNumeroDiasReserva(numeroDiasReserva);
            System.out.println("Reserva actualizada: " + reserva);
            return true;
        }
        return false;
    }

    public boolean eliminarReserva(int index) {
        Reserva reserva = buscarReserva(index);
        if (reserva != null) {
            reservas.remove(reserva);
            System.out.println("Reserva eliminada: " + reserva);
            return true;
        }
        return false;
    }

    public List<Reserva> obtenerTodasLasReservas() {
        return reservas;
    }

    // Métodos Getter y Setter para nombre y nit

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "EmpresaDeGestion [nombre=" + nombre + ", nit=" + nit + "]";
    }



    public boolean iniciarSesion(String nombre, String contraseña){

        return true;
    }
}
