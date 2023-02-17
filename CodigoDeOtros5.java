package mx.generation;

import java.util.Scanner;

public class CodigoDeOtros5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // Se pasa System.in como arg a Scanner.

    System.out.print("Introduzca un número: "); // Se cambió la comilla simple por una doble.
    String ni = s.nextLine();
    int c = Integer.parseInt(ni); // Se convirte el String a un entero usando Integer.parseInt().

    int afo = 0;
    int noAfo = 0;

    while (c > 0) { // Colocamos la variable 'c' para el bucle while en lugar de ni.
      int digito = c % 10; // c en vez de ni.
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
        afo++;
      } else {
        noAfo++;
      }
      c /= 10; // Se cambia c en vez de ni.
    }

    if (afo > noAfo) {
      System.out.println("El " + ni + " es un número afortunado."); // Se usa ni en vez de c.
    } else {
      System.out.println("El " + ni + " no es un número afortunado."); // Usamos ni en vez de c.
    }
  }
}