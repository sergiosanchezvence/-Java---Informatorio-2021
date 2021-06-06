import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
  public static void main(String[] args){
    ArrayList<String> cartas= new ArrayList<>();
    for (int i = 0; i<13;i++){
      cartas.add("Carta "+(i+1));
    }
    System.out.println("ordenado");
    for (String lista: cartas){
      System.out.println(lista);
    }
    Collections.reverse(cartas);
    System.out.println("orden inverso");
    for (String lista: cartas){
      System.out.println(lista);
    }
    Collections.shuffle(cartas);
    System.out.println("aleatorio");
    for(String lista: cartas){
      System.out.println(lista);
    }
  }
}
