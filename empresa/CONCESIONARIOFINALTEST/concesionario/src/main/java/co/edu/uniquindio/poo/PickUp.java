package co.edu.uniquindio.poo;

public class PickUp extends VehiculoBasico {
    private boolean traccion;
    private double capacidadCarga;

    /**
     * Constructor de la clase PickUp.
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
     * @param traccion          indica si el vehículo tiene tracción en las 4 ruedas
     * @param capacidadCarga    la capacidad de carga de la PickUp
     */
    public PickUp(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, Negocio negocio,   
            Combustion combustion, Transmision transmision, Estado estado, boolean aireAcondicionado, boolean abs,
            boolean traccion, double capacidadCarga) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numeroPasajeros, numeroPuertas,
                numeroBolsasAire, negocio, combustion, transmision, estado, aireAcondicionado, abs);
        this.traccion = traccion;
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método para obtener el valor del atributo traccion.
     * 
     * @return true si el vehículo tiene tracción en las 4 ruedas, false si no la
     *         tiene
     */
    public boolean isTraccion() {
        return traccion;
    }

    /**
     * Método para establecer el valor del atributo traccion.
     * 
     * @param traccion indica si el vehículo tiene tracción en las 4 ruedas
     */
    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }

    /**
     * Método para obtener la capacidad de carga de la PickUp.
     * 
     * @return la capacidad de carga en kilogramos
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método para establecer la capacidad de carga de la PickUp.
     * 
     * @param capacidadCarga la capacidad de carga que se desea asignar a la PickUp
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método toString para representar la clase PickUp como una cadena de texto.
     * 
     * @return la representación textual del objeto PickUp
     */
    @Override
    public String toString() {
        return "PickUp [traccion=" + traccion + ", capacidadCarga=" + capacidadCarga + "]";
    }

}
