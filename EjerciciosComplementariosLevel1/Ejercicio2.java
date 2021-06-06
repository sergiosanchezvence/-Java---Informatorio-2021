import java.util.Scanner;
public class Ejercicio2{
  public static void main(String args []){
    Scanner numeros = new Scanner (System.in);
    int num1,num2,suma,resta,multiplicacion,division,modulo;
    System.out.println("Ingrese el primer numero: ");
    num1=numeros.nextInt();

    System.out.println("Ingrese el segundo numer: ");
    num2=numeros.nextInt();
    suma = num1 + num2;
    resta= num1-num2;
    multiplicacion=num1*num2;
    division=num1/num2;
    modulo=num1%num2;
   
    System.out.println( num1 + " + " +num2 + " = " + suma);
    System.out.println( num1 + " - " +num2 + " = " + resta);
    System.out.println( num1 + " * " +num2 + " = " + multiplicacion);
    System.out.println( num1 + " / " +num2 + " = " + division);
    System.out.println( num1 + " % " +num2 + " = " + modulo);
  }
}