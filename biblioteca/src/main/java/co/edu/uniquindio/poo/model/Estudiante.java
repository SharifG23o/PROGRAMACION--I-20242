package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {
    private int edad;
    private Collection<Prestamo> prestamos;

    /**
     * Metodo constructor de la clase Estudiante
     * 
     * @param nombre
     * @param cedula
     * @param correo
     * @param telefono
     * @param edad
     */
    public Estudiante(String nombre, String cedula, String correo, String telefono, int edad) {
        super(nombre, cedula, correo, telefono);
        this.edad = edad;
        prestamos = new LinkedList<>();
    }

    /**
     * Metodo para agreagar un prestamo al estudiante
     * 
     * @param prestamo
     */
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    /**
     * Metodo para obtener la edad
     * 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para cambiar la edad
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo para obtener la coleccion de prestamos
     * 
     * @return prestamos
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo para cambiar la coleccion de prestamos
     * 
     * @param prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Estudiante [edad=" + edad + "]";
    }

}