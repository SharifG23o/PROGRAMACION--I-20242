package co.edu.uniquindio.poo;

public class Van extends VehiculoBasico {
    private boolean camaraReversa;
    private double capacidadMaletero;

    /**
     * Constructor de la clase Van.
     * 
     * @param codigo            el código del vehículo
     * @param marca             la marca del vehículo
     * @param modelo            el modelo del vehículo
     * @param nuevo             indica si el vehículo es nuevo
     * @param cambios           el número de cambios de la transmisión
     * @param velMax            la velocidad máxima del vehículo
     * @param cilindraje        el cilindraje del vehículo
     * @param numeroPasajeros   el número de pasajeros del vehículo
     * @param numeroPuertas     el número de puertas del vehículo
     * @param numeroBolsasAire  el número de bolsas de aire del vehículo
     * @param negocio           el negocio asociado al vehículo
     * @param combustion        el tipo de combustible del vehículo
     * @param transmision       el tipo de transmisión del vehículo
     * @param estado            el estado del vehículo
     * @param aireAcondicionado indica si el vehículo tiene aire acondicionado
     * @param abs               indica si el vehículo tiene frenos ABS
     * @param camaraReversa     indica si el vehículo tiene cámara de reversa
     * @param capacidadMaletero la capacidad del maletero del vehículo
     */
    public Van(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax, double cilindraje,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio, Combustion combustion,
            Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs, boolean camaraReversa,
            double capacidadMaletero) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs);
        this.camaraReversa = camaraReversa;
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Método para obtener el valor del atributo camaraReversa.
     * 
     * @return true si el vehículo tiene cámara de reversa, false si no la tiene
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Método para establecer el valor del atributo camaraReversa.
     * 
     * @param camaraReversa indica si el vehículo tiene cámara de reversa
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /**
     * Método para obtener la capacidad del maletero de la Van.
     * 
     * @return la capacidad del maletero en litros
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Método para establecer la capacidad del maletero de la Van.
     * 
     * @param capacidadMaletero la capacidad que se desea asignar al maletero de la
     *                          Van
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Método toString para representar la clase Van como una cadena de texto.
     * 
     * @return la representación textual del objeto Van
     */
    @Override
    public String toString() {
        return "Van [camaraReversa=" + camaraReversa + ", capacidadMaletero=" + capacidadMaletero + "]";
    }

}
