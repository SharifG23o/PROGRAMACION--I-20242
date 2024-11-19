package co.edu.uniquindio.poo.model;

public class VehiculoEquipado extends VehiculoEstandar {
    private boolean camaraReversa;
    private boolean sensorColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    /**
     * Constructor para crear un objeto VehiculoEquipado con características
     * avanzadas.
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
     */
    public VehiculoEquipado(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Combustion combustion,
            Transmision transmision, boolean aireAcondicionado, boolean abs, boolean velocidadCrucero,
            double capacidadMaletero, boolean camaraReversa, boolean sensorColision, boolean sensorTraficoCruzado,
            boolean asistentePermanenciaCarril) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero, capacidadMaletero);
        this.camaraReversa = camaraReversa;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    /**
     * Método para obtener el estado de la cámara de reversa del vehículo.
     * 
     * @return {@code true} si el vehículo tiene cámara de reversa, {@code false} en
     *         caso contrario.
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Método para establecer el estado de la cámara de reversa del vehículo.
     * 
     * @param camaraReversa {@code true} para activar, {@code false} para
     *                      desactivar.
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /**
     * Método para obtener el estado del sensor de colisión del vehículo.
     * 
     * @return {@code true} si el vehículo tiene sensor de colisión, {@code false}
     *         en caso contrario.
     */
    public boolean isSensorColision() {
        return sensorColision;
    }

    /**
     * Método para establecer el estado del sensor de colisión del vehículo.
     * 
     * @param sensorColision {@code true} para activar, {@code false} para
     *                       desactivar.
     */
    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    /**
     * Método para obtener el estado del sensor de tráfico cruzado del vehículo.
     * 
     * @return {@code true} si el vehículo tiene sensor de tráfico cruzado,
     *         {@code false} en caso contrario.
     */
    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    /**
     * Método para establecer el estado del sensor de tráfico cruzado del vehículo.
     * 
     * @param sensorTraficoCruzado {@code true} para activar, {@code false} para
     *                             desactivar.
     */
    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    /**
     * Método para obtener el estado del asistente de permanencia en el carril del
     * vehículo.
     * 
     * @return {@code true} si el vehículo tiene asistente de permanencia en el
     *         carril, {@code false} en caso contrario.
     */
    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    /**
     * Método para establecer el estado del asistente de permanencia en el carril
     * del vehículo.
     * 
     * @param asistentePermanenciaCarril {@code true} para activar, {@code false}
     *                                   para desactivar.
     */
    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

}
