package co.edu.uniquindio.poo.model;

import java.time.LocalDate;



public class Auto extends Vehiculo{

    private int numeroPuertas;

    public Auto(String matricula, String marca, String modelo, LocalDate anio,int numeroPuertas){
        super(matricula, marca,modelo, anio);
        this.numeroPuertas=numeroPuertas;

    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Auto [numeroPuertas=" + numeroPuertas + super.toString()+"]";
    }

    public void calcularCosto(){
        float costo = numeroPuertas * 100; 
        System.out.println("EL COSTO ES: " + costo);

    }

    

    
    
}
