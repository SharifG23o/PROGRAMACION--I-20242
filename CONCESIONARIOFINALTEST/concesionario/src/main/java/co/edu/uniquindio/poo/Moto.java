package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    
    private boolean defensas ;

    /**
 * Constructor de la clase Moto.
 * 
 * @param codigo     el código único de la moto
 * @param marca      la marca de la moto
 * @param modelo     el modelo de la moto
 * @param nuevo      indica si la moto es nueva
 * @param cambios    el número de cambios de la moto
 * @param velMax     la velocidad máxima de la moto
 * @param cilindraje el cilindraje de la moto
 * @param defensas   indica si la moto tiene defensas
 * @param negocio    el negocio asociado a la moto
 * @param combustion  combustion el tipo de combustion
 * @param transmision transmision el tipo de transmision
 * @param estado      estado del vehiculo
 */
public Moto(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
double cilindraje, boolean defensas, Negocio negocio, Combustion combustion, Transmision transmision, Estado estado) {
super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, negocio, combustion, transmision, estado);
this.defensas = defensas;
}

/**
* Método para obtener si la moto tiene defensas.
* 
* @return verdadero si la moto tiene defensas, falso de lo contrario
*/
public boolean isDefensas() {
return defensas;
}

/**
* Método para establecer si la moto tiene defensas.
* 
* @param defensas verdadero si la moto tiene defensas, falso de lo contrario
*/
public void setDefensas(boolean defensas) {
this.defensas = defensas;
}

/**
* Método para obtener una representación en forma de cadena de texto de la moto.
* 
* @return una cadena que representa la moto
*/
@Override
public String toString() {
return "Moto [defensas=" + defensas + "]";
}



    
    
}
