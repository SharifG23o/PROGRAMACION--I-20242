package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vehiculo;

public class VentaClienteController {
    Concesionario concesionario;

    public VentaClienteController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public void agregarVehiculoVenta(Vehiculo vehiculo) {
        concesionario.agregarVehiculo(vehiculo);
    }

    public Vehiculo verificarVehiculo(String codigo) {
        return concesionario.verificarVehiculo(codigo);
    }
}
