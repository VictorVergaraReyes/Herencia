package logica;
public class POO {

    public static void main(String[] args) {
         Alumno alu1 = new Alumno(5, "Paul", "Atreides");
         System.out.println(alu1.getNombre() + " " + alu1.getApellido() + " " + alu1.getId() );   
        //System.out.println("Hola ");
        
        alu1.setId(10);
        alu1.setNombre("Frank");
        alu1.setApellido("Herbert");
        System.out.println(alu1.getNombre() + " " + alu1.getApellido() + " " + alu1.getId() );   
    }
}
