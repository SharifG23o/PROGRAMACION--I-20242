package co.edu.uniquindio.poo.application;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.EmpleadoFreelance;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Empleado empleado= new EmpleadoFreelance("Raúl","1094898071",22,345.6f);
        JOptionPane.showMessageDialog(null,empleado);
    }
}
