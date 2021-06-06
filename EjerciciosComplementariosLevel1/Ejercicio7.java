import java.security.cert.X509CRLEntry;
import java.util.Scanner;

public class Ejercicio7 {
  public static void main (String[] args){
    String pala;
    Scanner palabra = new Scanner (System.in);
    System.out.println("Ingrese una palabra: ");
    pala=palabra.nextLine();
    char letra;

    for (int x=0;x<pala.length();x++){
      letra=pala.charAt(x);
      if(letra >= 97){
        letra -=32;
      }
      System.out.println(letra);
    }
  }
}
