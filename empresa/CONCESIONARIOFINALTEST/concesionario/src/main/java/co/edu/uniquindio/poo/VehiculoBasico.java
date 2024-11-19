package co.edu.uniquindio.poo;

public abstract class VehiculoBasico extends VehiculoPasajero {
    private boolean aireAcondicionado;
    private boolean abs;

    /**
     * Constructor de la clase VehiculoBasico.
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
     * @param abs               indica si el vehículo tiene sistema de frenos ABS
     */
    public VehiculoBasico(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,
            Combustion combustion, Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado);
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
    }

    /**
     * Método para obtener el valor del atributo aireAcondicionado.
     * 
     * @return true si el vehículo tiene aire acondicionado, false en caso contrario
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Método para establecer el valor del atributo aireAcondicionado.
     * 
     * @param aireAcondicionado indica si el vehículo tendrá aire acondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Método para obtener el valor del atributo abs.
     * 
     * @return true si el vehículo tiene sistema de frenos ABS, false en caso
     *         contrario
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Método para establecer el valor del atributo abs.
     * 
     * @param abs indica si el vehículo tendrá frenos ABS
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Método toString para representar la clase VehiculoBasico como una cadena de
     * texto.
     * 
     * @return la representación textual del objeto VehiculoBasico
     */
    @Override
    public String toString() {
        return "VehiculoBasico aireAcondicionado=" + aireAcondicionado + ", abs=" + abs + "]";
    }

}
