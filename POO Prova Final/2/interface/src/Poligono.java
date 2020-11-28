import java.lang.Math;

public interface Poligono{
    void getArea();
  
 // Calcula o perimetro do poligono
   default void getPerimetetro(int... lados) {
      int perimetro = 0;
      for (int lado: lados) {
         perimetro += lado;
      }

   System.out.println("Perímetro: " + perimetro);
   }

}