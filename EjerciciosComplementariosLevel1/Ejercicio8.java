import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args){
    String Nombre, Edad, Direccion, Ciudad;
    Scanner nombreya = new Scanner (System.in);
    System.out.println("Ingrese Nombre y Apellido: ");
    Nombre=nombreya.nextLine();
    Scanner años = new Scanner (System.in);
    System.out.println("Ingrese Edad: ");
    Edad=años.nextLine();
    Scanner direc = new Scanner (System.in);
    System.out.println("Ingrese Direccion: ");
    Direccion=direc.nextLine();
    Scanner ciu = new Scanner (System.in);
    System.out.println("Ingrese Ciudad: ");
    Ciudad=ciu.nextLine();

    System.out.println(Ciudad);
    System.out.println(Direccion);
    System.out.println(Edad);
    System.out.println(Nombre);
  }
}