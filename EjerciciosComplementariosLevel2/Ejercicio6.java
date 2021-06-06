import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
  public static void main (String[] args){
    HashSet<Empleado> empleadoHashSet = new HashSet<>();
    HashMap<Integer, Float> salarios = new HashMap<>();

    empleadoHashSet.add(new Empleado("Empleado 1", 35644896, 1, 35000));
    empleadoHashSet.add(new Empleado("Empleado 2", 30000115, 2, 65000));
    empleadoHashSet.add(new Empleado("Empleado 3", 12312312, 3, 12312));
    empleadoHashSet.add(new Empleado("Empleado 4", 00000001, 4, 10000));

    for (Empleado x : empleadoHashSet) {
        salarios.put(x.getDni(), x.getSalario());
    }

    salarios.forEach((dni, salario) -> System.out.println("D.N.I.: " + dni + " - Sueldo: " + salario));
}
}

class Empleado {
String nombre;
int dni;
float horas;
float precio;

public Empleado(String nombre, int dni, float horas, float precio) {
    this.nombre = nombre;
    this.dni = dni;
    this.horas = horas;
    this.precio = precio;
}

public int getDni() {
    return dni;
}

public float getSalario() {
    return this.horas * this.precio;
  }
}
