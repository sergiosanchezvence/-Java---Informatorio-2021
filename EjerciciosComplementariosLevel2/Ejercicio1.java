import java.util.ArrayList;

public class Ejercicio1 {
  public static void main(String[] args){
    ArrayList<String> rank = new ArrayList<>();
    rank.add("Bariloche");
    rank.add("Córdoba");
    rank.add("Resistencia");
    for (int i = 0; i < rank.size(); i++){
      System.out.println("#"+(i+1)+" - "+rank.get(i));
    }
  }
}
