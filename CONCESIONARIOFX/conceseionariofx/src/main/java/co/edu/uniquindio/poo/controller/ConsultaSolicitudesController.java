package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Transaccion;

import java.util.List;

public class ConsultaSolicitudesController {

    private Concesionario concesionario;

    public ConsultaSolicitudesController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public Cliente obtenerClientePorUsuario(String usuario) {
        return concesionario.verificarUsuarioCliente(usuario);
    }
}
