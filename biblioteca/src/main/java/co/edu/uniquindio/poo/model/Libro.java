package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Libro {

    private String codigo, isbn, autor, editorial, titulo;
    private LocalDate fechaPublicacion;
    private boolean estado;
    private int unidadesDisponibles;

    /**
     * Metodo constructor de la clase libro
     * 
     * @param codigo
     * @param isbn
     * @param autor
     * @param editorial
     * @param titulo
     * @param fechaPublicacion
     * @param unidadesDisponibles
     */
    public Libro(String codigo, String isbn, String autor, String editorial, String titulo, LocalDate fechaPublicacion,
            int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    /**
     * Metodo para cambiar el estado de disponibilidad del libro
     */
    public void cambiarEstado() {
        if (unidadesDisponibles != 0) {
            this.estado = true;
        } else {
            this.estado = false;
        }
    }

    /**
     * Metodo para obtener el codigo del libro
     * 
     * @return codigo del libro
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para cambiar el codigo del libro
     * 
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener el isbn del libro
     * 
     * @return isbn del libro
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Metodo para cambiar el isbn del libro
     * 
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Metodo para obtener el autor
     * 
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Metodo para cambiar el autor
     * 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo para obtener la editorial
     * 
     * @return editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Metodo para cambiar la editorial
     * 
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Metodo para obtener el titulo del libro
     * 
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo para cambiar el titulo del libro
     * 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo para obtener la fecha de publicacion
     * 
     * @return
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Metodo para cambiar la fecha de publicacion
     * 
     * @param fechaPublicacion
     */
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Metodo para obtener el estado del libro
     * 
     * @return estado
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Metodo para cambiar el estado del libro
     * 
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Metodo para obtener las unidades disponibles
     * 
     * @return unidades disponibles
     */
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    /**
     * Metodo para cambiar las unidades disponibles
     * 
     * @param unidadesDisponibles
     */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial
                + ", titulo=" + titulo + ", fechaPublicacion=" + fechaPublicacion + ", estado=" + estado
                + ", unidadesDisponibles=" + unidadesDisponibles + "]";
    }

}