package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.LinkedList;

public class EmpresaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void testObtenerVendedoresFecha() {
        LOG.info("Iniciado test ObtenerVendedoresFecha");
        Concesionario concesionario = new Concesionario("UQ");
        // Crear vendedores
        Vendedor vendedor1 = new Vendedor("Juan", "Perez", "123456789", "555-1234", 
                                           "juan.perez@example.com", "jperez", "pass123", 
                                           "Color favorito", "Azul", "001");
        Vendedor vendedor2 = new Vendedor("Maria", "Gomez", "987654321", "555-5678", 
                                           "maria.gomez@example.com", "mgomez", "pass456", 
                                           "Mascota favorita", "Fido", "002");
        Vendedor vendedor3 = new Vendedor("Luis", "Gomez", "67421", "876-5678", 
                                           "luis.gomez@example.com", "lugomez", "prin456", 
                                           "Mascota favorita", "Luke", "003");

        // Crear transacciones
        Transaccion transaccion1 = new Transaccion("T001", 100.0, LocalDate.of(2023, 1, 10), null, vendedor1);
        Transaccion transaccion2 = new Transaccion("T002", 200.0, LocalDate.of(2023, 2, 20), null, vendedor2);
        Transaccion transaccion3 = new Transaccion("T003", 150.0, LocalDate.of(2022, 12, 15), null, vendedor1);

        // Asociar transacciones a vendedores
        vendedor1.getTransacciones().add(transaccion1);
        vendedor2.getTransacciones().add(transaccion2);
        vendedor3.getTransacciones().add(transaccion3);

        concesionario.agregarVendedor(vendedor1);
        concesionario.agregarVendedor(vendedor2);
        concesionario.agregarVendedor(vendedor3);

        //Lista de vendedores
        LinkedList <Vendedor> vendedoresEsperados = new LinkedList<>();
        vendedoresEsperados.add(vendedor1);
        vendedoresEsperados.add(vendedor2);

        // Fechas de prueba
        LocalDate primerFecha = LocalDate.of(2023, 1, 1);
        LocalDate segundaFecha = LocalDate.of(2023, 3, 1);
    

        // Invocar el método a probar
        LinkedList<Vendedor> resultado = concesionario.obtenerVendoresFecha(primerFecha, segundaFecha);

       

        // Verificar los resultados
        assertEquals(vendedoresEsperados, resultado);
        LOG.info("Finalizando test ObtenerVendedoresFecha");
    }
}


