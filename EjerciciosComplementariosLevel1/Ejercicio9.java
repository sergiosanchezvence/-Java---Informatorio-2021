import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args){
    String frase, letra;
    char letras;
    int cant=0;
    Scanner datos = new Scanner (System.in);
    System.out.println("Ingrese frase: ");
    frase=datos.nextLine();
    System.out.println("Ingrese una letra: ");
    letra=datos.nextLine();
    for (int x=0;x<frase.length();x++){
      letras=frase.charAt(x);
      if(letras == letra.charAt(0)){
        cant=cant+1;
      }
    }
    System.out.println(cant);
  }
}