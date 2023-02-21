import java.util.Scanner;

public class CuadradoAsteriscos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el tamaño del lado del cuadrado (entre 1 y 20): ");
    int lado = sc.nextInt();

    if (lado < 1 || lado > 20) {
      System.out.println("Tamaño del lado inválido");
      return;
    }

    for (int i = 1; i <= lado; i++) {
      for (int j = 1; j <= lado; j++) {
        if (i == 1 || i == lado || j == 1 || j == lado) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}