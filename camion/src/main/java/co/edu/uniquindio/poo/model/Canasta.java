package co.edu.uniquindio.poo.model;

public class Canasta {

    private final String codigo;
    private int peso;
    private TipoCanasta tipoCanasta; 
    
    

    public Canasta(String codigo, int peso, TipoCanasta tipoCanasta){
        this.codigo = codigo;
        this.peso = peso;
        this.tipoCanasta = tipoCanasta;  
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        //ethis.codigo = codigo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public TipoCanasta getTipoCanasta() {
        return tipoCanasta;
    }

    public void setTipoCanasta(TipoCanasta tipoCanasta) {
        this.tipoCanasta = tipoCanasta;
    }

    @Override
    public String toString() {
        return "Canasta [codigo=" + codigo + ", peso=" + peso + ", tipoCanasta=" + tipoCanasta + "]";
    }
}
