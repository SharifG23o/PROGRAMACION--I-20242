package co.edu.uniquindio.poo.model;

public class Camioneta extends VehiculoEquipado {

    private boolean traccion;

    /**
     * Constructor para crear un objeto Camioneta con las características
     * específicas de una camioneta.
     * 
     * @param codigo                     el código único del vehículo
     * @param marca                      la marca del vehículo
     * @param modelo                     el modelo del vehículo
     * @param nuevo                      indica si el vehículo es nuevo o usado
     * @param cambios                    el número de cambios (marchas) del vehículo
     * @param velMax                     la velocidad máxima del vehículo
     * @param cilindraje                 el cilindraje del motor del vehículo
     * @param numeroPasajeros            el número máximo de pasajeros del vehículo
     * @param numeroPuertas              el número de puertas del vehículo
     * @param numeroBolsasAire           el número de bolsas de aire que tiene el
     *                                   vehículo
     * @param combustion                 el tipo de sistema de combustión del
     *                                   vehículo
     * @param transmision                el tipo de transmisión del vehículo
     * @param aireAcondicionado          indica si el vehículo tiene aire
     *                                   acondicionado
     * @param abs                        indica si el vehículo tiene frenos ABS
     * @param velocidadCrucero           indica si el vehículo tiene velocidad
     *                                   crucero
     * @param capacidadMaletero          la capacidad del maletero en litros
     * @param camaraReversa              indica si el vehículo tiene cámara de
     *                                   reversa
     * @param sensorColision             indica si el vehículo tiene sensor de
     *                                   colisión
     * @param sensorTraficoCruzado       indica si el vehículo tiene sensor de
     *                                   tráfico cruzado
     * @param asistentePermanenciaCarril indica si el vehículo tiene asistente de
     *                                   permanencia en el carril
     * @param traccion                   indica si el vehículo tiene tracción (4x4 o
     *                                   tracción en las cuatro ruedas)
     */
    public Camioneta(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Combustion combustion,
            Transmision transmision, boolean aireAcondicionado, boolean abs, boolean velocidadCrucero,
            double capacidadMaletero, boolean camaraReversa, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaCarril, boolean traccion) {

        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero, capacidadMaletero,
                camaraReversa, sensorColision, sensorTraficoCruzado, asistentePermanenciaCarril);

        this.traccion = traccion;
    }

    /**
     * Método para obtener si la camioneta tiene tracción en las 4 ruedas.
     * 
     * @return true si la camioneta tiene tracción en las 4 ruedas, false en caso
     *         contrario
     */
    public boolean getTraccion() {
        return traccion;
    }

    /**
     * Método para establecer si la camioneta tiene tracción en las 4 ruedas.
     * 
     * @param traccion true si la camioneta tiene tracción en las 4 ruedas, false en
     *                 caso contrario
     */
    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }

    /**
     * Método toString para representar la clase Camioneta como una cadena de texto.
     * 
     * @return la representación textual del objeto Camioneta
     */
    @Override
    public String toString() {
        return "Camioneta [traccion=" + traccion + "]";
    }

}
