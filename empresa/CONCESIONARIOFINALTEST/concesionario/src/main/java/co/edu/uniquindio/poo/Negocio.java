package co.edu.uniquindio.poo;

public abstract class Negocio {
    private String codigo;
    private double impuesto;
    private Vehiculo vehiculo;
    private Transaccion transaccion;

    /**
     * Constructor de la clase Negocio
     * 
     * @param codigo      el codigo del negocio
     * @param impuesto    el impuesto aplicado al negocio
     * @param vehiculo    el vehiculo asociado al negocio
     * @param transaccion la transaccion asociada al negocio
     */
    public Negocio(String codigo, double impuesto, Vehiculo vehiculo, Transaccion transaccion) {
        this.codigo = codigo;
        this.impuesto = impuesto;
        this.vehiculo = vehiculo;
        this.transaccion = transaccion;
    }

    /**
     * Metodo para obtener el codigo del servicio
     * 
     * @return el codigo del servicio
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para cambiar el codigo del servicio
     * 
     * @param codigo el nuevo codigo del servicio
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener el impuesto aplicado al servicio
     * 
     * @return el impuesto del servicio
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * Metodo para cambiar el impuesto aplicado al servicio
     * 
     * @param impuesto el nuevo impuesto del servicio
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Metodo para obtener el vehiculo asociado
     * 
     * @return el vehiculo asociado
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Metodo para cambiar el vehiculo asociado
     * 
     * @param vehiculo el nuevo vehiculo asociado
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Metodo para obtener la transaccion asociada
     * 
     * @return la transaccion asociada
     */
    public Transaccion getTransaccion() {
        return transaccion;
    }

    /**
     * Metodo para cambiar la transaccion asociada
     * 
     * @param transaccion la nueva transaccion asociada
     */
    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    /**
     * Metodo abstracto para calcular el precio de negocio
     * 
     * @return el precio de negocio calculado
     */
    public abstract double calcularPrecioNegocio();

}
