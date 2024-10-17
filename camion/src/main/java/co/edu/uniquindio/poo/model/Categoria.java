package co.edu.uniquindio.poo.model;

public record Categoria(int codigo, String nombre) {

    public String getCategoria(){

        return "Mi categoria"+codigo+nombre;


    }
    
}
