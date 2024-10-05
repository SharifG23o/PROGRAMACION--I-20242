package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;


public class Camion {

    private String placa;
    private int numeroCanastas = 10;  
    private Collection<Canasta> listaCanastas = new LinkedList<>();
    
    public Camion(String placa) {
        this.placa = placa;
        cargarCamion();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroCanastas() {
        return numeroCanastas;
    }

    public Collection<Canasta> getListaCanastas() {
        return listaCanastas;
    }

    public void setListaCanastas(LinkedList<Canasta> listaCanastas) {
        this.listaCanastas = listaCanastas;
    }

    




    
    @Override
    public String toString() {
        return "Camion [placa=" + placa + ", numeroCanastas=" + numeroCanastas + ", listaCanastas=" + listaCanastas
                + "]";
    }

    public String cargarCamion() {
        for (int i = 0; i < numeroCanastas; i++) {
            String codigo = "C" + (Math.random() * 9000 + 1000); // Generar un código aleatorio
            int peso = (int) (Math.random() * 100) + 1; // Generar peso aleatorio
            TipoCanasta tipoCanasta = TipoCanasta.values()[(int) (Math.random() * TipoCanasta.values().length)];
    
            // Crear la nueva canasta
            Canasta nuevaCanasta = new Canasta(codigo, peso, tipoCanasta);
    
            listaCanastas.add(nuevaCanasta);
        }
        return "El camión ha sido cargado con 10 canastas aleatorias";
    }
    
    

    public String crearCanasta(Canasta nuevaCanasta) {
        if (nuevaCanasta == null) {
            return "La canasta no puede ser nula";
        }

        if (listaCanastas.size() >= numeroCanastas) {
            return "No hay cupo para una nueva canasta";
        }

        if (buscaCanasta(nuevaCanasta.getCodigo()) != null) {
            return "La canasta ya está registrada";
        }

        listaCanastas.add(nuevaCanasta); 
        return "La canasta ha sido registrada exitosamente";
    }

    public Canasta buscaCanasta(String codigo) {
        for (Canasta canastaAux : listaCanastas) {
            if (canastaAux != null && canastaAux.getCodigo().equals(codigo)) {
                return canastaAux;
            }
        }
        return null;
    }

    public String actualizarCanasta(String codigo, String nuevoCodigo, int nuevoPeso, TipoCanasta nuevoTipoCanasta) {
        Canasta canastaEncontrada = buscaCanasta(codigo);
        if (canastaEncontrada != null) {
            canastaEncontrada.setCodigo(nuevoCodigo);
            canastaEncontrada.setPeso(nuevoPeso);
            canastaEncontrada.setTipoCanasta(nuevoTipoCanasta);
            return "Canasta actualizada exitosamente";
        }
        return "Canasta no encontrada";
    }


    public String eliminarCanasta(String codigo) {
        Canasta canastaEncontrada = buscaCanasta(codigo);
        if (canastaEncontrada != null) {
            listaCanastas.remove(canastaEncontrada);
            return "La canasta ha sido eliminada exitosamente";
        }
        return "Canasta no encontrada";
    }
    
}
