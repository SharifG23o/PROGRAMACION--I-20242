package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Combustion;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Estado;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Vehiculo;

public class DatosVehiculoController {
 
Concesionario concesionario;
Combustion combustion;
Transmision transmision;
Estado estado;
TipoCamion tipoCamion;

    public DatosVehiculoController (Concesionario concesionario){
        this.concesionario=concesionario;

    }

    public void agregarVehiculo (Vehiculo vehiculo){
        concesionario.agregarVehiculo(vehiculo);
    }
    public Vehiculo verificarVehiculo(String codigo){
        return concesionario.verificarVehiculo(codigo);
    }
    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public void setCombustion(Combustion combustion) {
        this.combustion = combustion;
    }

    public Combustion getCombustion() {
        return combustion;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
