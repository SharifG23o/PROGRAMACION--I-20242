package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean abs;
    private int numeroEjes;
    private TipoCamion tipo;

    /**
     * Constructor de la clase Camion.
     * 
     * @param codigo            el código único del camión
     * @param marca             la marca del camión
     * @param modelo            el modelo del camión
     * @param nuevo             indica si el camión es nuevo
     * @param cambios           el número de cambios del camión
     * @param velMax            la velocidad máxima del camión
     * @param cilindraje        el cilindraje del camión
     * @param capacidadCarga    la capacidad máxima de carga del camión (en
     *                          toneladas o kilogramos)
     * @param aireAcondicionado indica si el camión tiene aire acondicionado
     * @param frenosAire        indica si el camión tiene frenos de aire
     * @param abs               indica si el camión tiene sistema de frenos ABS
     * @param numeroEjes        el número de ejes del camión
     * @param negocio           el negocio asociado al camión
     * @param tipo              el tipo de camion
     * @param combustion        combustion el tipo de combustion
     * @param transmision       transmision el tipo de transmision
     * @param estado            estado del vehiculo
     */
    public Camion(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, double capacidadCarga, boolean aireAcondicionado, boolean frenosAire, boolean abs,
            int numeroEjes, TipoCamion tipo, Combustion combustion, Transmision transmision) {
        super(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, combustion, transmision);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.tipo = tipo;
    }

    /**
     * Método para obtener la capacidad de carga del camión.
     * 
     * @return la capacidad de carga
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método para establecer la capacidad de carga del camión.
     * 
     * @param capacidadCarga la capacidad de carga
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método para verificar si el camión tiene aire acondicionado.
     * 
     * @return true si tiene aire acondicionado, false en caso contrario
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Método para establecer si el camión tiene aire acondicionado.
     * 
     * @param aireAcondicionado true si tiene aire acondicionado, false en caso
     *                          contrario
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Método para verificar si el camión tiene frenos de aire.
     * 
     * @return true si tiene frenos de aire, false en caso contrario
     */
    public boolean isFrenosAire() {
        return frenosAire;
    }

    /**
     * Método para establecer si el camión tiene frenos de aire.
     * 
     * @param frenosAire true si tiene frenos de aire, false en caso contrario
     */
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    /**
     * Método para verificar si el camión tiene sistema de frenos ABS.
     * 
     * @return true si tiene ABS, false en caso contrario
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Método para establecer si el camión tiene sistema de frenos ABS.
     * 
     * @param abs true si tiene ABS, false en caso contrario
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Método para obtener el número de ejes del camión.
     * 
     * @return el número de ejes
     */
    public int getNumeroEjes() {
        return numeroEjes;
    }

    /**
     * Método para establecer el número de ejes del camión.
     * 
     * @param numeroEjes el número de ejes
     */
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método para obtener una representación en forma de cadena de texto del
     * camión.
     * 
     * @return una cadena que representa el camión
     */

    /**
     * Método para obtener el tipo de camion.
     * 
     * @return el tipo de camion (TipoCamion)
     */
    public TipoCamion getTipo() {
        return tipo;
    }

    /**
     * Método para establecer el tipo de camion.
     * 
     * @param tipo el tipo de camion (TipoCamion) a establecer
     */
    public void setTipo(TipoCamion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + ", aireAcondicionado=" + aireAcondicionado + ", frenosAire="
                + frenosAire + ", abs=" + abs + ", numeroEjes=" + numeroEjes + "]";
    }

}
