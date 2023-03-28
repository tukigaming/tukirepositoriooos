import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] memory = new int[1000];
        double acumulador = 0;
        int contadorDeInstrucciones = 0;
        int codigoDeOperacion = 0;
        int operando = 0;
        int registroDeInstruccion = 0;

        System.out.println("* Bienvenido a Simpletron! *");
        System.out.println("* Por favor, introduzca en su programa una instruccion *");
        System.out.println("* (o palabra de datos) a la vez. Yo le mostrare *");
        System.out.println("* el numero de ubicacion y un signo de interrogacion (?) *");
        System.out.println("* Entonces usted escribira la palabra para esa ubicacion. *");
        System.out.println("* Teclee -9999 para dejar de introducir su programa. *");

        // Carga del programa en memoria
        do {
            System.out.printf("%03d ? ", contadorDeInstrucciones);
            int instruccion = input.nextInt();
            if (instruccion == -9999) {
                break;
            }
            memory[contadorDeInstrucciones] = instruccion;
            contadorDeInstrucciones++;
        } while (contadorDeInstrucciones < 1000);

        System.out.println("* Se completo la carga del programa *");
        System.out.println("* Empieza la ejecucion del programa *");

        // Ejecución del programa en Simpletron
        contadorDeInstrucciones = 0;
        while (true) {
            registroDeInstruccion = memory[contadorDeInstrucciones];
            codigoDeOperacion = registroDeInstruccion / 100;
            operando = registroDeInstruccion % 100;
            switch (codigoDeOperacion) {
                case 10: // Leer
                System.out.print("Ingrese un entero: ");
                    int numero = input.nextInt();
                    memory[operando] = numero;
                    break;
                case 11: // Escribir
                    System.out.printf("El contenido de la ubicacion %03d es %d%n", operando, memory[operando]);
                    break;
                case 12: // Nueva línea
                    System.out.println();
                    break;
                case 20: // Cargar
                    acumulador = memory[operando];
                    break;
                case 21: // Almacenar
                    memory[operando] = (int) acumulador;
                    break;
                case 30: // Sumar
                    acumulador += memory[operando];
                    break;
                case 31: // Restar
                    acumulador -= memory[operando];
                    break;
                case 32: // Dividir
                    if (memory[operando] == 0) {
                        System.out.println("* ERROR: Division por cero *");
                        System.exit(1);
                    }
                    acumulador /= memory[operando];
                    break;
                case 33: // Residuo
                    acumulador %= memory[operando];
                    break;
                case 34: // Exponenciación
                    acumulador = Math.pow(acumulador, memory[operando]);
                    break;
                // Agregar aquí las instrucciones adicionales para manejar cadenas
                // ...
            }
            contadorDeInstrucciones++;
        }
    }
}