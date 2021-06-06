import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args){
    ArrayList<Integer> numeros = new ArrayList();
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    System.out.println("Lista corta");
    System.out.println("Tamaño: "+numeros.size());
    for( int i : numeros){
      System.out.println(i);
    }
    numeros.add(0, 0);
    numeros.add(6);
    System.out.println("Lista larga");
    System.out.println("Tamaño: "+numeros.size());
    for (int i: numeros){
      System.out.println(i);
    }
  }
}
