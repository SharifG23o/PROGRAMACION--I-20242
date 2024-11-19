package co.edu.uniquindio.poo;

public class VehiculoEquipado extends VehiculoEstandar {
    private boolean camaraReversa;
    private double capacidadMaletero;
    private int numeroBolsasAire;
    private boolean sensorColicion;
    private boolean sensorTraficoCruzado;
    private boolean asitentePermanenciaCarril;


    /**
 * Constructor de la clase VehiculoEquipado.
 * 
 * @param codigo el código del vehículo
 * @param marca la marca del vehículo
 * @param modelo el modelo del vehículo
 * @param nuevo indica si el vehículo es nuevo
 * @param cambios el número de cambios de la transmisión
 * @param velMax la velocidad máxima del vehículo
 * @param cilindraje el cilindraje del vehículo
 * @param numeroPasajeros el número de pasajeros del vehículo
 * @param numeroPuertas el número de puertas del vehículo
 * @param numeroBolsasAire el número de bolsas de aire del vehículo
 * @param negocio el negocio asociado al vehículo
 * @param combustion el tipo de combustible del vehículo
 * @param transmision el tipo de transmisión del vehículo
 * @param estado el estado del vehículo
 * @param aireAcondicionado indica si el vehículo tiene aire acondicionado
 * @param abs indica si el vehículo tiene frenos ABS
 * @param aireAcondicionado2 indica si el vehículo tiene aire acondicionado adicional
 * @param capacidadMaletero la capacidad del maletero del vehículo
 * @param camaraReversa indica si el vehículo tiene cámara de reversa
 * @param capacidadMaletero2 la capacidad del maletero adicional
 * @param numeroBolsasAire2 el número de bolsas de aire adicional
 * @param sensorColicion indica si el vehículo tiene sensor de colisión
 * @param sensorTraficoCruzado indica si el vehículo tiene sensor de tráfico cruzado
 * @param asitentePermanenciaCarril indica si el vehículo tiene asistente de permanencia en carril
 */
public VehiculoEquipado(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,
Combustion combustion, Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs,
boolean aireAcondicionado2, double capacidadMaletero, boolean camaraReversa, double capacidadMaletero2,
int numeroBolsasAire2, boolean sensorColicion, boolean sensorTraficoCruzado,
boolean asitentePermanenciaCarril) {
super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
    numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs, aireAcondicionado2,
    capacidadMaletero);
this.camaraReversa = camaraReversa;
capacidadMaletero = capacidadMaletero2;
numeroBolsasAire = numeroBolsasAire2;
this.sensorColicion = sensorColicion;
this.sensorTraficoCruzado = sensorTraficoCruzado;
this.asitentePermanenciaCarril = asitentePermanenciaCarril;
}

/**
* Método para obtener si el vehículo tiene cámara de reversa.
* 
* @return true si el vehículo tiene cámara de reversa, false en caso contrario
*/
public boolean getCamaraReversa() {
return camaraReversa;
}

/**
* Método para establecer si el vehículo tiene cámara de reversa.
* 
* @param camaraReversa true si el vehículo tiene cámara de reversa, false en caso contrario
*/
public void setCamaraReversa(boolean camaraReversa) {
this.camaraReversa = camaraReversa;
}

/**
* Método para obtener la capacidad del maletero del vehículo.
* 
* @return la capacidad del maletero del vehículo
*/
public double getCapacidadMaletero() {
return capacidadMaletero;
}

/**
* Método para establecer la capacidad del maletero del vehículo.
* 
* @param capacidadMaletero la nueva capacidad del maletero del vehículo
*/
public void setCapacidadMaletero(double capacidadMaletero) {
this.capacidadMaletero = capacidadMaletero;
}

/**
* Método para obtener el número de bolsas de aire del vehículo.
* 
* @return el número de bolsas de aire del vehículo
*/
public int getNumeroBolsasAire() {
return numeroBolsasAire;
}

/**
* Método para establecer el número de bolsas de aire del vehículo.
* 
* @param numeroBolsasAire el nuevo número de bolsas de aire del vehículo
*/
public void setNumeroBolsasAire(int numeroBolsasAire) {
this.numeroBolsasAire = numeroBolsasAire;
}

/**
* Método para obtener si el vehículo tiene sensor de colisión.
* 
* @return true si el vehículo tiene sensor de colisión, false en caso contrario
*/
public boolean getSensorColicion() {
return sensorColicion;
}

/**
* Método para establecer si el vehículo tiene sensor de colisión.
* 
* @param sensorColicion true si el vehículo tiene sensor de colisión, false en caso contrario
*/
public void setSensorColicion(boolean sensorColicion) {
this.sensorColicion = sensorColicion;
}

/**
* Método para obtener si el vehículo tiene sensor de tráfico cruzado.
* 
* @return true si el vehículo tiene sensor de tráfico cruzado, false en caso contrario
*/
public boolean getSensorTraficoCruzado() {
return sensorTraficoCruzado;
}

/**
* Método para establecer si el vehículo tiene sensor de tráfico cruzado.
* 
* @param sensorTraficoCruzado true si el vehículo tiene sensor de tráfico cruzado, false en caso contrario
*/
public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
this.sensorTraficoCruzado = sensorTraficoCruzado;
}

/**
* Método para obtener si el vehículo tiene asistente de permanencia en carril.
* 
* @return true si el vehículo tiene asistente de permanencia en carril, false en caso contrario
*/
public boolean getAsitentePermanenciaCarril() {
return asitentePermanenciaCarril;
}

/**
* Método para establecer si el vehículo tiene asistente de permanencia en carril.
* 
* @param asitentePermanenciaCarril true si el vehículo tiene asistente de permanencia en carril, false en caso contrario
*/
public void setAsitentePermanenciaCarril(boolean asitentePermanenciaCarril) {
this.asitentePermanenciaCarril = asitentePermanenciaCarril;
}

/**
* Método toString para representar la clase VehiculoEquipado como una cadena de texto.
* 
* @return la representación textual del objeto VehiculoEquipado
*/
@Override
public String toString() {
return "VehiculoEquipado [camaraReversa=" + camaraReversa + ", capacidadMaletero=" + capacidadMaletero
    + ", numeroBolsasAire=" + numeroBolsasAire + ", sensorColicion=" + sensorColicion
    + ", sensorTraficoCruzado=" + sensorTraficoCruzado + ", asitentePermanenciaCarril="
    + asitentePermanenciaCarril + "]";
}



}
