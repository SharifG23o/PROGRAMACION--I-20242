package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Transaccion;

public class SolicitudClienteController {
    Concesionario concesionario;

    public SolicitudClienteController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ArrayList<Transaccion> obtenerListaTransacciones() {
        return concesionario.getTransacciones();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        concesionario.crearTransaccion(transaccion);
    }

    public Cliente verificarUsuario(String usuario) {
        return concesionario.verificarUsuarioCliente(usuario);
    }
}
