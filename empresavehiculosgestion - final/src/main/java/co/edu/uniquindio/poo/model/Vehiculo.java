package co.edu.uniquindio.poo.model;

import java.time.LocalDate;



public abstract class Vehiculo {
    private String matricula;
    private String marca; 
    private String modelo;
    private LocalDate anio;

    public Vehiculo(String matricula, String marca, String modelo, LocalDate anio){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
    
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
    }

    public void setAnio(int int1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAnio'");
    }



   
  

    



}
