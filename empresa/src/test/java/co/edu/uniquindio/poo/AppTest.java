/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EmpleadoFreelance;
import co.edu.uniquindio.poo.model.EmpleadoPorHora;
import co.edu.uniquindio.poo.model.EmpleadoTiempoCompleto;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }


    @Test
    public void testCalcularSalarioTiempoCompleto() {
        LOG.info("Iniciado test testCalcularSalarioTiempoCompleto");
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto("Juan", "12345", 3000.0);
        double salario = empleado.calcularSalario();
        assertEquals(3000.0, salario, 0.01, "El salario mensual debe ser 3000.0");
        LOG.info("Finalizando test testCalcularSalarioTiempoCompleto");
    }


     @Test
    public void testCalcularSalarioEmpleadoPorHora() {
        LOG.info("Iniciado test testCalcularSalarioEmpleadoPorHora");
        EmpleadoPorHora empleado = new EmpleadoPorHora("Ana", "2", 40, 20);
        double salario = empleado.calcularSalario();
        assertEquals(800, salario, 0.01, "El salario por horas debe ser 800.0 (40 horas * 20.0 por hora)");
        LOG.info("Finalizando test testCalcularSalarioEmpleadoPorHora");
    }


     @Test
    public void testCalcularSalarioEmpleadoFreelance() {
        LOG.info("Iniciado test testCalcularSalarioEmpleadoFreelance");
        EmpleadoFreelance empleado = new EmpleadoFreelance("Luis", "3213", 5, 500);
        double salario = empleado.calcularSalario();
        assertEquals(2500, salario, 0.01, "El salario freelance debe ser 2500.0 (5 proyectos * 500.0 por proyecto)");
        LOG.info("Finalizando test testCalcularSalarioEmpleadoFreelance");
    }


}
