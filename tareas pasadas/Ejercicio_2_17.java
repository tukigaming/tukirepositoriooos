import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_2_17
{

public static void main(String[] args) throws InterruptedException, IOException
{

Scanner entrada = new Scanner(System.in);
int num1;
int num2;
int num3;
int suma;
int promedio;
int producto;



System.out.print("Ingrese el primer numero entero: ");
num1 = entrada.nextInt();

System.out.print("Ingrese el segundo numero entero: ");
num2 = entrada.nextInt();

System.out.print("Ingrese el tercer numero entero: ");
num3 = entrada.nextInt();
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

suma = num1 + num2 + num3;
promedio = suma / 3;
producto = num1 * num2 * num3;

if (num1 > num2 && num1 > num3)
System.out.printf("la suma  es: %d\nEl promedio es: %d\nEl producto es: %d\n %d es el mayor  ",
suma,promedio, producto, num1);

if (num2 > num1 && num2 > num3)
System.out.printf("la suma  es: %d\nEl promedio es: %d\nEl producto es: %d\n %d es el mayor  ",
suma,promedio, producto, num2);
if (num3 > num1 && num3 > num2)
System.out.printf("la suma  es: %d\nEl promedio es: %d\nEl producto es: %d\n %d es el mayor \n ",
suma,promedio, producto, num3);

if (num1 < num2 && num1 < num3)
System.out.printf("%d es el menor de los numeros ", num1);

if (num2 < num1 && num2 < num3)
System.out.printf("%d es el menor de los numeros ",num2);
if (num3 < num1 && num3 < num2)
System.out.printf("%d es el menor de los numeros ",num3);


entrada.close();
}

}