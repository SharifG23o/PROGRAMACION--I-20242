package co.edu.uniquindio.poo.model;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String correo;
    private String cuenta;
    private String contrasenia;
    private String preguntaRecuperacion;
    private String respuestaRecuperacion;

    /**
     * Constructor de la clase Usuario
     * 
     * @param nombre
     * @param apellido
     * @param cedula
     * @param telefono
     * @param correo
     * @param direccion
     * @param cuenta
     * @param contrasenia
     * @param preguntaRecuperacion
     * @param respuestaRecuperacion
     */
    public Usuario(String nombre, String apellido, String cedula, String telefono, String correo,
            String cuenta, String contrasenia, String preguntaRecuperacion, String respuestaRecuperacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.preguntaRecuperacion = preguntaRecuperacion;
        this.respuestaRecuperacion = respuestaRecuperacion;
    }

    /**
     * Metodo para obtener nombre
     * 
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar nombre
     * 
     * @param nombre el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener apellido
     * 
     * @return el apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para cambiar apellido
     * 
     * @param apellido el apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo para obtener cedula
     * 
     * @return la cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo para cambiar cedula
     * 
     * @param cedula la cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener telefono
     * 
     * @return el telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para cambiar telefono
     * 
     * @param telefono el telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener correo
     * 
     * @return el correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para cambiar correo
     * 
     * @param correo el correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener cuenta
     * 
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para cambiar cuenta
     * 
     * @param cuenta la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo para obtener contrasenia
     * 
     * @return la contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Metodo para cambiar contrasenia
     * 
     * @param contrasenia la contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Metodo para obtener pregunta de recuperacion
     * 
     * @return la pregunta de recuperacion
     */
    public String getPreguntaRecuperacion() {
        return preguntaRecuperacion;
    }

    /**
     * Metodo para cambiar pregunta de recuperacion
     * 
     * @param preguntaRecuperacion la pregunta de recuperacion
     */
    public void setPreguntaRecuperacion(String preguntaRecuperacion) {
        this.preguntaRecuperacion = preguntaRecuperacion;
    }

    /**
     * Metodo para obtener respuesta de recuperacion
     * 
     * @return la respuesta de recuperacion
     */
    public String getRespuestaRecuperacion() {
        return respuestaRecuperacion;
    }

    /**
     * Metodo para cambiar respuesta de recuperacion
     * 
     * @param respuestaRecuperacion la respuesta de recuperacion
     */
    public void setRespuestaRecuperacion(String respuestaRecuperacion) {
        this.respuestaRecuperacion = respuestaRecuperacion;
    }
}
