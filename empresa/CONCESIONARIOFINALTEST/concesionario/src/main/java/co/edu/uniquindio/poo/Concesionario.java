package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Concesionario {
    private String nombre; // Nombre del concesionario
    private ArrayList<Cliente> clientes; // Lista de clientes
    private ArrayList<Vendedor> vendedores; // Lista de vendedores
    private ArrayList<Administrador> administradores; // Lista de administradores
    private ArrayList<Vehiculo> vehiculos; // Lista de vehículos
    private ArrayList<Transaccion> transacciones; // Lista de transacciones

    /**
     * Constructor que inicializa el concesionario con un nombre.
     * 
     * @param nombre Nombre del concesionario.
     */
    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.administradores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para la lista de clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Métodos getter y setter para la lista de vendedores
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    // Métodos getter y setter para la lista de administradores
    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    // Métodos getter y setter para la lista de vehículos
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    // Métodos getter y setter para la lista de transacciones
    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Agrega un cliente a la lista.
     * 
     * @param cliente Cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Verifica si un cliente existe por su dirección.
     * 
     * @param direccion Dirección del cliente.
     * @return Cliente encontrado o null.
     */
    public Cliente verificarCliente(String direccion) {
        for (Cliente cliente : clientes) {
            if (cliente.getDireccion().equals(direccion)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Elimina un cliente de la lista.
     * 
     * @param cliente Cliente a eliminar.
     */
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    /**
     * Agrega un vendedor a la lista.
     * 
     * @param vendedor Vendedor a agregar.
     */
    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    /**
     * Verifica si un vendedor existe por su código de empleado.
     * 
     * @param codigoEmpleado Código del vendedor.
     * @return Vendedor encontrado o null.
     */
    public Vendedor verificarVendedor(String codigoEmpleado) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCodigoEmpleado().equals(codigoEmpleado)) {
                return vendedor;
            }
        }
        return null;
    }

    /**
     * Elimina un vendedor de la lista.
     * 
     * @param vendedor Vendedor a eliminar.
     */
    public void eliminarVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    /**
     * Agrega un administrador a la lista.
     * 
     * @param administrador Administrador a agregar.
     */
    public void agregarAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }

    /**
     * Verifica si un administrador existe por su departamento.
     * 
     * @param departamento Departamento del administrador.
     * @return Administrador encontrado o null.
     */
    public Administrador verificarAdministrador(String departamento) {
        for (Administrador administrador : administradores) {
            if (administrador.getDepartamento().equals(departamento)) {
                return administrador;
            }
        }
        return null;
    }

    /**
     * Elimina un administrador de la lista.
     * 
     * @param administrador Administrador a eliminar.
     */
    public void eliminarAdministrador(Administrador administrador) {
        administradores.remove(administrador);
    }

    /**
     * Agrega un vehículo a la lista.
     * 
     * @param vehiculo Vehículo a agregar.
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Verifica si un vehículo existe por su código.
     * 
     * @param codigo Código del vehículo.
     * @return Vehículo encontrado o null.
     */
    public Vehiculo verificarVehiculo(String codigo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodigo().equals(codigo)) {
                return vehiculo;
            }
        }
        return null;
    }

    /**
     * Elimina un vehículo de la lista.
     * 
     * @param vehiculo Vehículo a eliminar.
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    /**
     * Crea una nueva transacción y la agrega a la lista.
     * 
     * @param transaccion Transacción a crear.
     */
    public void crearTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    /**
     * Metodo para obtener una lista de vendedores que realizaron transacciones en
     * un rango de fechas
     * 
     * @param primerFecha  la fecha inicial del rango
     * @param segundaFecha la fecha final del rango
     * @return una lista de vendedores cuyas transacciones se realizaron dentro del
     *         rango de fechas
     */
    public LinkedList<Vendedor> obtenerVendoresFecha(LocalDate primerFecha, LocalDate segundaFecha) {
        LinkedList<Vendedor> vendedoresList = new LinkedList<>();
        for (Vendedor vendedor : vendedores) {
            for (Transaccion transaccion : vendedor.getTransacciones()) {
                LocalDate fecha = transaccion.getFecha();
                if (fecha.isAfter(primerFecha) & fecha.isBefore(segundaFecha)) {
                    vendedoresList.add(vendedor);
                }
            }
        }
        return vendedoresList;
    }
}
