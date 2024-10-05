/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Bibliotecario;
import co.edu.uniquindio.poo.model.Estudiante;
import co.edu.uniquindio.poo.model.Libro;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    private Biblioteca biblioteca;

    @BeforeEach
    public void setUp() {
        // Inicializamos la biblioteca antes de cada prueba
        biblioteca = new Biblioteca("Biblioteca Universitaria", 50000.0, 200);
    }

    /**
     * Prueba simple
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    // Test 1: Agregar un bibliotecario
    @Test
    public void testAgregarBibliotecario() {
        LOG.info("Iniciado testAgregarBibliotecario");
        Bibliotecario bibliotecario = new Bibliotecario("Carlos", "12345678", "carlos@gmail.com", "3104553300", 2500.50, 5);
        biblioteca.agregarBibliotecario(bibliotecario);

        assertTrue(biblioteca.getBibliotecarios().contains(bibliotecario), "El bibliotecario debería ser agregado.");
        LOG.info("Finalizando testAgregarBibliotecario");
    }

    // Test 2: Agregar un estudiante
    @Test
    public void testAgregarEstudiante() {
        LOG.info("Iniciado testAgregarEstudiante");
        Estudiante estudiante = new Estudiante("Ana", "987654321", "ana@gmail.com", "3123456789", 20);
        biblioteca.agregarEstudiante(estudiante);

        assertTrue(biblioteca.getEstudiantes().contains(estudiante), "El estudiante debería ser agregado.");
        LOG.info("Finalizando testAgregarEstudiante");
    }

    // Test 3: Agregar un libro
    @Test
    public void testAgregarLibro() {
        LOG.info("Iniciado testAgregarLibro");
        
       
        // Crear el libro utilizando el nuevo constructor
        Libro libro = new Libro("1", "12345", "Gabriel García Márquez", "Editorial X", "Cien años de soledad", LocalDate.of(1967, 6, 5), 10);
        biblioteca.agregarLibro(libro);

        assertTrue(biblioteca.getLibros().contains(libro), "El libro debería ser agregado.");
        LOG.info("Finalizando testAgregarLibro");
    }

   
}
