package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;

public class DatosClienteController {

    Concesionario concesionario;

    public DatosClienteController(Concesionario concesionario){
        this.concesionario=concesionario;
    }

    public Cliente recuperarCliente (String cedula){
        return concesionario.verificarCliente (cedula);
    }
    
    public void agregarCliente(Cliente cliente){
        concesionario.agregarCliente(cliente);

    }
}
