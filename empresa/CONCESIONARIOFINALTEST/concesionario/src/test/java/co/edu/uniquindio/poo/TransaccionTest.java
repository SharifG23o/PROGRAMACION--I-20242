package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;



public class TransaccionTest {
    @Test
    public void testCalcularPrecioTotal(){
    LocalDate fechaInicio = LocalDate.of(2023, 11, 1);
    LocalDate fechaFin = LocalDate.of(2023, 11, 10);
    
    Negocio alquiler = new Alquiler("A001", 100.0, null, null, 800.0, fechaInicio, fechaFin);
    Negocio venta = new Venta("095h", 100, null, null, 5000);
    Negocio compra = new Compra("095h", 100, null, null, 3000, true);
    



    Transaccion transaccion = new Transaccion ("98h4", 0, null, null, null);
    
    transaccion.getNegocios().add(alquiler);
    transaccion.getNegocios().add(venta);
    transaccion.getNegocios().add(compra);
    transaccion.calcularPrecioTotal();
    double precioEsperado=15500;
    double resultado= transaccion.getPrecioTotal();
    assertEquals(precioEsperado, resultado);
  
    

    }
    




    
}
