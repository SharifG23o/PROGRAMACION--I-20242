package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String identificacion;
    private String celular;
    private String correo;
    private String direccion;
    private static List<Cliente> clientes = new ArrayList<>(); // Lista de clientes
    private List<Reserva> reservas = new ArrayList<>(); // Lista de reservas del cliente

    public Cliente(String nombre, String identificacion, String celular, String correo, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Métodos CRUD para Cliente

    // Método para agregar un nuevo cliente
    public static boolean agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getIdentificacion()) == null) {
            clientes.add(cliente);
            System.out.println("Cliente agregado con éxito: " + cliente);
            return true;
        } else {
            System.out.println("El cliente con identificación " + cliente.getIdentificacion() + " ya existe.");
            return false;
        }
    }

    // Método para buscar un cliente por su identificación
    public static Cliente buscarCliente(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        System.out.println("Cliente con identificación " + identificacion + " no encontrado.");
        return null;
    }

    // Método para actualizar un cliente existente
    public static boolean actualizarCliente(String identificacion, String nombre, String celular, String correo, String direccion) {
        Cliente cliente = buscarCliente(identificacion);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setCelular(celular);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            System.out.println("Cliente actualizado con éxito: " + cliente);
            return true;
        } else {
            System.out.println("Cliente con identificación " + identificacion + " no encontrado.");
            return false;
        }
    }

    // Método para eliminar un cliente por su identificación
    public static boolean eliminarCliente(String identificacion) {
        Cliente cliente = buscarCliente(identificacion);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado con éxito: " + cliente);
            return true;
        } else {
            System.out.println("Cliente con identificación " + identificacion + " no encontrado.");
            return false;
        }
    }

    // Método para obtener la lista de todos los clientes
    public static List<Cliente> obtenerTodosLosClientes() {
        return clientes;
    }

    // Métodos para gestionar reservas del cliente

    // Método para hacer una reserva
    public void hacerReserva(double tarifaBase, double tarifaAdicional, int numeroDiasReserva) {
        Reserva reserva = new Reserva(tarifaBase, tarifaAdicional, numeroDiasReserva);
        reservas.add(reserva);
        System.out.println("Reserva realizada con éxito: " + reserva);
    }

    // Método para mostrar todas las reservas del cliente
    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas realizadas para este cliente.");
        } else {
            System.out.println("Reservas del cliente " + nombre + ":");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }

    // Métodos Getter y Setter de la clase Cliente

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", identificacion=" + identificacion + ", celular=" + celular + 
               ", correo=" + correo + ", direccion=" + direccion + "]";
    }
}
