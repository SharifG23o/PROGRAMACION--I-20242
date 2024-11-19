package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo {

    private double autonomia;
    private double tiempoCarga;

    /**
     * Constructor de la clase VehiculoElectrico.
     * 
     * @param codigo      el código único del vehículo eléctrico
     * @param marca       la marca del vehículo eléctrico
     * @param modelo      el modelo del vehículo eléctrico
     * @param nuevo       indica si el vehículo es nuevo
     * @param cambios     el número de cambios del vehículo
     * @param velMax      la velocidad máxima del vehículo
     * @param cilindraje  el cilindraje del vehículo (puede ser 0 para vehículos
     *                    eléctricos)
     * @param negocio     el negocio asociado al vehículo
     * @param autonomia   la autonomía del vehículo eléctrico (en kilómetros)
     * @param tiempoCarga el tiempo de carga completa del vehículo eléctrico (en
     *                    horas)
     * @param combustion  combustion el tipo de combustion
     * @param transmision transmision el tipo de transmision
     * @param estado      estado del vehiculo
     */
    public VehiculoElectrico(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, Negocio negocio, double autonomia, double tiempoCarga, Combustion combustion,
            Transmision transmision, Estado estado) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, negocio, combustion, transmision, estado);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    /**
     * Método para obtener la autonomía del vehículo eléctrico.
     * 
     * @return la autonomía en kilómetros
     */
    public double getAutonomia() {
        return autonomia;
    }

    /**
     * Método para establecer la autonomía del vehículo eléctrico.
     * 
     * @param autonomia la autonomía en kilómetros
     */
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * Método para obtener el tiempo de carga del vehículo eléctrico.
     * 
     * @return el tiempo de carga en horas
     */
    public double getTiempoCarga() {
        return tiempoCarga;
    }

    /**
     * Método para establecer el tiempo de carga del vehículo eléctrico.
     * 
     * @param tiempoCarga el tiempo de carga en horas
     */
    public void setTiempoCarga(double tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    /**
     * Método para obtener una representación en forma de cadena de texto del
     * vehículo eléctrico.
     * 
     * @return una cadena que representa el vehículo eléctrico
     */
    @Override
    public String toString() {
        return "VehiculoElectrico [autonomia=" + autonomia + ", tiempoCarga=" + tiempoCarga + "]";
    }

}
