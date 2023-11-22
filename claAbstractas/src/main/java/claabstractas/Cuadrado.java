package claabstractas;

public class Cuadrado implements Figura, Dibujable{
private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }
 
    
    
}
