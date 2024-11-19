package co.edu.uniquindio.poo;

public interface Login {
    /**
     * Metodo para iniciar sesión en el sistema
     */
    public boolean iniciarSesion(String cuenta, String contrasenia);

    /**
     * Metodo para restablecer la contraseña de la cuenta
     */
    public void reestablecerContrasenia(String contrasenia);
}
