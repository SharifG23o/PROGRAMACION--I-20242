package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Canasta;
import co.edu.uniquindio.poo.model.TipoCanasta;

public class camionTest {

    private static final Logger LOG = Logger.getLogger(camionTest.class.getName());

    /**
     * Test para verificar que no se puede agregar una canasta nula al camión.
     */
    @Test
    public void testAgregarCanastaNula() {
        LOG.info("Iniciado testAgregarCanastaNula");

        Camion camion = new Camion("FPR 514");
        camion.cargarCamion();

        // Verifica que se lanza una excepción al agregar una canasta nula
        assertThrows(IllegalArgumentException.class, () -> {
            camion.crearCanasta(null);  // Asegúrate de que este método lance la excepción correcta
        });

        LOG.info("Finalizando testAgregarCanastaNula");
    }

    @Test
    public void testCrearCanasta() {
        LOG.info("Iniciado testCrearCanasta");

        Canasta canasta = new Canasta("C001", 100, TipoCanasta.CANASTACARNES);
        assertEquals("C001", canasta.getCodigo(), "El código de la canasta debería ser C001");

        LOG.info("Finalizando testCrearCanasta");
    }

    @Test
    public void testCrearCanastaLista() {
        LOG.info("Iniciado testCrearCanastaLista");

        Camion camion = new Camion("WER 453");
        Canasta canasta = new Canasta("C001", 100, TipoCanasta.CANASTACARNES);

        // Agregar la canasta al camión
        camion.crearCanasta(canasta);  // Cambiado a crearCanasta(canasta)
        
        // Verifica que el número de canastas en el camión es 1
        assertEquals(1, camion.getListaCanastas().size(), "El número de canastas en el camión debería ser 1");

        LOG.info("Finalizando testCrearCanastaLista");
    }
}
