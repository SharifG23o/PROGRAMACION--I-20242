package co.edu.uniquindio.poo;

public class Bus extends VehiculoEstandar {
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    /**
     * Constructor de la clase Bus.
     * 
     * @param codigo                  el código del vehículo
     * @param marca                   la marca del vehículo
     * @param modelo                  el modelo del vehículo
     * @param nuevo                   indica si el vehículo es nuevo
     * @param cambios                 el número de cambios de la transmisión
     * @param velMax                  la velocidad máxima del vehículo
     * @param cilindraje              el cilindraje del vehículo
     * @param numeroPasajeros         el número de pasajeros del vehículo
     * @param numeroPuertas           el número de puertas del vehículo
     * @param numeroBolsasAire        el número de bolsas de aire del vehículo
     * @param negocio                 el negocio asociado al vehículo
     * @param combustion              el tipo de combustible del vehículo
     * @param transmision             el tipo de transmisión del vehículo
     * @param estado                  el estado del vehículo
     * @param aireAcondicionado       indica si el vehículo tiene aire acondicionado
     * @param abs                     indica si el vehículo tiene frenos ABS
     * @param aireAcondicionado2      indica si el vehículo tiene aire acondicionado
     *                                adicional
     * @param capacidadMaletero       la capacidad del maletero del vehículo
     * @param numeroEjes              el número de ejes del bus
     * @param numeroSalidasEmergencia el número de salidas de emergencia del bus
     */
    public Bus(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax, double cilindraje,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio, Combustion combustion,
            Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs, boolean aireAcondicionado2,
            double capacidadMaletero, int numeroEjes, int numeroSalidasEmergencia) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs, aireAcondicionado2,
                capacidadMaletero);
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
