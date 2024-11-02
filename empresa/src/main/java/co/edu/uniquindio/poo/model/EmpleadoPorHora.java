package co.edu.uniquindio.poo.model;

public class EmpleadoPorHora extends Empleado {

    private int horasTrabajadas;
    private float salarioPorHora;

    public EmpleadoPorHora(String nombre, String identificacion, int horasTrabajadas, float salarioPorHora){

        super(nombre, identificacion);
        this.horasTrabajadas=horasTrabajadas;
        this.salarioPorHora=salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora [horasTrabajadas=" + horasTrabajadas + ", salarioPorHora=" + salarioPorHora + "]";
    }

    public double calcularSalario() {
        return horasTrabajadas * salarioPorHora;
    }

    

    
    
}
