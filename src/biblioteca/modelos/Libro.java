package biblioteca.modelos;

public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private String codigo;
    private String año;

    public Libro(String nombre, String autor, String editorial, String codigo, String año) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.codigo = codigo;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libro: " + "nombre: " + nombre + ", autor: " + autor + ", editorial: " + editorial + ", codigo: " + codigo + ",año: " + año +"\n"+ '}';
    }
    
    
}
