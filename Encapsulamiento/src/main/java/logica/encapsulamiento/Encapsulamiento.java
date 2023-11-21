package logica.encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(21,"Gilaxo","Fortacho");
        
        System.out.println("id: " + alu2.getId());
    }
}
