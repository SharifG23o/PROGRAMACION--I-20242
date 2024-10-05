package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.Period;

public class DetallePrestamo {
    private int cantidad;
    private double subTotal;
    private Libro libro;
    
    /**
     * Metodo constructor de la clase DetallesPrestamo
     * 
     * @param cantidad
     * @param libro
     */
    public DetallePrestamo(int cantidad, Libro libro) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.subTotal = 0;
    }

    /**
     * Metodo para obetener la cantidad de prestamos que esta incluido un libro por
     * su nombre
     * 
     * @param nombre
     * @return Cantidad Prestamos Contenido
     */
    public int consultarLibroEnPrestamoNombre(String nombre) {
        int contador = 0;
        if (libro.getTitulo().equals(nombre)) {
            contador = cantidad;
        }
        return contador;
    }

    /**
     * Metodo para calcular el subtotal
     * 
     * @return subtotal de un prestamo
     */
    public double subtotal(double costoDia, LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        double costoDelPrestamo = costoDia;
        double dias = calcularDiasPrestamo(fechaPrestamo, fechaEntrega);
        double resultado = cantidad * (costoDelPrestamo * dias);
        this.subTotal = resultado;
        return subTotal;
    }

    /**
     * Metodo para calcular los dias que dura un prestamo
     * 
     * @return dias
     */
    public int calcularDiasPrestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega) {
        Period period = Period.between(fechaPrestamo, fechaEntrega);
        int dias = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return dias;
    }

    /**
     * Metodo para entregar un prestamo
     * 
     * @param libro
     */
    public void EntregarPrestamo(Prestamo prestamo) {
        int imprimir = prestamo.total();
        System.out.println("El costo total del prestamo es: " + imprimir);
        int cantidad = libro.getUnidadesDisponibles();
        libro.setUnidadesDisponibles(cantidad + 1);
        libro.cambiarEstado();
    }

    /**
     * Metodo para obtener la cantidad de libros del prestamo
     * 
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo para cambiar la cantidad
     * 
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * metodo para obtener el subtotal
     * 
     * @return subtotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * metodo para cambiar el subtotal
     * 
     * @param subTotal
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * Metodo para obtener el libro
     * 
     * @return libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Metodo para cambiar el libro
     * 
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", subTotal=" + subTotal + ", libro=" + libro + "]";
    }
}