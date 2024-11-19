package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Concesionario {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Transaccion> transacciones;
    private Administrador administrador;

    /**
     * Constructor que inicializa el concesionario con un nombre.
     * 
     * @param nombre Nombre del concesionario.
     */
    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
        agregarDatos();
        administrador = agregarGranAdministrador();
    }

    /**
     * Método para agregar un vendedor y un cliente con datos predefinidos.
     * 
     * Este método crea un objeto `Vendedor` y un objeto `Cliente` con datos
     * predeterminados,
     * luego los agrega a las colecciones correspondientes utilizando los métodos
     * `agregarCliente` y `agregarVendedor`.
     */
    public void agregarDatos() {
        Vendedor vendedor = new Vendedor("Juan", "Pérez", "1234567890", "0987654321", "juan.perez@email.com",
                "juanperez", "secreta123", "nombre de tu madre", "María Pérez", "EMP001");
        Cliente cliente = new Cliente("Ana", "Gómez", "9876543210", "0123456789", "ana.gomez@email.com", "anagomez",
                "contraseña123", "nombre de tu mascota", "Rex", "Calle Ficticia 123");
        Vehiculo sedan = new Sedan("S1234", "Toyota", "Corolla", true, 6, 180.0, 1800, 5, 4, 6, Combustion.GASOLINA,
                Transmision.MANUAL,
                true, true, true, 450, true, true, true, true, true);
        sedan.setEstado(Estado.DISPONIBLE);
        agregarVehiculo(sedan);
        agregarCliente(cliente);
        agregarVendedor(vendedor);
    }

    /**
     * Agrega un administrador predeterminado al concesionario.
     */
    public Administrador agregarGranAdministrador() {
        Administrador administrador = new Administrador("Raul", "Rivera", "1034", "317", "raul@uqvirual.edu.co",
                "Mz G Casa 3", "UQ", "UQ", "¿Cuando se fundo la universidad del Quindio?", "1960", "Gerencia");
        return administrador;
    }

    /**
     * Metodo para obtener el nombre del concesionario.
     * 
     * @return el nombre del concesionario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre del concesionario.
     * 
     * @param nombre el nuevo nombre del concesionario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la lista de clientes del concesionario.
     * 
     * @return la lista de clientes.
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Metodo para establecer la lista de clientes del concesionario.
     * 
     * @param clientes la nueva lista de clientes.
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Metodo para obtener la lista de vendedores del concesionario.
     * 
     * @return la lista de vendedores.
     */
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    /**
     * Metodo para establecer la lista de vendedores del concesionario.
     * 
     * @param vendedores la nueva lista de vendedores.
     */
    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    /**
     * Metodo para obtener el administrador del concesionario.
     * 
     * @return el administrador.
     */
    public Administrador getAdministrador() {
        return administrador;
    }

    /**
     * Metodo para establecer el administrador del concesionario.
     * 
     * @param administrador el nuevo administrador.
     */
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * Metodo para obtener la lista de vehículos disponibles en el concesionario.
     * 
     * @return la lista de vehículos.
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Metodo para establecer la lista de vehículos en el concesionario.
     * 
     * @param vehiculos la nueva lista de vehículos.
     */
    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo para obtener la lista de transacciones realizadas en el concesionario.
     * 
     * @return la lista de transacciones.
     */
    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Metodo para establecer la lista de transacciones del concesionario.
     * 
     * @param transacciones la nueva lista de transacciones.
     */
    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Verifica si un cliente existe por su usuario.
     * 
     * @param direccion Usuario del cliente.
     * @return Cliente encontrado o null.
     */
    public Cliente verificarUsuarioCliente(String usuario) {
        for (Cliente cliente : clientes) {
            if (cliente.getCuenta().equals(usuario)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Verifica si un vendedor existe por su usuario.
     * 
     * @param direccion Usuario del vendedor.
     * @return Vendedor encontrado o null.
     */
    public Vendedor verificarUsuarioVendedor(String usuario) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCuenta().equals(usuario)) {
                return vendedor;
            }
        }
        return null;
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
     * Verifica si un cliente existe por su cedula.
     * 
     * @param direccion Cedula del cliente.
     * @return Cliente encontrado o null.
     */
    public Cliente verificarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
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
    public Vendedor verificarVendedor(String cedula, String codigoEmpleado) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCodigoEmpleado().equals(codigoEmpleado) || vendedor.getCedula().equals(cedula)) {
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
