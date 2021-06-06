import java.util.Scanner;
public class Ejercicio6 {
  public static void main (String[] args){
    int num1, num2, num3, num4;
    Scanner numero = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    num1=numero.nextInt();
    System.out.println("Ingrese un segundo numero: ");
    num2=numero.nextInt();
    num3=num1;
    num4=1;

    while(num4!=num2){
      num3*=num1;
      num4++;
    }
    System.out.println(num1+" elevado a "+num2+" = "+num3);
  }
}
