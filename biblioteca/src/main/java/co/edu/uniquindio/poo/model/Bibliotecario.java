package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private double salario;
    private int antiguedad;
    private Collection<Prestamo> prestamos;

    /**
     * Metodo constructor de la clase bibliotecario
     * 
     * @param nombre
     * @param cedula
     * @param correo
     * @param telefono
     * @param salario
     * @param antiguedad
     */
    public Bibliotecario(String nombre, String cedula, String correo, String telefono, double salario, int antiguedad) {
        super(nombre, cedula, correo, telefono);
        this.salario = salario;
        this.antiguedad = antiguedad;
        prestamos = new LinkedList<>();
    }

    /**
     * Metodo para agreagar un prestamo al bibliotecario
     * 
     * @param prestamo
     */
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    /**
     * Metodo para mostrar la cantidad de prestamos realizados por un bibliotecario
     */
    public String cantidadPrestamos() {
        int contador = 0;
        for (@SuppressWarnings("unused") Prestamo prestamo : prestamos) {
            contador++;
        }
        String mensaje = "\t Cantidad de Prestamos: " + contador;
        return mensaje;
    }

    /**
     * Metodo para calcular el pago del bibliotecario
     * 
     * @return El pago del bibliotecario
     */
    public double calcularPago(Bibliotecario bibliotecario) {
        double bonificacionPrestamos = 0;
        for (Prestamo prestamo : bibliotecario.getPrestamos()) {
            int valorPrestamo = prestamo.total();
            double bonificacionPorPrestamo = valorPrestamo * 0.2;
            bonificacionPrestamos += bonificacionPorPrestamo;
        }
        double bonificacionPorAño = bonificacionPrestamos * 0.02;
        double parcialPago = bonificacionPrestamos + (bonificacionPorAño * antiguedad);
        double totalPago = parcialPago + salario;
        return totalPago;
    }

    /**
     * Metodo para obtener el salario
     * 
     * @return Salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Metodo para cambiar el valor del salario
     * 
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Metodo para obtener los años de antiguedad
     * 
     * @return Antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Metodo para cambiar el valor de la antiguedad
     * 
     * @param antiguedad
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * Metodo para obtener la coleccion de prestamos
     * 
     * @return Prestamos
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo para cambiar el valor de la coleccion de prestamos
     * 
     * @param prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", antiguedad=" + antiguedad + "]";
    }

}