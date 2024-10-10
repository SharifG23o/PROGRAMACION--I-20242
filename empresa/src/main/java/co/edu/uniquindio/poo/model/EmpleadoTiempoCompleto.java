package co.edu.uniquindio.poo.model;

public class EmpleadoTiempoCompleto extends Empleado {

    private long salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, long salarioMensual){

        super(nombre, identificacion);
        this.salarioMensual=salarioMensual;

    }

    public long getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(long salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [salarioMensual=" + salarioMensual + "]";
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

   

    
    
}
