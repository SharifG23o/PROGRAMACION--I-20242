package co.edu.uniquindio.poo.model;

public class Persona {
    private String nombre, cedula, correo;
    private String telefono;

    /**
     * Metodo constructor de la clase persona
     * 
     * @param nombre
     * @param cedula
     * @param correo
     * @param telefono
     */
    public Persona(String nombre, String cedula, String correo, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener el nombre de la persona
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la cedula de la persona
     * 
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo para cambiar la cedula
     * 
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener el correo de la persona
     * 
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para cambiar el correo
     * 
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener el telefono de la persona
     * 
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para cambiar el telefono
     * 
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono
                + "]";
    }

}