package co.edu.uniquindio.poo.model;

public class EmpleadoFreelance extends Empleado{

    private int proyectosCompletados;
    private float pagoPorProyecto;


    public EmpleadoFreelance(String nombre, String identificacion, int proyectosCompletados, float pagoPorProyecto){

        super(nombre, identificacion);
        this.proyectosCompletados=proyectosCompletados;
        this.pagoPorProyecto=pagoPorProyecto;

        
    }


    public int getProyectosCompletados() {
        return proyectosCompletados;
    }


    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }


    public float getPagoPorProyecto() {
        return pagoPorProyecto;
    }


    public void setPagoPorProyecto(long pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }


    @Override
    public String toString() {
        return "EmpleadoFreelance [proyectosCompletados=" + proyectosCompletados + ", pagoPorProyecto="
                + pagoPorProyecto + "]";
    }


    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    



    
}
