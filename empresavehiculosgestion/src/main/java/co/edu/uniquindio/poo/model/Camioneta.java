package co.edu.uniquindio.poo.model;

import java.time.LocalDate;



public class Camioneta extends Vehiculo {

    private float capacidadCarga;

   
    public Camioneta(String matricula, String marca, String modelo, LocalDate anio, float capacidadCarga) {
        super(matricula, marca, modelo, anio); 
        this.capacidadCarga = capacidadCarga;
    }

    
    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta [capacidadCarga=" + capacidadCarga + ", " + super.toString() + "]";
    }

    
    public void calcularCosto() {
       
        float costo = capacidadCarga * 100; 
        System.out.println("EL COSTO ES: " + costo);
    }


   
}
