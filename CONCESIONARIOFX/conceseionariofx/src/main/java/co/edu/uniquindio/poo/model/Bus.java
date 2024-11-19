package co.edu.uniquindio.poo.model;

public class Bus extends VehiculoEstandar {
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    /**
     * Constructor para crear un objeto Bus con las características específicas de
     * un autobús.
     * 
     * @param codigo                  el código único del vehículo
     * @param marca                   la marca del vehículo
     * @param modelo                  el modelo del vehículo
     * @param nuevo                   indica si el vehículo es nuevo o usado
     * @param cambios                 el número de cambios (marchas) del vehículo
     * @param velMax                  la velocidad máxima del vehículo
     * @param cilindraje              el cilindraje del motor del vehículo
     * @param numeroPasajeros         el número máximo de pasajeros del vehículo
     * @param numeroPuertas           el número de puertas del vehículo
     * @param numeroBolsasAire        el número de bolsas de aire que tiene el
     *                                vehículo
     * @param combustion              el tipo de sistema de combustión del vehículo
     * @param transmision             el tipo de transmisión del vehículo
     * @param aireAcondicionado       indica si el vehículo tiene aire acondicionado
     * @param abs                     indica si el vehículo tiene frenos ABS
     * @param velocidadCrucero        indica si el vehículo tiene velocidad crucero
     * @param capacidadMaletero       la capacidad del maletero en litros
     * @param numeroEjes              el número de ejes del autobús
     * @param numeroSalidasEmergencia el número de salidas de emergencia del autobús
     */
    public Bus(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax, double cilindraje,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Combustion combustion,
            Transmision transmision, boolean aireAcondicionado, boolean abs, boolean velocidadCrucero,
            double capacidadMaletero, int numeroEjes, int numeroSalidasEmergencia) {

        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero, capacidadMaletero);

        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Método para obtener el número de ejes del bus.
     * 
     * @return el número de ejes del bus
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Método para establecer el número de ejes del bus.
     * 
     * @param numeroEjes el número de ejes que se desea asignar al bus
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método para obtener el número de salidas de emergencia del bus.
     * 
     * @return el número de salidas de emergencia del bus
     */
    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    /**
     * Método para establecer el número de salidas de emergencia del bus.
     * 
     * @param numeroSalidasEmergencia el número de salidas de emergencia que se
     *                                desea asignar al bus
     */
    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Método toString para representar la clase Bus como una cadena de texto.
     * 
     * @return la representación textual del objeto Bus
     */
    @Override
    public String toString() {
        return "Bus [numeroEjes=" + numeroEjes + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]";
    }

}
