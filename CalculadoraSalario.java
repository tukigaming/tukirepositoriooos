
import java.util.Scanner;

public class CalculadoraSalario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horasTrabajadas;
    double tarifaHora, sueldoBruto;

    for (int i = 1; i <= 3; i++) {
      System.out.printf("Empleado %d: %n", i);

      System.out.print("Horas trabajadas: ");
      horasTrabajadas = sc.nextInt();

      System.out.print("Tarifa por hora: ");
      tarifaHora = sc.nextDouble();

      if (horasTrabajadas <= 40) {
        sueldoBruto = horasTrabajadas * tarifaHora;
      } else {
        sueldoBruto = (40 * tarifaHora) + ((horasTrabajadas - 40) * (tarifaHora * 1.5));
      }

      System.out.printf("Sueldo bruto del empleado %d: $%.2f%n%n", i, sueldoBruto);
    }

    sc.close();
  }
}