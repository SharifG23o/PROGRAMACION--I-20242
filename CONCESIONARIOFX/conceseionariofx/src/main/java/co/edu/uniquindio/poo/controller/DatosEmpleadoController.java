package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vendedor;

public class DatosEmpleadoController {
    
    Concesionario concesionario;

    public DatosEmpleadoController(Concesionario concesionario){
        this.concesionario=concesionario;
    }

    public void agregarVendedor(Vendedor Vendedor){
        concesionario.agregarVendedor(Vendedor);
    }
    
    public Vendedor recuperarVendedor(String cedula, String codigo){
        return concesionario.verificarVendedor(cedula, codigo);
    }

}
