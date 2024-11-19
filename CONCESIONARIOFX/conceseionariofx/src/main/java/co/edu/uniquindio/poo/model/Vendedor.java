package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Vendedor extends Usuario implements Login {
    private String codigoEmpleado;
    private LinkedList<Transaccion> transacciones;

    /**
     * Constructor de la clase Vendedor
     * 
     * @param nombre                el nombre del vendedor
     * @param apellido              el apellido del vendedor
     * @param cedula                la cedula del vendedor
     * @param telefono              el telefono del vendedor
     * @param correo                el correo del vendedor
     * @param cuenta                la cuenta del vendedor
     * @param contrasenia           la contrasenia del vendedor
     * @param preguntaRecuperacion  la pregunta de recuperacion del vendedor
     * @param respuestaRecuperacion la respuesta de recuperacion del vendedor
     * @param codigoEmpleado        el codigo de empleado del vendedor
     */
    public Vendedor(String nombre, String apellido, String cedula, String telefono, String correo, String cuenta,
            String contrasenia, String preguntaRecuperacion, String respuestaRecuperacion, String codigoEmpleado) {
        super(nombre, apellido, cedula, telefono, correo, cuenta, contrasenia, preguntaRecuperacion,
                respuestaRecuperacion);
        this.codigoEmpleado = codigoEmpleado;
        transacciones = new LinkedList<>();
    }

    /**
     * Metodo para obtener el codigo de empleado
     * 
     * @return el codigo de empleado del vendedor
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Metodo para cambiar el codigo de empleado
     * 
     * @param codigoEmpleado el nuevo codigo de empleado del vendedor
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Metodo para obtener la lista de transacciones
     * 
     * @return la lista de transacciones
     */
    public LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Metodo para cambiar la lista de transacciones
     * 
     * @param transacciones la nueva lista de transacciones
     */
    public void setTransacciones(LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Metodo para iniciar sesión verificando la cuenta y la contraseña
     * 
     * @param cuenta      la cuenta del usuario
     * @param contrasenia la contraseña del usuario
     * @return true si las credenciales coinciden, false en caso contrario
     */
    @Override
    public boolean iniciarSesion(String cuenta, String contrasenia) {
        boolean centinela = false;
        if (cuenta.equals(super.getCuenta()) & contrasenia.equals(super.getContrasenia())) {
            centinela = true;
        }
        return centinela;
    }

    /**
     * Metodo para restablecer la contraseña del usuario
     * 
     * @param contrasenia la nueva contraseña del usuario
     */
    @Override
    public void reestablecerContrasenia(String contrasenia) {
        super.setContrasenia(contrasenia);
    }

}
