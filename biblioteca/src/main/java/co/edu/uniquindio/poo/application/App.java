package co.edu.uniquindio.poo.application;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Estudiante;
import co.edu.uniquindio.poo.model.Bibliotecario;
import co.edu.uniquindio.poo.model.Libro;
import co.edu.uniquindio.poo.model.Prestamo;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class App {

    private Biblioteca biblioteca;

    public App() {
       
        biblioteca = new Biblioteca("Biblioteca Universitaria CRAI UQ", 150000.00, 100);
    }

    public static void main(String[] args) {
        App app = new App();
        app.biblioteca.autoCarga(); 
        app.menu();
    }

    public void menu() {
        boolean repetirTodo = true;
        while (repetirTodo) {
            String accionElegida = JOptionPane.showInputDialog(null,
                    "¿Qué acción desea realizar? \n\n"
                            + "1. Gestionar Bibliotecarios \n"
                            + "2. Gestionar Estudiantes \n"
                            + "3. Gestionar Libros \n"
                            + "4. Gestionar Préstamos \n"
                            + "5. Ver Reportes \n"
                            + "6. Salir", "Menú principal", JOptionPane.QUESTION_MESSAGE);

            switch (accionElegida) {
                case "1":
                    gestionarBibliotecarios();
                    break;
                case "2":
                    gestionarEstudiantes();
                    break;
                case "3":
                    gestionarLibros();
                    break;
                case "4":
                    gestionarPrestamos();
                    break;
                case "5":
                    verReportes();
                    break;
                case "6":
                    repetirTodo = false;
                    JOptionPane.showMessageDialog(null, "Saliendo de la aplicación.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void gestionarBibliotecarios() {
        boolean repetir = true;
        while (repetir) {
            String accionElegida = JOptionPane.showInputDialog(null,
                    "¿Qué acción desea realizar en Bibliotecarios? \n\n"
                            + "1. Agregar Bibliotecario \n"
                            + "2. Listar Bibliotecarios \n"
                            + "0. Regresar", "Gestión de Bibliotecarios", JOptionPane.QUESTION_MESSAGE);

            switch (accionElegida) {
                case "1":
                    agregarBibliotecario();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, biblioteca.getBibliotecarios().toString(), "Lista de Bibliotecarios", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "0":
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void agregarBibliotecario() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Bibliotecario:", "Ingreso de Nombre", JOptionPane.QUESTION_MESSAGE);
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula del Bibliotecario:", "Ingreso de Cédula", JOptionPane.QUESTION_MESSAGE);
        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del Bibliotecario:", "Ingreso de Correo", JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del Bibliotecario:", "Ingreso de Teléfono", JOptionPane.QUESTION_MESSAGE);  // Ya está como String
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del Bibliotecario:", "Ingreso de Salario", JOptionPane.QUESTION_MESSAGE));  // Usa Double.parseDouble
        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese años de antigüedad:", "Ingreso de Antigüedad", JOptionPane.QUESTION_MESSAGE));  // Esto sigue siendo int
    
        Bibliotecario bibliotecario = new Bibliotecario(nombre, cedula, correo, telefono, salario, antiguedad);
        biblioteca.agregarBibliotecario(bibliotecario);
        JOptionPane.showMessageDialog(null, "Bibliotecario agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    

    private void gestionarEstudiantes() {
        boolean repetir = true;
        while (repetir) {
            String accionElegida = JOptionPane.showInputDialog(null,
                    "¿Qué acción desea realizar en Estudiantes? \n\n"
                            + "1. Agregar Estudiante \n"
                            + "2. Listar Estudiantes \n"
                            + "0. Regresar", "Gestión de Estudiantes", JOptionPane.QUESTION_MESSAGE);

            switch (accionElegida) {
                case "1":
                    agregarEstudiante();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, biblioteca.getEstudiantes().toString(), "Lista de Estudiantes", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "0":
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void agregarEstudiante() {
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula del Estudiante:", "Ingreso de Cédula", JOptionPane.QUESTION_MESSAGE);
        if (biblioteca.verificarEstudiante(cedula)) {
            JOptionPane.showMessageDialog(null, "Error. Ya existe un estudiante con dicha cédula.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Estudiante:", "Ingreso de Nombre", JOptionPane.QUESTION_MESSAGE);
        String correo = JOptionPane.showInputDialog(null, "Ingrese el correo del Estudiante:", "Ingreso de Correo", JOptionPane.QUESTION_MESSAGE);
        String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del Estudiante:", "Ingreso de Teléfono", JOptionPane.QUESTION_MESSAGE);
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del Estudiante:", "Ingreso de Edad", JOptionPane.QUESTION_MESSAGE));

        Estudiante estudiante = new Estudiante(nombre, cedula, correo, telefono, edad);
        biblioteca.agregarEstudiante(estudiante);
        JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void gestionarLibros() {
        boolean repetir = true;
        while (repetir) {
            String accionElegida = JOptionPane.showInputDialog(null,
                    "¿Qué acción desea realizar en Libros? \n\n"
                            + "1. Agregar Libro \n"
                            + "2. Listar Libros \n"
                            + "0. Regresar", "Gestión de Libros", JOptionPane.QUESTION_MESSAGE);

            switch (accionElegida) {
                case "1":
                    agregarLibro();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, biblioteca.getLibros().toString(), "Lista de Libros", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "0":
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void agregarLibro() {
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el código del Libro:", "Ingreso de Código", JOptionPane.QUESTION_MESSAGE);
        if (biblioteca.verificarLibro(codigo)) {
            JOptionPane.showMessageDialog(null, "Error. Ya existe un libro con dicho código.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String isbn = JOptionPane.showInputDialog(null, "Ingrese el ISBN del Libro:", "Ingreso de ISBN", JOptionPane.QUESTION_MESSAGE);
        String autor = JOptionPane.showInputDialog(null, "Ingrese el autor del Libro:", "Ingreso de Autor", JOptionPane.QUESTION_MESSAGE);
        String editorial = JOptionPane.showInputDialog(null, "Ingrese la editorial del Libro:", "Ingreso de Editorial", JOptionPane.QUESTION_MESSAGE);
        String titulo = JOptionPane.showInputDialog(null, "Ingrese el título del Libro:", "Ingreso de Título", JOptionPane.QUESTION_MESSAGE);
        int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de publicación:", "Ingreso de Año", JOptionPane.QUESTION_MESSAGE));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de publicación:", "Ingreso de Mes", JOptionPane.QUESTION_MESSAGE));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día de publicación:", "Ingreso de Día", JOptionPane.QUESTION_MESSAGE));
        int unidadesDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las unidades disponibles:", "Ingreso de Unidades", JOptionPane.QUESTION_MESSAGE));

        LocalDate fechaPublicacion = LocalDate.of(año, mes, dia);

        Libro libro = new Libro(codigo, isbn, autor, editorial, titulo, fechaPublicacion, unidadesDisponibles);
        biblioteca.agregarLibro(libro);
        JOptionPane.showMessageDialog(null, "Libro agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void gestionarPrestamos() {
        boolean repetir = true;
        while (repetir) {
            String accionElegida = JOptionPane.showInputDialog(null,
                    "¿Qué acción desea realizar en Préstamos? \n\n"
                            + "1. Agregar Préstamo \n"
                            + "2. Listar Préstamos \n"
                            + "0. Regresar", "Gestión de Préstamos", JOptionPane.QUESTION_MESSAGE);

            switch (accionElegida) {
                case "1":
                    agregarPrestamo();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, biblioteca.getPrestamos().toString(), "Lista de Préstamos", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "0":
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    private void agregarPrestamo() {
        String codigoPrestamo = JOptionPane.showInputDialog(null, "Ingrese el código del Préstamo:", "Ingreso de Código", JOptionPane.QUESTION_MESSAGE);
        if (biblioteca.verificarPrestamo(codigoPrestamo)) {
            JOptionPane.showMessageDialog(null, "Error. Ya existe un préstamo con dicho código.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String cedulaBibliotecario = JOptionPane.showInputDialog(null, "Ingrese la cédula del Bibliotecario:", "Ingreso de Cédula", JOptionPane.QUESTION_MESSAGE);
        if (!biblioteca.verificarBibliotecario(cedulaBibliotecario)) {
            JOptionPane.showMessageDialog(null, "Error. No se encontró un bibliotecario con dicha cédula.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String cedulaEstudiante = JOptionPane.showInputDialog(null, "Ingrese la cédula del Estudiante:", "Ingreso de Cédula", JOptionPane.QUESTION_MESSAGE);
        if (!biblioteca.verificarEstudiante(cedulaEstudiante)) {
            JOptionPane.showMessageDialog(null, "Error. No se encontró un estudiante con dicha cédula.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int añoPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del préstamo:", "Ingreso de Año", JOptionPane.QUESTION_MESSAGE));
        int mesPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes del préstamo:", "Ingreso de Mes", JOptionPane.QUESTION_MESSAGE));
        int diaPrestamo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día del préstamo:", "Ingreso de Día", JOptionPane.QUESTION_MESSAGE));
        int añoEntrega = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de entrega:", "Ingreso de Año", JOptionPane.QUESTION_MESSAGE));
        int mesEntrega = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de entrega:", "Ingreso de Mes", JOptionPane.QUESTION_MESSAGE));
        int diaEntrega = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día de entrega:", "Ingreso de Día", JOptionPane.QUESTION_MESSAGE));
        int costoDia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo diario:", "Ingreso de Costo", JOptionPane.QUESTION_MESSAGE));

        LocalDate fechaPrestamo = LocalDate.of(añoPrestamo, mesPrestamo, diaPrestamo);
        LocalDate fechaEntrega = LocalDate.of(añoEntrega, mesEntrega, diaEntrega);

        Estudiante estudiante = biblioteca.buscarEstudiante(cedulaEstudiante);
        Bibliotecario bibliotecario = biblioteca.buscarBibliotecario(cedulaBibliotecario);

        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaEntrega, costoDia, codigoPrestamo, estudiante, bibliotecario);
        biblioteca.agregarPrestamo(prestamo);
        JOptionPane.showMessageDialog(null, "Préstamo agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verReportes() {
        boolean repetir = true;
        while (repetir) {
            String accionElegida = JOptionPane.showInputDialog(null,
                    "¿Qué reporte desea generar? \n\n"
                            + "1. Reporte estudiante con más préstamos \n"
                            + "2. Reporte dinero recaudado por la biblioteca \n"
                            + "3. Reporte total de dinero a pagar a los bibliotecarios \n"
                            + "0. Regresar", "Reportes", JOptionPane.QUESTION_MESSAGE);

            switch (accionElegida) {
                case "1":
                    biblioteca.EstudianteMasPrestamos();
                    break;
                case "2":
                    double dinero = biblioteca.getGanancia() + biblioteca.dineroRecaudado();
                    JOptionPane.showMessageDialog(null, "Dinero recaudado: " + dinero, "Reporte", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3":
                    double total = 0;
                    for (Bibliotecario bibliotecario : biblioteca.getBibliotecarios()) {
                        double valorPago = bibliotecario.calcularPago(bibliotecario);
                        total += valorPago;
                    }
                    JOptionPane.showMessageDialog(null, "Dinero a pagar a los bibliotecarios: " + total, "Reporte", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "0":
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
