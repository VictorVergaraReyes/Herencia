package Herencia;

public class Empleado extends Persona{
    int num_empleado;
    String cargo;
    Double Sueldo;
    
    //Constructor
    public Empleado(){};

    public Empleado(int num_empleado, String cargo, Double Sueldo, int id, String curp, String Nombre, String Apellido, String Domicilio, String Telefono) {
        super(id, curp, Nombre, Apellido, Domicilio, Telefono);
        this.num_empleado = num_empleado;
        this.cargo = cargo;
        this.Sueldo = Sueldo;
    }
    
    
    // Getters Setters
    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
    
}
