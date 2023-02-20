import java.util.Scanner;
 public class Ejercicio 

 {        
  public static void main( String args[] )
  {       
  try (Scanner entrada = new Scanner(System.in)) {
	int numero1;
	  int numero2;
	  int suma;
	  int producto;
	  int diferencia;
	  int cociente;
	
	  System.out.print("\nEste programa recibe dos numeros y da su producto, cociente, suma y resta.\n");
	
	  System.out.println("Introduzca el primer numero: ");
	  numero1 = entrada.nextInt();
	
	  System.out.println("Introduzca el segundo numero: ");
	  numero2 = entrada.nextInt();
	
	  suma = numero1 + numero2;
	  diferencia = numero1 - numero2;
	  producto = numero1*numero2;
	  cociente = numero1/numero2;
	
	  System.out.printf("\nLa suma de los numeros es: %d\n", suma);
	  System.out.printf("\nLa resta de los numeros es: %d\n", diferencia);
	  System.out.printf("\nEl producto de los numeros es: %d\n", producto);
	  System.out.printf("\nEl cociente de los numeros es: %d\n", cociente);
}

   }       
 }