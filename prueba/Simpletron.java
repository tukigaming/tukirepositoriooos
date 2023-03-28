package prueba;

import java.util.Scanner;

public class Simpletron {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] memory = new float[1000];
        int acumulador = 0;
        int contadorDeInstrucciones = 0;
        int codigoDeOperacion = 0;
        int operando = 1000;
        int registroDeInstruccion = 0;
        
        
        System.out.println("* Bienvenido a Simpletron! *");
        System.out.println("* Por favor, introduzca en su programa una instruccion *");
        System.out.println("* (o palabra de datos) a la vez. Yo le mostrare *");
        System.out.println("* el numero de ubicacion y un signo de interrogacion (?) *");
        System.out.println("* Entonces usted escribira la palabra para esa ubicacion. *");
        System.out.println("* Teclee -9999 para dejar de introducir su programa. *");
        
        // Carga del programa en memoria
        do {
            System.out.printf("%02d ? ", contadorDeInstrucciones);
            int instruccion = input.nextInt();
            if (instruccion == -99999) {
                break;
            }
            memory[contadorDeInstrucciones] = instruccion;
            contadorDeInstrucciones++;
            
        } while (contadorDeInstrucciones < 1000);
        
        System.out.println("* Se completo la carga del programa *");
        System.out.println("* Empieza la ejecucion del programa *");
        
        // Ejecución del programa en Simpletron
        contadorDeInstrucciones = 0;

        while (codigoDeOperacion != 43) {
            registroDeInstruccion = (int) memory[contadorDeInstrucciones];
            codigoDeOperacion = registroDeInstruccion / 100;
            operando = registroDeInstruccion % 100;
            
            switch (codigoDeOperacion) {
                case 10: // Leer
                    System.out.print("Ingrese un entero: ");
                    int numero = input.nextInt();
                    memory[operando] = numero;
                    break;
                case 11: // Escribir
                    System.out.printf("El contenido de la ubicacion %02d es %d%n", operando, memory[operando]);
                    break;
                case 20: // Cargar
                    acumulador = memory[operando];
                    break;
                case 21: // Almacenar
                    memory[operando] = acumulador;
                    break;
                case 30: // Sumar
                    acumulador += memory[operando];
                    if (acumulador > 9999 || acumulador < -99999) {
                        System.out.println("* ERROR: Desbordamiento del acumulador *");
                        System.exit(1);
                    }
                    break;
                case 31: // Restar
                    acumulador -= memory[operando];
                    if (acumulador > 9999 || acumulador < -99999) {
                        System.out.println("* ERROR: Desbordamiento del acumulador *");
                        System.exit(1);
                    }
                    break;
                case 32: // Dividir
                    if (memory[operando] == 0) {
                        System.out.println("* ERROR: Division por cero *");
                        System.exit(1);
                    }
                    acumulador /= memory[operando];
                    break;
                    case 33: // residuo
                    if (memory[operando] == 0) {
                        System.out.println("* ERROR: Division por cero *");
                        System.exit(1);
                    }
                    acumulador %= memory[operando];
                    break;

                    case 14:
                    double base,expo,resut;
                    base=acumulador;
                    expo=memory[operando];
                    resut=Math.pow(base,expo);
                    acumulador=(int )resut;
                    break; 

                    case 15:
                    String hex = Integer.toHexString( (int) memory[operando]);
                    String resul = hex.toUpperCase();
                    System.out.println(resul);
                    break;

                    case 16:
                    base=acumulador;
                    expo=memory[operando];
                    System.out.println("");
                    break;

                    case 17:
                    int length = (int) (memory[codigoDeOperacion] / 100); // Obtener la longitud de la cadena
                    StringBuilder sb = new StringBuilder();
                    System.out.println(sb.toString());
                    break; 

                    case 18:
                    System.out.print("Ingrese una cadena: ");
                    String inputString = scanner.nextLine();
                    int stringLength = inputString.length();
                    memory[operando] = stringLength;

                    for (int i = 0; i < stringLength; i++) {
                        char c = inputString.charAt(i);
                        memory[operando + i + 1] = (int) c;
                    }

                    contadorDeInstrucciones++;
                    break;


                    case 19: // PRINT_STRING
                    int address = memory[acumulador].getAddress();
                    int length = memory[address].getWord() / 10000; // la primera mitad de la palabra es la longitud de la cadena
                        int asciiChar;
                    String str = "";
                    for (int i = 1; i <= length; i++) { // recorremos la cadena de caracteres
                        asciiChar = memory[address + i].getWord(); // cada media palabra subsiguiente es un carácter ASCII
                        str += Character.toString((char) asciiChar); 
                    }
                    System.out.println(str); 
                    acumulador++;
                    break;
                    




            }
            contadorDeInstrucciones++;
        } 
    }
} 