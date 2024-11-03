package co.edu.uniquindio.poo.model;

import java.time.LocalDate;



public class Moto extends Vehiculo {

    private TipoCaja tipoCaja;

    public Moto(String matricula, String marca, String modelo, LocalDate anio, TipoCaja tipoCaja){
        super(matricula, marca, modelo, anio);
        this.tipoCaja=tipoCaja;
    }

    public TipoCaja getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(TipoCaja tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    @Override
    public String toString() {
        return "Moto [tipoCaja=" + tipoCaja + super.toString()+"]";
    }


    public void calcularCosto(){

        System.out.println("La moto cuesta ");
    }

   

    
    
}
