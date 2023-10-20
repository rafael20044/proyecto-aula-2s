
package biblioteca.Modelo;

public class Persona {
    public String nombre;
    public String apellido;
    public String carrera;
    public String semestre;
    public String correo;
    public String telefono;
    public int cedula;
    
    public String toString(){
        String Datos = "";
        Datos += "NOMBRE: " + nombre + "---";
        Datos += "APELLIDO: " + apellido+ "---";
        Datos += "CEDULA: "+cedula+"---";  
        Datos += "CARRERA: " + carrera+ "---";
        Datos += "SEMESTRE: " + semestre+ "---";
        Datos += "CORREO: " + correo+ "---";
        Datos += "TELEFONO: " + telefono+ "---";
        
        
        return Datos;
    }
}
