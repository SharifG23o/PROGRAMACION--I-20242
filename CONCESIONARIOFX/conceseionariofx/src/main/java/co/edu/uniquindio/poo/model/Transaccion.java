package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Transaccion {
    private String codigo;
    private double precioTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private Vendedor vendedor;
    private LinkedList<Negocio> negocios;
    private EstadoTransaccion estadoTransaccion;

    public Transaccion(String codigo, double precioTotal, LocalDate fecha, Cliente cliente, Vendedor vendedor) {
        this.codigo = codigo;
        this.precioTotal = precioTotal;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.estadoTransaccion = EstadoTransaccion.PENDIENTE;
        negocios = new LinkedList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getCedulaCliente() {
        return cliente != null ? cliente.getCedula() : null;
    }

    public String getCodigoVendedor() {
        return vendedor != null ? vendedor.getCodigoEmpleado() : null;
    }

    public String getCodigoVehiculo() {
        String codigoVehiculo = null;
        for (Negocio negocio : negocios) {
            if (negocio.getVehiculo() != null) {
                codigoVehiculo = negocio.getVehiculo().getCodigo();
            } 
        }
        return codigoVehiculo;
    }

    public LinkedList<Negocio> getNegocios() {
        return negocios;
    }

    public void setNegocios(LinkedList<Negocio> negocios) {
        this.negocios = negocios;
    }

    public EstadoTransaccion getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(EstadoTransaccion estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    public void calcularPrecioTotal() {
        double precio = 0;
        for (Negocio negocio : negocios) {
            precio += negocio.calcularPrecioNegocio();
        }
        precioTotal = precio;
    }
}
