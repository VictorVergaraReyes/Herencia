package Herencia;

public class Persona {
    int id;
    String curp;
    String Nombre;
    String Apellido;
    String Domicilio;
    String Telefono;
    
    // Constructor
    public Persona(int id, String curp, String Nombre, String Apellido, String Domicilio, String Telefono) {
        this.id = id;
        this.curp = curp;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
    }

    
    // Getters Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
