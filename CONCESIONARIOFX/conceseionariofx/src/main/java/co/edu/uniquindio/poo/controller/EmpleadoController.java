package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;

public class EmpleadoController {
    
    Concesionario concesionario;

    public EmpleadoController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ArrayList<Cliente> obtenerListaClientes() {
        return concesionario.getClientes();
    }

    public ArrayList<Vehiculo> obtenerListaVehiculos() {
        return concesionario.getVehiculos();
    }

    public ArrayList<Transaccion> obtenerListaTransacciones() {
        return concesionario.getTransacciones();
    }

    
}
