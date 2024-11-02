package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual){

        super(nombre, identificacion);
        this.salarioMensual=salarioMensual;

    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [salarioMensual=" + salarioMensual + "]";
    }

    public double calcularSalario() {
        return salarioMensual;
    }

   

    
    
}
