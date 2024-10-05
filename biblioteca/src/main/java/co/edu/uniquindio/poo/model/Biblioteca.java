package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {

    private String nombre;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Prestamo> prestamos;
    private LinkedList<Libro> libros;
    private double ganancia;
    private int cantidadLibros;

    /**
     * Metodo constructor de la clase biblioteca
     * 
     * @param nombre
     * @param ganancia
     * @param cantidadLibros
     */
    public Biblioteca(String nombre, double ganancia, int cantidadLibros) {
        this.nombre = nombre;
        this.ganancia = ganancia;
        this.cantidadLibros = 0;
        estudiantes = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
    }

    /**
     * Metodo para testear el sistema con datos cargados
     */
    public void autoCarga() {
        Estudiante estudiante = new Estudiante("Juan", "1030", "juan@", "3172113456", 17);
        Estudiante estudiante2 = new Estudiante("Pipe", "1090", "pipe@", "311345789", 19);
        estudiantes.add(estudiante);
        estudiantes.add(estudiante2);
        Bibliotecario bibliotecario = new Bibliotecario("Julian", "1080", "juan@", "340234567", 1000, 5);
        Bibliotecario bibliotecario2 = new Bibliotecario("Pedro", "1040", "pipe@", "3154322133", 2000, 1);
        bibliotecarios.add(bibliotecario);
        bibliotecarios.add(bibliotecario2);
        Libro libro = new Libro("101", "0001", "Gabriel Garcia Marquez", "Tres editores", "Cien años de Soledad",
                LocalDate.of(1967, 5, 1), 10);
        libro.cambiarEstado();
        Libro libro2 = new Libro("102", "0011", "George Orwell", "Tres editores", "1984",
                LocalDate.of(1949, 6, 8), 5);
        libro2.cambiarEstado();
        libros.add(libro);
        libros.add(libro2);
        Prestamo prestamo = new Prestamo(LocalDate.of(2024, 9, 28), LocalDate.of(2024, 10, 28),
                1000, "1001", estudiante, bibliotecario);
        Prestamo prestamo2 = new Prestamo(LocalDate.of(2024, 9, 28), LocalDate.of(2025, 9, 28),
                1000, "1002", estudiante2, bibliotecario2);
        Prestamo prestamo3 = new Prestamo(LocalDate.of(2024, 9, 28), LocalDate.of(2025, 9, 28),
                1000, "1003", estudiante2, bibliotecario2);
        prestamos.add(prestamo);
        prestamos.add(prestamo2);
        prestamos.add(prestamo3);
    }

    /**
     * Metodo para el menu de biblioteca
     */
    public void menu() {
        imprimir("--------------------");
        imprimir("Bienvenido a la Biblioteca: " + getNombre());
        imprimir("1. Acceso a Bibliotecarios.");
        imprimir("2. Acceso a Estudiantes.");
        imprimir("3. Acceso a Libros.");
        imprimir("4. Acceso a Prestamos");
        imprimir("5. Acceso a Reportes.");
        imprimir("6. Salir de la aplicacion.");
        int opcion = ingresarEntero("¿Que deseas realizar?:");
        switch (opcion) {
            case 1:
                operarBibliotecario();
                break;
            case 2:
                operarEstudiante();
                break;
            case 3:
                operarLibro();
                break;
            case 4:
                operarPrestamo();
                break;
            case 5:
                operarReportes();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                imprimir("Opcion incorrecta. Intente de nuevo.");
                menu();
                break;
        }
    }

    /**
     * Metodo para manipular bibliotecario
     */
    public void operarBibliotecario() {
        imprimir("--------------------");
        imprimir("Acceso a Bibliotecarios:");
        imprimir("1. Agregar Bibliotecario.");
        imprimir("2. Regresar.");
        int opcion = ingresarEntero("¿Que deseas realizar?:");
        switch (opcion) {
            case 1:
                agregarBibliotecario(crearBibliotecario());
                imprimir("Se ha creado con exito.");
                operarBibliotecario();
                break;
            case 2:
                menu();
                break;
            default:
                imprimir("Opcion incorrecta. Intente de nuevo.");
                operarBibliotecario();
                break;
        }
    }

    /**
     * Metodo para crear un bibliotecario
     * 
     * @return bibliotecario creado
     */
    public Bibliotecario crearBibliotecario() {
        imprimir("--------------------");
        imprimir("Informacion del Bibliotecario:");
        String cedula = ingresarTexto("Ingrese la cedula: ");
        if (verificarBibliotecario(cedula)) {
            imprimir("Error. Ya existe un bibliotecario con dicha cedula.");
            operarBibliotecario();
        }
        String nombre = ingresarTexto("Ingrese el nombre: ");
        String correo = ingresarTexto("Ingrese el correo: ");
        String telefono = ingresarTexto("Ingrese el telefono: ");
        int salario = ingresarEntero("Ingrese el salario: ");
        int antiguedad = ingresarEntero("Ingrese años de antiguedad: ");
        Bibliotecario bibliotecario = new Bibliotecario(nombre, cedula, correo, telefono, salario, antiguedad);
        return bibliotecario;
    }

    /**
     * Metodo para agregar un bibliotecario a la biblioteca
     * 
     * @param bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    /**
     * Metodo para buscar un bibliotecario
     * 
     * @param cedula
     * @return Un bibliotecario
     */
    public Bibliotecario buscarBibliotecario(String cedula) {
        Bibliotecario bibliotecarioBuscado = null;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                bibliotecarioBuscado = bibliotecario;
            }
        }
        return bibliotecarioBuscado;
    }

    /**
     * Metodo para verificar si un bibliotecario ya existe en biblioteca
     * 
     * @param bibliotecario
     * @return verificacion de existencia
     */
    public boolean verificarBibliotecario(String cedula) {
        boolean existencia = false;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                existencia = true;
            }
        }
        return existencia;
    }

    /**
     * Metodo para manipular estudiante
     */
    public void operarEstudiante() {
        imprimir("--------------------");
        imprimir("Acceso a Estudiantes:");
        imprimir("1. Agregar Estudiante.");
        imprimir("2. Regresar.");
        int opcion = ingresarEntero("¿Que deseas realizar?:");
        switch (opcion) {
            case 1:
                agregarEstudiante(crearEstudiante());
                imprimir("Se ha creado con exito.");
                operarEstudiante();
                break;
            case 2:
                menu();
                break;
            default:
                imprimir("Opcion incorrecta. Intente de nuevo.");
                operarEstudiante();
                break;
        }
    }

    /**
     * Metodo para crear un estudiante
     * 
     * @return estudiante creado
     */
    public Estudiante crearEstudiante() {
        imprimir("--------------------");
        imprimir("Informacion del Estudiante:");
        String cedula = ingresarTexto("Ingrese la cedula: ");
        if (verificarEstudiante(cedula)) {
            imprimir("Error. Ya existe un estudiante con dicha cedula.");
            operarEstudiante();
        }
        String nombre = ingresarTexto("Ingrese el nombre: ");
        String correo = ingresarTexto("Ingrese el correo: ");
        String telefono = ingresarTexto("Ingrese el telefono: ");
        int edad = ingresarEntero("Ingrese la edad: ");
        Estudiante estudiante = new Estudiante(nombre, cedula, correo, telefono, edad);
        return estudiante;
    }

    /**
     * Metodo para agregar un estudiante a la biblioteca
     * 
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Metodo para buscar un estudiante
     * 
     * @param cedula
     * @return Un estudiante
     */
    public Estudiante buscarEstudiante(String cedula) {
        Estudiante estudianteBuscado = null;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                estudianteBuscado = estudiante;
            }
        }
        return estudianteBuscado;
    }

    /**
     * Metodo para verificar si un estudiante ya existe en biblioteca
     * 
     * @param estudiante
     * @return verificacion de existencia
     */
    public boolean verificarEstudiante(String cedula) {
        boolean existencia = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                existencia = true;
            }
        }
        return existencia;
    }

    /**
     * Metodo para manipular libro
     */
    public void operarLibro() {
        imprimir("--------------------");
        imprimir("Acceso a Libros:");
        imprimir("1. Agregar libro.");
        imprimir("2. Reemplazar libro.");
        imprimir("3. Consultar libro por codigo.");
        imprimir("4. Consultar la cantidad de prestamos que esta incluido un libro por su nombre.");
        imprimir("5. Regresar.");
        int opcion = ingresarEntero("¿Que deseas realizar?:");
        switch (opcion) {
            case 1:
                agregarLibro(crearLibro());
                imprimir("Se ha creado con exito.");
                setCantidadLibros(getCantidadLibros() + 1);
                operarLibro();
                break;
            case 2:
                String codigo = ingresarTexto("Ingrese el codigo del libro a reemplazar: ");
                if (reemplazarLibro(codigo)) {
                    imprimir("Se ha reemplazado con exito.");
                } else {
                    imprimir("Error. No se ha encontrada el libro.");
                }
                operarLibro();
                break;
            case 3:
                String codigoBuscado = ingresarTexto("Ingrese el codigo del libro a buscar: ");
                if (verificarLibro(codigoBuscado)) {
                    Libro libro = consultarLibro(codigoBuscado);
                    imprimir(libro.toString());
                } else {
                    imprimir("Error. No se ha encontrado un libro con dicho codigo.");
                }
                operarLibro();
                break;
            case 4:
                int contador = 0;
                String nombreLibro = ingresarTexto("Ingrese el nombre del libro a buscar: ");
                if (verificarLibroNombre(nombreLibro)) {
                    for (Prestamo prestamo : prestamos) {
                        for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()) {
                            contador += detallePrestamo.consultarLibroEnPrestamoNombre(nombreLibro);
                        }
                    }
                    imprimir("La cantidad de prestamos es: " + contador);
                } else {
                    imprimir("Error. No se ha encontrado un libro con dicho nombre.");
                }
                operarLibro();
                break;
            case 5:
                menu();
                break;
            default:
                imprimir("Opcion incorrecta. Intente de nuevo.");
                operarLibro();
                break;
        }
    }

    /**
     * Metodo para crear un libro
     * 
     * @return libro creado
     */
    public Libro crearLibro() {
        imprimir("--------------------");
        imprimir("Informacion del Libro:");
        String codigo = ingresarTexto("Ingrese el codigo: ");
        if (verificarLibro(codigo)) {
            imprimir("Error. Ya existe un libro con dicho codigo.");
            operarLibro();
        }
        String isbn = ingresarTexto("Ingrese el isbn: ");
        String autor = ingresarTexto("Ingrese el autor: ");
        String editorial = ingresarTexto("Ingrese el editorial: ");
        String titulo = ingresarTexto("Ingrese el titulo: ");
        int año = ingresarEntero("Ingrese el año de publicacion: ");
        int mes = ingresarEntero("Ingrese el mes de publicacion: ");
        int dia = ingresarEntero("Ingrese el dia de publicacion: ");
        int unidadesDisponibles = ingresarEntero("Ingrese la cantidad de unidades dispobibles: ");
        Libro libro = new Libro(codigo, isbn, autor, editorial, titulo, LocalDate.of(año, mes, dia),
                unidadesDisponibles);
        libro.cambiarEstado();
        return libro;
    }

    /**
     * Metodo para agregar un libro a la biblioteca
     * 
     * @param libro
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Metodo para reemplazar un libro con su codigo a un libro nuevo
     * 
     * @param codigo
     * @param libroNuevo
     */
    public boolean reemplazarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
                Libro libroNuevo = crearLibro();
                libros.add(libroNuevo);
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para consultar un libro con su codigo
     * 
     * @param codigo
     */
    public Libro consultarLibro(String codigo) {
        Libro libroBuscado = null;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libroBuscado = libro;
            }
        }
        return libroBuscado;
    }

    /**
     * Metodo para verificar si un libro ya existe en biblioteca
     * 
     * @param libro
     * @return verificacion de existencia
     */
    public boolean verificarLibro(String codigo) {
        boolean existencia = false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                existencia = true;
            }
        }
        return existencia;
    }

    /**
     * Metodo para verificar si un libro con su nombre ya existe en biblioteca
     * 
     * @param nombre
     * @return verificacion de existencia
     */
    public boolean verificarLibroNombre(String nombre) {
        boolean existencia = false;
        for (Libro libro : libros) {
            String titulo = libro.getTitulo().toLowerCase();
            if (titulo.equals(nombre.toLowerCase())) {
                existencia = true;
            }
        }
        return existencia;
    }

    /**
     * Metodo para manipular prestamo
     */
    public void operarPrestamo() {
        imprimir("--------------------");
        imprimir("Acceso a Prestamos:");
        imprimir("1. Agregar prestamo.");
        imprimir("2. Adicionar libro a un prestamo.");
        imprimir("3. Entregar prestamo.");
        imprimir("4. Consultar prestamo por codigo.");
        imprimir("5. Mostrar la cantidad de prestamos por cada empleado.");
        imprimir("6. Regresar.");
        int opcion = ingresarEntero("¿Que deseas realizar?:");
        switch (opcion) {
            case 1:
                agregarPrestamo(crearPrestamo());
                imprimir("Se ha creado con exito.");
                operarPrestamo();
                break;
            case 2:
                String codigoPeticion = ingresarTexto("Ingrese el codigo del prestamo: ");
                String codigoLibro = ingresarTexto("Ingrese codigo del libro a adicionar: ");
                if (verificarLibro(codigoLibro) & verificarPrestamo(codigoPeticion)) {
                    Libro libro = consultarLibro(codigoLibro);
                    Prestamo prestamo = consultarPrestamo(codigoPeticion);
                    if (libro.getEstado()) {
                        int cantidad = ingresarEntero("Ingrese la cantidad de unidades a prestar: ");
                        if (libro.getUnidadesDisponibles() >= cantidad) {
                            DetallePrestamo detalleprestamo = new DetallePrestamo(cantidad, libro);
                            prestamo.agregarDetallePrestamo(detalleprestamo);
                            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
                            libro.cambiarEstado();
                            imprimir("Se ha adicionado el libro al prestamo con exito.");
                        } else {
                            imprimir("El libro no tiene dicha cantidad de unidades disponibles.");
                        }
                    } else {
                        imprimir("El libro no se encuentra disponible.");
                    }
                } else {
                    imprimir("Error. No se ha encontrado el libro o prestamo con dicho codigo.");
                }
                operarPrestamo();
                break;
            case 3:
                String codigo = ingresarTexto("Ingrese el codigo del libro: ");
                if (verificarLibro(codigo)) {
                    for (Prestamo prestamo : prestamos) {
                        for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()) {
                            if (detallePrestamo.getLibro().equals(consultarLibro(codigo))) {
                                detallePrestamo.EntregarPrestamo(prestamo);
                                prestamo.getDetallePrestamos().remove(detallePrestamo);
                                imprimir("Se ha entregado el prestamo con exito.");
                                operarPrestamo();
                            }
                        }
                    }
                    imprimir("Error. No se ha encontrado un prestamo en el que este el libro.");
                } else {
                    imprimir("Error. No se ha encontrado el libro con dicho codigo.");
                }
                operarPrestamo();
                break;
            case 4:
                String codigoBuscado = ingresarTexto("Ingrese el codigo del prestamo a buscar: ");
                if (verificarPrestamo(codigoBuscado)) {
                    Prestamo prestamo = consultarPrestamo(codigoBuscado);
                    imprimir(prestamo.toString());
                } else {
                    imprimir("Error. No se ha encontrado un prestamo con dicho codigo.");
                }
                operarPrestamo();
                break;
            case 5:
                int i = 1;
                for (Bibliotecario bibliotecario : bibliotecarios) {
                    imprimir(i + ". Empleado con cedula: " + bibliotecario.getCedula() + "\n"
                            + bibliotecario.cantidadPrestamos());
                    i++;
                }
                operarPrestamo();
                break;
            case 6:
                menu();
                break;
            default:
                imprimir("Opcion incorrecta. Intente de nuevo.");
                operarPrestamo();
                break;
        }
    }

    /**
     * Metodo para crear un prestamo
     * 
     * @return prestamo creado
     */
    public Prestamo crearPrestamo() {
        imprimir("--------------------");
        imprimir("Informacion del Prestamo:");
        String codigo = ingresarTexto("Ingrese el codigo: ");
        if (verificarPrestamo(codigo)) {
            imprimir("Error. Ya existe un prestamo con dicho codigo.");
            operarPrestamo();
        }
        String codigoBibiliotecario = ingresarTexto("Ingrese la cedula del bibliotecario: ");
        String codigoEstudiante = ingresarTexto("Ingrese la cedula del estudiante: ");
        if (!verificarBibliotecario(codigoBibiliotecario) || !verificarEstudiante(codigoEstudiante)) {
            imprimir("Error. No se ha encontrado un bibliotecario o estudiante con dicha cedula.");
            operarPrestamo();
        }
        Estudiante estudiante = buscarEstudiante(codigoEstudiante);
        Bibliotecario bibliotecario = buscarBibliotecario(codigoBibiliotecario);
        int añoPrestamo = ingresarEntero("Ingrese el año del prestamo: ");
        int mesPrestamo = ingresarEntero("Ingrese el mes del prestamo: ");
        int diaPrestamo = ingresarEntero("Ingrese el dia del prestamo: ");
        int añoEntrega = ingresarEntero("Ingrese el año de la entrega: ");
        int mesEntrega = ingresarEntero("Ingrese el mes de la entrega: ");
        int diaEntrega = ingresarEntero("Ingrese el dia de la entrega: ");
        int costoDia = ingresarEntero("Ingrese el costo diario: ");
        Prestamo prestamo = new Prestamo(LocalDate.of(añoPrestamo, mesPrestamo, diaPrestamo),
                LocalDate.of(añoEntrega, mesEntrega, diaEntrega), costoDia, codigo, estudiante, bibliotecario);
        return prestamo;
    }

    /**
     * Metodo para agregar un prestamo a la biblioteca
     * 
     * @param prestamo
     */
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    /**
     * Metodo para consultar un prestamo con su codigo
     * 
     * @param codigo
     */
    public Prestamo consultarPrestamo(String codigo) {
        Prestamo prestamoBuscado = null;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                prestamoBuscado = prestamo;
            }
        }
        return prestamoBuscado;
    }

    /**
     * Metodo para verificar si un prestamo ya existe en biblioteca
     * 
     * @param prestamo
     * @return verificacion de existencia
     */
    public boolean verificarPrestamo(String codigo) {
        boolean existencia = false;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                existencia = true;
            }
        }
        return existencia;
    }




    

    /**
     * Metodo para mostrar los reportes
     */
    public void operarReportes() {
        imprimir("--------------------");
        imprimir("Acceso a Reportes:");
        imprimir("1. Reporte estudiante con mas prestamos.");
        imprimir("2. Reporte dinero recaudado por la biblioteca.");
        imprimir("3. Reporte total de dinero a pagar a los bibliotecarios.");
        imprimir("4. Regresar.");
        int opcion = ingresarEntero("¿Que deseas realizar?:");
        switch (opcion) {
            case 1:
                EstudianteMasPrestamos();
                operarReportes();
                break;
            case 2:
                double dinero = ganancia + dineroRecaudado();
                imprimir("Dinero recaudado: " + dinero);
                operarReportes();
                break;
            case 3:
                double total = 0;
                for (Bibliotecario bibliotecario : bibliotecarios) {
                    double valorPago = bibliotecario.calcularPago(bibliotecario);
                    total += valorPago;
                }
                imprimir("Dinero a pagar: " + total);
                operarReportes();
                break;
            case 4:
                menu();
                break;
            default:
                imprimir("Opcion incorrecta. Intente de nuevo.");
                operarEstudiante();
                break;
        }
    }

    /**
     * Metodo que obtiene el estudiante con mayor numero de prestamos
     */
    public void EstudianteMasPrestamos() {
        if (estudiantes.size() > 0) {
            int mayor = 0;
            int contador = 0;
            Estudiante estudianteMasPrestamos = null;
            for (Prestamo prestamo : prestamos) {
                if (estudiantes.contains(prestamo.getEstudiante())) {
                    contador = prestamo.getEstudiante().getPrestamos().size();
                }
                if (contador > mayor) {
                    mayor = contador;
                    estudianteMasPrestamos = prestamo.getEstudiante();
                }
            }
            imprimir(estudianteMasPrestamos.toString());
        } else {
            imprimir("No existen estudiantes aun en biblioteca.");
        }
    }

    /**
     * Metodo para calcular el dinero obtenido en total por medio de los prestamos
     * 
     * @return Dinero Total
     */
    public int dineroRecaudado() {
        int dineroTotalRecaudado = 0;
        for (Prestamo prestamo : prestamos) {
            int dinero = prestamo.total();
            dineroTotalRecaudado += dinero;
        }
        return dineroTotalRecaudado;
    }

    /**
     * Metodo para imprimir una cadena
     * 
     * @param mensaje
     */
    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Metodo para ingresar un numero entero por consola
     * 
     * @param mensaje
     * @return numero entero
     */
    public static int ingresarEntero(String mensaje) {
        imprimir(mensaje);
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int entero = scanner.nextInt();
        return entero;
    }

    /**
     * Metodo para ingresar una cadena por consola
     * 
     * @param mensaje
     * @return
     */
    public static String ingresarTexto(String mensaje) {
        imprimir(mensaje);
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        return texto;
    }

    /**
     * Metodo para obtener el nombre de la biblioteca
     * 
     * @return nombre biblioteca
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para cambiar el nombre de la biblioteca
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la lista de estudiantes
     * 
     * @return lista de estudiantes
     */
    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Metodo para cambiar la lista de estudiantes
     * 
     * @param estudiantes
     */
    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Metodo para obtener la lista de bibliotecarios
     * 
     * @return lista de bibliotecarios
     */
    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    /**
     * Metodo para cambiar la lista de bibliotecarios
     * 
     * @param bibliotecarios
     */
    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    /**
     * Metodo para obtener la lista de prestamos
     * 
     * @return lista de prestamos
     */
    public LinkedList<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo para cambiar la lista de prestamos
     * 
     * @param prestamos
     */
    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Metodo para obtener la lista de libros
     * 
     * @return lista de libros
     */
    public LinkedList<Libro> getLibros() {
        return libros;
    }

    /**
     * Metodo para cambiar la lista de libros
     * 
     * @param libros
     */
    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para obtener la ganancia de la biblioteca
     * 
     * @return ganancia biblioteca
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * Metodo para cambiar la ganancia de la biblioteca
     * 
     * @param ganancia
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * Metodo para obtener la cantidad de libros de la biblioteca
     * 
     * @return cantidad de libros de la bilioteca
     */
    public int getCantidadLibros() {
        return cantidadLibros;
    }

    /**
     * Metodo para cambiar la cantidad de libros de la biblioteca
     * 
     * @param cantidadLibros
     */
    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", estudiantes=" + estudiantes + ", bibliotecarios=" + bibliotecarios
                + ", prestamos=" + prestamos + ", libros=" + libros + ", ganancia=" + ganancia + ", cantidadLibros="
                + cantidadLibros + "]";
    }

}