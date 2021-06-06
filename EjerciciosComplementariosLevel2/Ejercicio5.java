import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] dias = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
    ArrayList<Integer> horas = new ArrayList<>();
    ArrayList<Integer> precios = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
        System.out.println(dias[i]);
        System.out.print("Cantidad de horas trabajadas: ");
        horas.add(scanner.nextInt());

        System.out.print("Precio por hora trabajada: ");
        precios.add(scanner.nextInt());
    }

    ArrayList<Integer> preciototal = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      preciototal.add(horas.get(i) * precios.get(i));
    }

    int cant = 0;
    for (int i = 0; i < 5; i++) {
        cant += preciototal.get(i);
        System.out.println(dias[i] + ": " + preciototal.get(i));
    }

    System.out.print("\nTotal final: $" + cant);
  }
}
