package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.Vendedor;

public class AdministradorController {
    Concesionario concesionario;

    public AdministradorController(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    public ArrayList<Cliente> obtenerListaClientes() {
        return concesionario.getClientes();
    }

    public ArrayList<Vendedor> obtenerListaVendedores() {
        return concesionario.getVendedores();
    }

    public LinkedList<Vendedor> obtenerVendedoresFecha(LocalDate fechaInicio, LocalDate fechaFinal) {
        return concesionario.obtenerVendoresFecha(fechaInicio, fechaFinal);
    }
}
