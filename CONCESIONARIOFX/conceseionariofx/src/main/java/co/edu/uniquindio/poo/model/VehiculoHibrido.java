package co.edu.uniquindio.poo.model;

public class VehiculoHibrido extends Vehiculo{
   
    private boolean enchufable;
    private boolean ligero;


    
/**
 * Constructor de la clase VehiculoHibrido.
 * 
 * @param codigo      el código único del vehículo híbrido
 * @param marca       la marca del vehículo híbrido
 * @param modelo      el modelo del vehículo híbrido
 * @param nuevo       indica si el vehículo es nuevo
 * @param cambios     el número de cambios del vehículo
 * @param velMax      la velocidad máxima del vehículo
 * @param cilindraje  el cilindraje del vehículo híbrido
 * @param enchufable  indica si el vehículo híbrido es enchufable
 * @param ligero      indica si el vehículo híbrido es de tipo ligero
 * @param negocio     el negocio asociado al vehículo
 * @param combustion  combustion el tipo de combustion
 * @param transmision transmision el tipo de transmision
 * @param estado      estado del vehiculo
 */
public VehiculoHibrido(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
double cilindraje, boolean enchufable, boolean ligero, Combustion combustion, Transmision transmision) {
super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, combustion, transmision);
this.enchufable = enchufable;
this.ligero = ligero;
}

/**
* Método para obtener si el vehículo híbrido es enchufable.
* 
* @return true si el vehículo es enchufable, false en caso contrario
*/
public boolean Enchufable() {
return enchufable;
}

/**
* Método para establecer si el vehículo híbrido es enchufable.
* 
* @param enchufable true si el vehículo será enchufable, false en caso contrario
*/
public void setEnchufable(boolean enchufable) {
this.enchufable = enchufable;
}

/**
* Método para obtener si el vehículo híbrido es ligero.
* 
* @return true si el vehículo es ligero, false en caso contrario
*/
public boolean Ligero() {
return ligero;
}

/**
* Método para establecer si el vehículo híbrido es ligero.
* 
* @param ligero true si el vehículo será ligero, false en caso contrario
*/
public void setLigero(boolean ligero) {
this.ligero = ligero;
}

/**
* Método para obtener una representación en forma de cadena de texto del vehículo híbrido.
* 
* @return una cadena que representa el vehículo híbrido
*/
@Override
public String toString() {
return "VehiculoHibrido [enchufable=" + enchufable + ", ligero=" + ligero + "]";
}


    
}
