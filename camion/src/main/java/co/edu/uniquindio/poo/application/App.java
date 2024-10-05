package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Canasta;
import co.edu.uniquindio.poo.model.TipoCanasta;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Canasta canasta=new Canasta("1234", 100, TipoCanasta.CANASTAFRUTAS);
        Camion camion=new Camion("NAH 547");

        camion.cargarCamion();

        System.out.println(camion);

        JOptionPane.showMessageDialog(null, canasta);
    }


}
