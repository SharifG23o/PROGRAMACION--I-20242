package co.edu.uniquindio.poo.model;

public class Venta extends Negocio {
    private double precioVenta;

    /**
     * Constructor de la clase Venta
     * 
     * @param codigo      el codigo de la venta
     * @param impuesto    el impuesto aplicado en la venta
     * @param vehiculo    el vehiculo asociado a la venta
     * @param transaccion la transaccion asociada a la venta
     * @param precioVenta el precio de venta del vehiculo
     */
    public Venta(String codigo, double impuesto, Vehiculo vehiculo, Transaccion transaccion, double precioVenta) {
        super(codigo, impuesto, vehiculo, transaccion);
        this.precioVenta = precioVenta;
    }

    /**
     * Metodo para obtener el precio de venta
     * 
     * @return el precio de venta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Metodo para cambiar el precio de venta
     * 
     * @param precioVenta el nuevo precio de venta
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Metodo para calcular el precio de negocio de la venta
     * 
     * @return el precio de negocio calculado (precioVenta + impuesto)
     */
    @Override
    public double calcularPrecioNegocio() {
        double precio = precioVenta + super.getImpuesto();
        return precio;
    }

}
