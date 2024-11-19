package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;

public class ClienteController {
    Concesionario concesionario;

    public ClienteController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ArrayList<Vehiculo> obtenerListaVehiculos() {
        return concesionario.getVehiculos();
    }
}
