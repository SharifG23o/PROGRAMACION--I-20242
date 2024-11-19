package co.edu.uniquindio.poo;

public abstract class VehiculoPasajero extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;

    
        /**
 * Constructor de la clase VehiculoPasajero.
 * 
 * @param codigo           el código único del vehículo de pasajeros
 * @param marca            la marca del vehículo de pasajeros
 * @param modelo           el modelo del vehículo de pasajeros
 * @param nuevo            indica si el vehículo es nuevo
 * @param cambios          el número de cambios del vehículo
 * @param velMax           la velocidad máxima del vehículo
 * @param cilindraje       el cilindraje del vehículo de pasajeros
 * @param numeroPasajeros  el número de pasajeros que el vehículo puede transportar
 * @param numeroPuertas    el número de puertas del vehículo
 * @param numeroBolsasAire el número de bolsas de aire del vehículo
 * @param negocio          el negocio asociado al vehículo
 * @param combustion  combustion el tipo de combustion
 * @param transmision transmision el tipo de transmision
 * @param estado      estado del vehiculo
 */
public VehiculoPasajero(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio, Combustion combustion, Transmision transmision, Estado estado) {
super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, negocio, combustion, transmision, estado);
this.numeroPasajeros = numeroPasajeros;
this.numeroPuertas = numeroPuertas;
this.numeroBolsasAire = numeroBolsasAire;
}

/**
* Método para obtener el número de pasajeros que el vehículo de pasajeros puede transportar.
* 
* @return el número de pasajeros
*/
public int getNumeroPasajeros() {
return numeroPasajeros;
}

/**
* Método para establecer el número de pasajeros que el vehículo de pasajeros puede transportar.
* 
* @param numeroPasajeros el número de pasajeros
*/
public void setNumeroPasajeros(int numeroPasajeros) {
this.numeroPasajeros = numeroPasajeros;
}

/**
* Método para obtener el número de puertas del vehículo de pasajeros.
* 
* @return el número de puertas
*/
public int getNumeroPuertas() {
return numeroPuertas;
}

/**
* Método para establecer el número de puertas del vehículo de pasajeros.
* 
* @param numeroPuertas el número de puertas
*/
public void setNumeroPuertas(int numeroPuertas) {
this.numeroPuertas = numeroPuertas;
}

/**
* Método para obtener el número de bolsas de aire del vehículo de pasajeros.
* 
* @return el número de bolsas de aire
*/
public int getNumeroBolsasAire() {
return numeroBolsasAire;
}

/**
* Método para establecer el número de bolsas de aire del vehículo de pasajeros.
* 
* @param numeroBolsasAire el número de bolsas de aire
*/
public void setNumeroBolsasAire(int numeroBolsasAire) {
this.numeroBolsasAire = numeroBolsasAire;
}

/**
* Método para obtener una representación en forma de cadena de texto del vehículo de pasajeros.
* 
* @return una cadena que representa el vehículo de pasajeros
*/
@Override
public String toString() {
return "VehiculoPasajero [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
    + ", numeroBolsasAire=" + numeroBolsasAire + "]";
}



}
