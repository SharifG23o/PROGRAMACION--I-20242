package co.edu.uniquindio.poo.model;

public record Color(String red, String green,String blue) {

    public String convert(){

        String hex=String.format("#%02x%02x%02x", red, green, blue);

        return hex;
    }
    
}
