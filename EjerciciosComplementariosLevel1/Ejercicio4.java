import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args){
    Scanner numero = new Scanner(System.in);
    int num, fractorial=1;
    System.out.println("Ingrese un numero: ");
    num=numero.nextInt();
    for (int i = num; i>0; i--){
      fractorial= fractorial*i;

    }
    System.out.println("El fractorial de: "+num+" es: "+fractorial);
  }

}
