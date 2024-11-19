package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;

import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vendedor;

public class LoginController {

    Concesionario concesionario;
    
    public LoginController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ArrayList<Cliente> obtenerListaClientes() {
        return concesionario.getClientes();
    }

    public ArrayList<Vendedor> obtenerListaVendedores() {
        return concesionario.getVendedores();
    }

    public Administrador obtenerAdministrador() {
        return concesionario.getAdministrador();
    }
}
