package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class AlquilerTest {

    LocalDate fechaInicio = LocalDate.of(2023, 11, 1);
    LocalDate fechaFin = LocalDate.of(2023, 11, 10);

    Alquiler alquiler = new Alquiler("A001", 100.0, null, null, 800.0, fechaInicio, fechaFin);

    @Test
    public void testCalcularDiasAlquiler() {
        
        int diasEsperados = 9;
        int resultado = alquiler.calcularDiasAlquiler();

        assertEquals(diasEsperados, resultado);
    }

    @Test
    public void testCalcularPrecioNegocio(){
        double precioEsperado=7300;
        double resultado=alquiler.calcularPrecioNegocio();
        assertEquals(precioEsperado, resultado);

    }
}
