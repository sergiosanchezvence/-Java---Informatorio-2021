import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
  public static void main(String[] args){
    ArrayList<String> estudiantes= new ArrayList<>();
    estudiantes.add("Raul");
    estudiantes.add("Susana");
    estudiantes.add("Carlos");
    estudiantes.add("Ivan");
    estudiantes.add("Natalia");
    estudiantes.add("Valeria");
    estudiantes.add("Pedro");
    estudiantes.add("Rodrigo");
    estudiantes.add("Carla");
    estudiantes.add("Andrea");
    estudiantes.add("Silvio");
    estudiantes.add("Florencia");
    
    List<String> curso1 = estudiantes.subList(0,4);
    List<String> curso2 = estudiantes.subList(4,8);
    List<String> curso3 = estudiantes.subList(8,12);

    System.out.println("Curso 1:");
    for (String lista: curso1){
      System.out.println(lista);
    }
    System.out.println("Curso 2: ");
    for (String lista: curso2){
      System.out.println(lista);
    }
    System.out.println("Curso 3: ");
      for(String lista: curso3){
        System.out.println(lista);
      }
    }
  }
