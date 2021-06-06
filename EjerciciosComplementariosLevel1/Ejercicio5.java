import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String[] args){
    int num1,num2,contador,resultado;
    Scanner numero=new Scanner(System.in);
    System.out.println("Ingrese el primer numero: ");
    num1=numero.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    num2=numero.nextInt();
    contador=0;
    resultado=0;

    while(contador!=num2){
      resultado+=num1;
      contador=contador+1;
    }
    System.out.println(num1+" * "+num2+" = "+resultado);
  }
}
