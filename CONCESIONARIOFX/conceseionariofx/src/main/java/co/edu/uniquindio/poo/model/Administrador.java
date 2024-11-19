package co.edu.uniquindio.poo.model;

public class Administrador extends Usuario implements Login {
    private String departamento;

    /**
     * Constructor de la clase Administrador
     * 
     * @param departamento el departamento del administrador
     */
    public Administrador(String nombre, String apellido, String cedula, String telefono, String correo,
            String direccion,
            String cuenta, String contrasenia, String preguntaRecuperacion, String respuestaRecuperacion,
            String departamento) {
        super(nombre, apellido, cedula, telefono, correo, cuenta, contrasenia, preguntaRecuperacion,
                respuestaRecuperacion);
        this.departamento = departamento;
    }

    /**
     * Metodo para obtener el departamento
     * 
     * @return el departamento del administrador
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Metodo para cambiar el departamento
     * 
     * @param departamento el nuevo departamento del administrador
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
