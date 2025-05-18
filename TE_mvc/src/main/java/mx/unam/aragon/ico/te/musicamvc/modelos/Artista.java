package mx.unam.aragon.ico.te.musicamvc.modelos;

import java.util.Objects;

public class Artista {
    private int id;
    private String nombre;
    private String genero;
    private Integer edad;
    private String descripcion;
    private String imagen;

    public Artista() {
    }

    public Artista(String descripcion, Integer edad, String genero, int id, String imagen, String nombre) {
        this.descripcion = descripcion;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return id == artista.id && Objects.equals(nombre, artista.nombre) && Objects.equals(genero, artista.genero) && Objects.equals(edad, artista.edad) && Objects.equals(descripcion, artista.descripcion) && Objects.equals(imagen, artista.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, genero, edad, descripcion, imagen);
    }

    @Override
    public String toString() {
        return "Artista{" +
                "descripcion='" + descripcion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
