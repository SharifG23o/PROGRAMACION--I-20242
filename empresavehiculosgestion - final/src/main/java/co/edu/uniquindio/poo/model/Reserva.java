package co.edu.uniquindio.poo.model;

public class Reserva {
    private double tarifaBase;
    private double tarifaAdicional;
    private int numeroDiasReserva;

    public Reserva( double tarifaBase, double tarifaAdicional, int numeroDiasReserva) {
        this.tarifaBase = tarifaBase;
        this.tarifaAdicional = tarifaAdicional;
        this.numeroDiasReserva = numeroDiasReserva;
    }

    // Método para calcular el costo total de la reserva
    public double calcularCostoTotal() {
        return (tarifaBase + tarifaAdicional) * numeroDiasReserva;
    }

    // Métodos Getter y Setter
    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaAdicional() {
        return tarifaAdicional;
    }

    public void setTarifaAdicional(double tarifaAdicional) {
        this.tarifaAdicional = tarifaAdicional;
    }

    public int getNumeroDiasReserva() {
        return numeroDiasReserva;
    }

    public void setNumeroDiasReserva(int numeroDiasReserva) {
        this.numeroDiasReserva = numeroDiasReserva;
    }

    @Override
    public String toString() {
        return "Reserva [tarifaBase=" + tarifaBase + ", tarifaAdicional=" + tarifaAdicional + 
               ", numeroDiasReserva=" + numeroDiasReserva + 
               ", costoTotal=" + calcularCostoTotal() + "]";
    }

    public int getIdReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdReserva'");
    }

    public Object getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }

    public Object getFecha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFecha'");
    }

    public void setVehiculo(Vehiculo buscarVehiculoPorPlaca) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVehiculo'");
    }

    public void setCliente(Cliente buscarClientePorIdentificacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }

    public Object getVehiculo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVehiculo'");
    }
}
