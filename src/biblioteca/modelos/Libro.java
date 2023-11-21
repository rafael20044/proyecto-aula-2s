package biblioteca.modelos;

public class Libro {
    private String nombre;
    private String autor;
    private String codigo;


    public Libro(String nombre, String autor, String codigo) {
        this.nombre = nombre;
        this.autor = autor;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return   "nombre: " + nombre + ", autor: " + autor + " , codigo: " + codigo + "\n";
    }
    
    
}
