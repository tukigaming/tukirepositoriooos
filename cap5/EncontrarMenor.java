package cap5;

import java.util.Scanner;

public class EncontrarMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer el primer valor que indica la cantidad de enteros
        System.out.print("Ingrese la cantidad de enteros a comparar: ");
        int cantidad = sc.nextInt();
        
        // Inicializar la variable menor con un valor grande
        int menor = Integer.MAX_VALUE;
        
        // Leer los enteros y compararlos con la variable menor
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el entero #" + i + ": ");
            int num = sc.nextInt();
            if (num < menor) {
                menor = num;
            }
        }
        
        // Mostrar el valor menor encontrado
        System.out.println("El valor menor es: " + menor);
    }
}
