package co.edu.uniquindio.poo;

public class Camioneta extends VehiculoEquipado {

    private boolean traccion;

    /**
     * Constructor de la clase Camioneta.
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
     * @param  traccion  
     *                 indica si el vehículo tiene tracción en las
     *                                  4 ruedas
     */
    public Camioneta(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,
            Combustion combustion, Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs,
            boolean aireAcondicionado2, double capacidadMaletero, boolean camaraReversa, double capacidadMaletero2,
            int numeroBolsasAire2, boolean sensorColicion, boolean sensorTraficoCruzado,
            boolean asitentePermanenciaCarril, boolean traccion) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs, aireAcondicionado2,
                capacidadMaletero, camaraReversa, capacidadMaletero2, numeroBolsasAire2, sensorColicion,
                sensorTraficoCruzado, asitentePermanenciaCarril);
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
