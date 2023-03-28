import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Triángulo #" + i);

            System.out.print("Ingrese la longitud del primer cateto: ");
            double cateto1 = input.nextDouble();

            System.out.print("Ingrese la longitud del segundo cateto: ");
            double cateto2 = input.nextDouble();

            double hipotenusa = hipotenusa(cateto1, cateto2);

            System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
            System.out.println();
        }
    }

    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
}