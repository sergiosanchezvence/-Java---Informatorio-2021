import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args){
    Scanner numero = new Scanner(System.in);
    int a=1, num;
    System.out.println("Ingrese un numero: ");
    num = numero.nextInt();
    while(a <= num){
      System.out.println(a);
      a++;
    }
  }
}
