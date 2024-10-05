package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Prestamo {
    private LocalDate fechaPrestamo, fechaEntrega;
    private double costoDia;
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private LinkedList<DetallePrestamo> detallePrestamos;

    /**
     * Metodo constructor de la clase prestamo
     * 
     * @param fechaPrestamo
     * @param fechaEntrega
     * @param costoDia
     * @param codigo
     * @param estudiante
     * @param bibliotecario
     */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, double costoDia, String codigo,
            Estudiante estudiante, Bibliotecario bibliotecario) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costoDia = costoDia;
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        bibliotecario.agregarPrestamo(this);
        estudiante.agregarPrestamo(this);
        detallePrestamos = new LinkedList<>();
    }

    /**
     * Metodo para calcular el valor total del prestamo
     * 
     * @return valor total de los prestamos
     */
    public int total() {
        int contador = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            double subTotal = detallePrestamo.subtotal(getCostoDia(), getFechaPrestamo(), getFechaEntrega());
            contador += subTotal;
        }
        return contador;
    }

    /**
     * Metodo para agregar un detalle prestamo al prestamo
     * @param detallePrestamo
     */
    public void agregarDetallePrestamo(DetallePrestamo detallePrestamo) {
        detallePrestamos.add(detallePrestamo);
    }

    /**
     * Metodo para obtener la fecha del prestamo
     * 
     * @return fecha del prestamo
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Metodo para cambiar la fecha del prestamo
     * 
     * @param fechaPrestamo
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Metodo para obtener la fecha de entrega
     * 
     * @return fecha de entrega
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Meetodo para cambiar la fecha de entrega
     * 
     * @param fechaEntrega
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Metodo para obtener el costo del prestamo por dia
     * 
     * @return costo por dia
     */
    public double getCostoDia() {
        return costoDia;
    }

    /**
     * Metodo para cambiar el costo del prestamo por dia
     * 
     * @param costoDia
     */
    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    /**
     * Metodo para obtener el codigo del prestamo
     * 
     * @return codifo del prestamo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para cambiar el codigo del prestamo
     * 
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener un estudiante
     * 
     * @return estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Metodo para cambiar el valor del estudiante
     * 
     * @param estudiante
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Metodo para obtener un bibliotecario
     * 
     * @return
     */
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    /**
     * Metodo para cambiar el valor del bibliotecario
     * 
     * @param bibliotecario
     */
    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    /**
     * Metodo para obtener la lista de los detalles del prestamo
     * 
     * @return
     */
    public LinkedList<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    /**
     * Metodo para cambiar la lista de los detalle del prestamo
     * 
     * @param detallePrestamos
     */
    public void setDetallePrestamos(LinkedList<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega + ", costoDia=" + costoDia
                + ", codigo=" + codigo + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario
                + ", detallePrestamos=" + detallePrestamos + "]";
    }
}