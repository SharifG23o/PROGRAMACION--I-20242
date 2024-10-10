package co.edu.uniquindio.poo.model;

public abstract class Empleado {

    private String nombre;
    private String identificacion;

    public Empleado(String nombre, String identificacion){

        this.nombre=nombre;
        this.identificacion=identificacion;

    }

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

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }

    
    public abstract double calcularSalario();




    
    
}
