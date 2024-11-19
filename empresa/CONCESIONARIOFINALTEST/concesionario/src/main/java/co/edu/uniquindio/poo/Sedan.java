package co.edu.uniquindio.poo;

public class Sedan extends VehiculoEquipado {

    private boolean espejosElectricos;

    /**
     * Constructor de la clase Sedan.
     * 
     * @param codigo                    el código del vehículo
     * @param marca                     la marca del vehículo
     * @param modelo                    el modelo del vehículo
     * @param nuevo                     indica si el vehículo es nuevo
     * @param cambios                   el número de cambios de la transmisión
     * @param velMax                    la velocidad máxima del vehículo
     * @param cilindraje                el cilindraje del vehículo
     * @param numeroPasajeros           el número de pasajeros del vehículo
     * @param numeroPuertas             el número de puertas del vehículo
     * @param numeroBolsasAire          el número de bolsas de aire del vehículo
     * @param negocio                   el negocio asociado al vehículo
     * @param combustion                el tipo de combustible del vehículo
     * @param transmision               el tipo de transmisión del vehículo
     * @param estado                    el estado del vehículo
     * @param aireAcondicionado         indica si el vehículo tiene aire
     *                                  acondicionado
     * @param abs                       indica si el vehículo tiene frenos ABS
     * @param aireAcondicionado2        indica si el vehículo tiene aire
     *                                  acondicionado adicional
     * @param capacidadMaletero         la capacidad del maletero del vehículo
     * @param camaraReversa             indica si el vehículo tiene cámara de
     *                                  reversa
     * @param capacidadMaletero2        la capacidad del maletero adicional
     * @param numeroBolsasAire2         el número de bolsas de aire adicional
     * @param sensorColicion            indica si el vehículo tiene sensor de
     *                                  colisión
     * @param sensorTraficoCruzado      indica si el vehículo tiene sensor de
     *                                  tráfico cruzado
     * @param asitentePermanenciaCarril indica si el vehículo tiene asistente de
     *                                  permanencia en carril
     * @param espejosElectricos         indica si el vehículo tiene espejos
     *                                  eléctricos
     */
    public Sedan(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,
            Combustion combustion, Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs,
            boolean aireAcondicionado2, double capacidadMaletero, boolean camaraReversa, double capacidadMaletero2,
            int numeroBolsasAire2, boolean sensorColicion, boolean sensorTraficoCruzado,
            boolean asitentePermanenciaCarril, boolean espejosElectricos) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs, aireAcondicionado2,
                capacidadMaletero, camaraReversa, capacidadMaletero2, numeroBolsasAire2, sensorColicion,
                sensorTraficoCruzado, asitentePermanenciaCarril);
        this.espejosElectricos = espejosElectricos;
    }

    /**
     * Método para obtener si el vehículo tiene espejos eléctricos.
     * 
     * @return true si el vehículo tiene espejos eléctricos, false en caso contrario
     */
    public boolean getEspejosElectricos() {
        return espejosElectricos;
    }

    /**
     * Método para establecer si el vehículo tiene espejos eléctricos.
     * 
     * @param espejosElectricos true si el vehículo tiene espejos eléctricos, false
     *                          en caso contrario
     */
    public void setEspejosElectricos(boolean espejosElectricos) {
        this.espejosElectricos = espejosElectricos;
    }

    /**
     * Método toString para representar la clase Sedan como una cadena de texto.
     * 
     * @return la representación textual del objeto Sedan
     */
    @Override
    public String toString() {
        return "Sedan [espejosElectricos=" + espejosElectricos + "]";
    }

}
