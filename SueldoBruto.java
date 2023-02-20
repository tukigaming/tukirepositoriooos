

import java.util.Scanner;


public class SueldoBruto {

    public void calcularSueldo() {
        
        Scanner entrada = new Scanner(System.in);

    
        int contador = 0;
    
        int horas = 0;
    
        double tarifa = 0.0;
    
        double sueldo = 0.0;

      
        while ( contador < 3) {
            System.out.println("Las horas trabajadas del empleado "
                    + (contador + 1) + ": ");
            horas = entrada.nextInt();
            System.out.println("La tarifa por hora: ");
            tarifa = entrada.nextDouble();

            if ( horas <= 40 ) {
                sueldo = horas * tarifa;
            } else {
                sueldo = (40 * tarifa) + (horas-40) * (tarifa*1.5) ;
            }

            System.out.println("El sueldo del empleado " + (contador + 1)
                    + " es: " + sueldo);

            contador++;
            entrada.close();
        }
    }
}