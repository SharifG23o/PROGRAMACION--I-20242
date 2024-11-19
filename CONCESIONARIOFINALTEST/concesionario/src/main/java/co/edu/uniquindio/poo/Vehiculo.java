package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private String codigo;
    private String marca;
    private String modelo;
    private boolean nuevo;
    private int cambios;
    private double velMax;
    private double cilindraje;
    private Negocio negocio;
    private Combustion combustion;
    private Transmision transmision;
    private Estado estado;

    /*
     * Constructor de la clase Vehiculo
     * 
     * @param codigo el código del vehículo
     * 
     * @param marca la marca del vehículo
     * 
     * @param modelo el modelo del vehículo
     * 
     * @param nuevo indica si el vehículo es nuevo
     * 
     * @param cambios el número de cambios del vehículo
     * 
     * @param velMaz la velocidad máxima del vehículo
     * 
     * @param cilindraje el cilindraje del vehículo
     * 
     * @param combustion el tipo de combustion
     * 
     * @param transmision el tipo de transmision
     * 
     * @param estado estado del vehiculo
     */

    public Vehiculo(String codigo, String marca, String modelo, boolean nuevo, int cambios, double velMax,
            double cilindraje, Negocio negocio, Combustion combustion, Transmision transmision, Estado estado) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.cambios = cambios;
        this.velMax = velMax;
        this.cilindraje = cilindraje;
        this.negocio = negocio;
        this.combustion = combustion;
        this.transmision = transmision;
        this.estado = estado;

    }

    /**
     * Método para obtener el código del vehículo
     * 
     * @return el código
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método para establecer el código del vehículo
     * 
     * @param codigo el código
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la marca del vehículo
     * 
     * @return la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer la marca del vehículo
     * 
     * @param marca la marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el modelo del vehículo
     * 
     * @return el modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo del vehículo
     * 
     * @param modelo el modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener si el vehículo es nuevo
     * 
     * @return true si el vehículo es nuevo, false en caso contrario
     */
    public boolean getNuevo() {
        return nuevo;
    }

    /**
     * Método para establecer si el vehículo es nuevo
     * 
     * @param nuevo true si el vehículo es nuevo, false en caso contrario
     */
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    /**
     * Método para obtener el número de cambios del vehículo
     * 
     * @return el número de cambios
     */
    public int getCambios() {
        return cambios;
    }

    /**
     * Método para establecer el número de cambios del vehículo
     * 
     * @param cambios el número de cambios
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /**
     * Método para obtener la velocidad máxima del vehículo
     * 
     * @return la velocidad máxima
     */
    public double getVelMax() {
        return velMax;
    }

    /**
     * Método para establecer la velocidad máxima del vehículo
     * 
     * @param velMaz la velocidad máxima
     */
    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    /**
     * Método para obtener el cilindraje del vehículo
     * 
     * @return el cilindraje
     */
    public double getCilindraje() {
        return cilindraje;
    }

    /**
     * Método para establecer el cilindraje del vehículo
     * 
     * @param cilindraje el cilindraje
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Método para obtener el negocio asociado al vehículo
     * 
     * @return el negocio
     */
    public Negocio getNegocio() {
        return negocio;
    }

    /**
     * Método para establecer el negocio asociado al vehículo
     * 
     * @param negocio el negocio
     */
    public void setNegocio(Negocio negocio) {
        this.negocio = negocio;
    }

    /**
     * Método para obtener el tipo de combustible del vehículo.
     * 
     * @return el tipo de combustible (Combustion)
     */
    public Combustion getCombustion() {
        return combustion;
    }

    /**
     * Método para establecer el tipo de combustible del vehículo.
     * 
     * @param combustion el tipo de combustible (Combustion) a establecer
     */
    public void setCombustion(Combustion combustion) {
        this.combustion = combustion;
    }

    /**
     * Método para obtener la transmisión del vehículo.
     * 
     * @return la transmisión (Transmision)
     */
    public Transmision getTransmision() {
        return transmision;
    }

    /**
     * Método para establecer la transmisión del vehículo.
     * 
     * @param transmision la transmisión (Transmision) a establecer
     */
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    /**
     * Método para obtener el estado del vehículo.
     * 
     * @return el estado del vehículo (Estado)
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Método para establecer el estado del vehículo.
     * 
     * @param estado el estado del vehículo (Estado) a establecer
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Método para obtener una representación en forma de cadena del vehículo
     * 
     * @return una cadena que representa el vehículo
     */
    @Override
    public String toString() {
        return "Vehiculo [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", nuevo=" + nuevo
                + ", cambios=" + cambios + ", velMaz=" + velMax + ", cilindraje=" + cilindraje + "]";
    }

}
