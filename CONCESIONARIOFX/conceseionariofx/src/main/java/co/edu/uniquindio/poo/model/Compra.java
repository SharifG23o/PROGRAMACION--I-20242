package co.edu.uniquindio.poo.model;

public class Compra extends Negocio {
    private double precioCompra;
    private boolean revisionVehiculo;

    /**
     * Constructor de la clase Compra
     * 
     * @param codigo           el codigo de la compra
     * @param impuesto         el impuesto aplicado en la compra
     * @param vehiculo         el vehiculo asociado a la compra
     * @param transaccion      la transaccion asociada a la compra
     * @param precioCompra     el precio de compra del vehiculo
     * @param revisionVehiculo el estado de la revision del vehiculo (true si está
     *                         en revisión)
     */
    public Compra(String codigo, double impuesto, Vehiculo vehiculo, Transaccion transaccion, double precioCompra,
            boolean revisionVehiculo) {
        super(codigo, impuesto, vehiculo, transaccion);
        this.precioCompra = precioCompra;
        this.revisionVehiculo = revisionVehiculo;
    }

    /**
     * Metodo para obtener el precio de compra
     * 
     * @return el precio de compra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * Metodo para cambiar el precio de compra
     * 
     * @param precioCompra el nuevo precio de compra
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * Metodo para obtener el estado de la revision del vehiculo
     * 
     * @return true si el vehiculo está en revisión, false en caso contrario
     */
    public boolean isRevisionVehiculo() {
        return revisionVehiculo;
    }

    /**
     * Metodo para cambiar el estado de la revision del vehiculo
     * 
     * @param revisionVehiculo el nuevo estado de la revision (true o false)
     */
    public void setRevisionVehiculo(boolean revisionVehiculo) {
        this.revisionVehiculo = revisionVehiculo;
    }

    /**
     * Metodo para calcular el precio de negocio de la compra
     * 
     * @return el precio de negocio calculado (precioCompra + impuesto)
     */
    @Override
    public double calcularPrecioNegocio() {
        double precio = precioCompra + super.getImpuesto();
        return precio;
    }

}
