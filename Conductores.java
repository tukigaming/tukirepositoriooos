import java.util.Scanner;


 
public class Conductores {

  
    public void calcularKmLitro() {
     
        Scanner entrada = new Scanner(System.in);

      
        double kilometros = 0;
      
        double litros = 0;
        
        double totalKilometros = 0;
       
        
        
        double totalLitros = 0;

        System.out.println("Deme el número de kilómetros recorridos: ");
        kilometros = entrada.nextDouble();

       
        
        while(kilometros > 0) {
            System.out.println("Deme el número de litros usados: ");
            litros = entrada.nextDouble();

            totalKilometros += kilometros;
            totalLitros += litros;

            System.out.println("Kilometros-Litros para este "
                    + "reabastecimiento: " + kilometros / litros);

            System.out.println("Kilometros-Litros para todo "
                    + "el recorrido: " + totalKilometros / totalLitros);

            System.out.println(
                    "Deme el número de kilómetros recorridos: ");
            kilometros = entrada.nextDouble();
            entrada.close();
        }
    }


    public static void main(String[] args) {
        Conductores conductor = new Conductores();
        conductor.calcularKmLitro();
    }
}