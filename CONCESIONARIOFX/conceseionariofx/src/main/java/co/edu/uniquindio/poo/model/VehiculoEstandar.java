package co.edu.uniquindio.poo.model;

public abstract class VehiculoEstandar extends VehiculoBasico {
    private boolean velocidadCrucero;
    private double capacidadMaletero;

    /**
     * Construye un nuevo objeto VehiculoEstandar con los atributos especificados.
     *
     * @param codigo            el código único que identifica el vehículo
     * @param marca             la marca del vehículo
     * @param modelo            el modelo del vehículo
     * @param nuevo             indica si el vehículo es nuevo o usado
     * @param cambios           el número de cambios (marchas) del vehículo
     * @param velMax            la velocidad máxima del vehículo
     * @param cilindraje        el cilindraje del motor del vehículo
     * @param numeroPasajeros   el número máximo de pasajeros que puede transportar
     *                          el vehículo
     * @param numeroPuertas     el número de puertas del vehículo
     * @param numeroBolsasAire  el número de bolsas de aire que posee el vehículo
     * @param combustion        el tipo de sistema de combustión del vehículo
     * @param transmision       el tipo de transmisión del vehículo
     * @param aireAcondicionado indica si el vehículo tiene aire acondicionado
     * @param abs               indica si el vehículo tiene frenos ABS
     * @param velocidadCrucero  indica si el vehículo tiene control de velocidad
     *                          crucero
     * @param capacidadMaletero la capacidad del maletero en litros
     */
    public VehiculoEstandar(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Combustion combustion,
            Transmision transmision, boolean aireAcondicionado, boolean abs, boolean velocidadCrucero,
            double capacidadMaletero) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, combustion, transmision, aireAcondicionado, abs);
        this.velocidadCrucero = velocidadCrucero;
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Método para obtener el estado de la velocidad crucero del vehículo.
     * 
     * @return {@code true} si el vehículo tiene velocidad crucero, {@code false} en
     *         caso contrario.
     */
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    /**
     * Método para establecer el estado de la velocidad crucero del vehículo.
     * 
     * @param velocidadCrucero {@code true} para activar la velocidad crucero,
     *                         {@code false} para desactivarla.
     */
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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
}
