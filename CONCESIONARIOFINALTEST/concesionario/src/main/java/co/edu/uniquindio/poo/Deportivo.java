package co.edu.uniquindio.poo;

public class Deportivo extends VehiculoPasajero {
    private int caballosFuerza;
    private double tiempoCeroCien;

    /**
     * Constructor de la clase Deportivo.
     * 
     * @param codigo           el código del vehículo
     * @param marca            la marca del vehículo
     * @param modelo           el modelo del vehículo
     * @param nuevo            indica si el vehículo es nuevo
     * @param cambios          el número de cambios de la transmisión
     * @param velMax           la velocidad máxima del vehículo
     * @param cilindraje       el cilindraje del vehículo
     * @param numeroPasajeros  el número de pasajeros del vehículo
     * @param numeroPuertas    el número de puertas del vehículo
     * @param numeroBolsasAire el número de bolsas de aire del vehículo
     * @param negocio          el negocio asociado al vehículo
     * @param combustion       el tipo de combustible del vehículo
     * @param transmision      el tipo de transmisión del vehículo
     * @param estado           el estado del vehículo
     * @param caballosFuerza   la cantidad de caballos de fuerza del vehículo
     * @param tiempoCeroCien   el tiempo que tarda el vehículo en acelerar de 0 a
     *                         100 km/h
     */
    public Deportivo(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,
            Combustion combustion, Transmision transmision, Estado estado, int caballosFuerza, double tiempoCeroCien) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado);
        this.caballosFuerza = caballosFuerza;
        this.tiempoCeroCien = tiempoCeroCien;
    }

    /**
     * Método para obtener el valor del atributo caballosFuerza.
     * 
     * @return la cantidad de caballos de fuerza del vehículo
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * Método para establecer el valor del atributo caballosFuerza.
     * 
     * @param caballosFuerza la cantidad de caballos de fuerza que tendrá el
     *                       vehículo
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * Método para obtener el valor del atributo tiempoCeroCien.
     * 
     * @return el tiempo que tarda el vehículo en acelerar de 0 a 100 km/h
     */
    public double getTiempoCeroCien() {
        return tiempoCeroCien;
    }

    /**
     * Método para establecer el valor del atributo tiempoCeroCien.
     * 
     * @param tiempoCeroCien el tiempo que se desea asignar al vehículo para
     *                       acelerar de 0 a 100 km/h
     */
    public void setTiempoCeroCien(double tiempoCeroCien) {
        this.tiempoCeroCien = tiempoCeroCien;
    }

    /**
     * Método toString para representar la clase Deportivo como una cadena de texto.
     * 
     * @return la representación textual del objeto Deportivo
     */
    @Override
    public String toString() {
        return "Deportivo [caballosFuerza=" + caballosFuerza + ", tiempoCeroCien=" + tiempoCeroCien + "]";
    }

}
