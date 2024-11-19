package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VentaTest {

    Venta venta = new Venta ("095h", 100, null, null, 5000);
   
    
    @Test
    public void testCalcularPrecioVenta(){
        int precioEsperado=5100;
        double resultado= venta.calcularPrecioNegocio();


        assertEquals(precioEsperado, resultado);
    }


}
