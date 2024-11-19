package co.edu.uniquindio.poo;

public abstract class VehiculoEstandar extends VehiculoBasico {
    private boolean aireAcondicionado;
    private double capacidadMaletero;

    /**
     * Constructor de la clase VehiculoEstandar.
     * 
     * @param codigo             el código del vehículo
     * @param marca              la marca del vehículo
     * @param modelo             el modelo del vehículo
     * @param nuevo              indica si el vehículo es nuevo
     * @param cambios            el número de cambios de la transmisión
     * @param velMax             la velocidad máxima del vehículo
     * @param cilindraje         el cilindraje del vehículo
     * @param numeroPasajeros    el número de pasajeros del vehículo
     * @param numeroPuertas      el número de puertas del vehículo
     * @param numeroBolsasAire   el número de bolsas de aire del vehículo
     * @param negocio            el negocio asociado al vehículo
     * @param combustion         el tipo de combustible del vehículo
     * @param transmision        el tipo de transmisión del vehículo
     * @param estado             el estado del vehículo
     * @param aireAcondicionado  indica si el vehículo tiene aire acondicionado
     * @param abs                indica si el vehículo tiene frenos ABS
     * @param aireAcondicionado2 otra propiedad de aire acondicionado
     * @param capacidadMaletero  la capacidad del maletero del vehículo
     */
    public VehiculoEstandar(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,
            Combustion combustion, Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs,
            boolean aireAcondicionado2, double capacidadMaletero) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs);
        aireAcondicionado = aireAcondicionado2;
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Método para obtener el valor del atributo aireAcondicionado.
     * 
     * @return true si el vehículo tiene aire acondicionado, false si no lo tiene
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Método para establecer el valor del atributo aireAcondicionado.
     * 
     * @param aireAcondicionado indica si el vehículo tiene aire acondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Método para obtener la capacidad del maletero del vehículo.
     * 
     * @return la capacidad del maletero en litros
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Método para establecer la capacidad del maletero del vehículo.
     * 
     * @param capacidadMaletero la capacidad que se desea asignar al maletero
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Método toString para representar la clase VehiculoEstandar como una cadena de
     * texto.
     * 
     * @return la representación textual del objeto VehiculoEstandar
     */
    @Override
    public String toString() {
        return "VehiculoEstandar [aireAcondicionado=" + aireAcondicionado + ", capacidadMaletero=" + capacidadMaletero
                + "]";
    }

}
