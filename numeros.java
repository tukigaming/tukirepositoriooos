import java.util.Scanner;

public class numeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int mayor = Integer.MIN_VALUE;
    int segundoMayor = Integer.MIN_VALUE;

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      int numero = sc.nextInt();

      if (numero > mayor) {
        segundoMayor = mayor;
        mayor = numero;
      } else if (numero > segundoMayor) {
        segundoMayor = numero;
      }
    }

    System.out.println("El mayor número es: " + mayor);
    System.out.println("El segundo mayor número es: " + segundoMayor);
  }
}
