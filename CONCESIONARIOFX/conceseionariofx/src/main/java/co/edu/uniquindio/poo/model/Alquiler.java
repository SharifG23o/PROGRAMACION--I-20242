package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler extends Negocio {
    private double precioAlquiler;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    /**
     * Constructor de la clase Alquiler
     * 
     * @param codigo         el codigo del alquiler
     * @param impuesto       el impuesto aplicado en el alquiler
     * @param vehiculo       el vehiculo asociado al alquiler
     * @param transaccion    la transaccion asociada al alquiler
     * @param precioAlquiler el precio de alquiler por día
     * @param fechaInicio    la fecha de inicio del alquiler
     * @param fechaFinal     la fecha final del alquiler
     */
    public Alquiler(String codigo, double impuesto, Vehiculo vehiculo, Transaccion transaccion, double precioAlquiler,
            LocalDate fechaInicio, LocalDate fechaFinal) {
        super(codigo, impuesto, vehiculo, transaccion);
        this.precioAlquiler = precioAlquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    /**
     * Metodo para obtener el precio del alquiler por día
     * 
     * @return el precio del alquiler
     */
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    /**
     * Metodo para cambiar el precio del alquiler por día
     * 
     * @param precioAlquiler el nuevo precio del alquiler
     */
    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    /**
     * Metodo para obtener la fecha de inicio del alquiler
     * 
     * @return la fecha de inicio
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Metodo para cambiar la fecha de inicio del alquiler
     * 
     * @param fechaInicio la nueva fecha de inicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Metodo para obtener la fecha final del alquiler
     * 
     * @return la fecha final
     */
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Metodo para cambiar la fecha final del alquiler
     * 
     * @param fechaFinal la nueva fecha final
     */
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * Metodo para calcular el precio total del negocio de alquiler
     * 
     * @return el precio total del alquiler (precioAlquiler * días)
     */
    @Override
    public double calcularPrecioNegocio() {
        int dias = calcularDiasAlquiler();
        double precio = precioAlquiler * dias + super.getImpuesto();
        return precio;
    }

    /**
     * Metodo para calcular la cantidad de días de alquiler
     * 
     * @return el número total de días entre la fecha de inicio y la fecha final
     */
    public int calcularDiasAlquiler() {
        Period period = Period.between(fechaInicio, fechaFinal);
        int dias = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
        return dias;
    }

}
