package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
            camion.crearCanasta(null);
        });

        LOG.info("Finalizando testAgregarCanastaNula");
    }

    @Test
    public void crearCanasta() {
        LOG.info("Iniciado crearCanasta");

        Canasta canasta = new Canasta("C001", 100, TipoCanasta.CANASTACARNES);
        assertEquals("C001", canasta.getCodigo());

        LOG.info("Finalizando crearCanasta");
    }

    @Test
    public void crearCanastaLista() {
        LOG.info("Iniciado crearCanastaLista");

        Camion camion = new Camion("wer 453");
        Canasta canasta = new Canasta("C001", 100, TipoCanasta.CANASTACARNES);

        // Agregar la canasta al camión
        camion.crearCanasta(null);
        assertThrows(Throwable.class, camion.crearCanasta(null));

        // Verifica que el número de canastas en el camión es 1
        assertEquals(10, camion.getListaCanastas().size());

        assertIterableEquals(null, null);

        LOG.info("Finalizando crearCanastaLista");
    }
}
