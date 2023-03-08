package tarea;
import java.util.Scanner;


public class pruebaFecha {
    public static void main(String[] args){

try (Scanner sc = new Scanner (System.in)) {
    int dia,mes,acso;
    
    
    System.out.println("Introduce la fecha:");
    System.out.print("digita el dia:");
    dia=sc.nextInt(  );
    System.out.print("digita el mes:");
    mes=sc.nextInt(  );
    System.out.print("digita el año:");
    acso=sc.nextInt(  );
         
    Fecha fecha= new Fecha(dia, mes, acso);
    
    fecha.mostrarFecha();

    
 }
}
}
  