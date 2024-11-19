package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CompraTest {
    
    Compra compra = new Compra ("095h", 100, null, null, 3000, true);
    
    @Test
    public void testCalcularPrecioNegocio(){
        double precioEsperado=3100;
        double resultado= compra.calcularPrecioNegocio();

        assertEquals(precioEsperado, resultado);
    }
    

}
