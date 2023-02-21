package cap5;

import java.util.Scanner;

public class ImprimirRomboModificado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número impar entre 1 y 19: ");
        int n = input.nextInt();

        while (n % 2 == 0 || n < 1 || n > 19) {
            System.out.print("El número ingresado no es válido. Ingrese un número impar entre 1 y 19: ");
            n = input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.abs(n/2 - i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - 2 * Math.abs(n/2 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}