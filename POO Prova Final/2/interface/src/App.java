import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2, 3, 4);
        // chama o método das classe Triangulo
        t1.getArea();
        //// chama o método do Poligono
        t1.getPerimetetro(2, 3, 4);
    }
}
