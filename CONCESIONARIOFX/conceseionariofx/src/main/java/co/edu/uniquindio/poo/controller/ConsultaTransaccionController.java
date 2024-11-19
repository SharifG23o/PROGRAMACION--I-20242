package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vendedor;

public class ConsultaTransaccionController {
    Concesionario concesionario;

    public ConsultaTransaccionController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public Vendedor verificarUsuario(String usuario) {
        return concesionario.verificarUsuarioVendedor(usuario);
    }
}
