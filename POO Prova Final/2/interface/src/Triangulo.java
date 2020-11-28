import java.lang.Math;

public class Triangulo implements Poligono {
    private int a, b, c;
    private double s, area;

    // Inicializando lados de um triangulo
    Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    // Calcula a area de um triangulo
   public void getArea() {
        s = (double) (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Área: " + area);
    }
}

