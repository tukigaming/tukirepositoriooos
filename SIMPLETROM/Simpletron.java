package SIMPLETROM;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simpletron {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] memory = new float[1000]; // La memoria es un array de 1000 enteros
        int acumulador = 0; // El acumulador comienza en cero
        int contadorDeInstrucciones = 0; // Contador de instrucciones
        int registroDeInstruccion=0; // Registro de instrucción
        int codigoDeOperacion=0; // Código de operación
        int operando; // Operando

        System.out.println("* Bienvenido a Simpletron *");
        System.out.println("* Por favor ingrese el nombre del archivo que contiene su programa *");

        String fileName = input.nextLine();
        File inputFile = new File(fileName);

        try {
            Scanner fileInput = new Scanner(inputFile);

            // Cargar el programa en la memoria
            int i = 0;
            while (fileInput.hasNext()) {
                memory[i] = fileInput.nextInt();
                i++;
            }
            fileInput.close();

            System.out.println("* Programa cargado correctamente *");

            // Ejecutar el programa
            contadorDeInstrucciones = 0;
            do {
                // Obtener la siguiente instrucción de la memoria
                registroDeInstruccion = (int) memory[contadorDeInstrucciones];
                codigoDeOperacion = registroDeInstruccion / 100;
                operando = registroDeInstruccion % 100;

                // Realizar la operación correspondiente
                switch (codigoDeOperacion) {
                    case 10: // Leer un número del teclado
                        System.out.print("Ingrese un número: ");
                        memory[operando] = input.nextInt();
                        break;
                    case 11: // Imprimir un número en pantalla
                        System.out.printf("%d%n", memory[operando]);
                        break;

                    case 14:
                    double base,expo,resut;
                    base=acumulador;
                    expo=memory[operando];
                    resut=Math.pow(base,expo);
                    acumulador=(int )resut;
                    break; 
                    case 17: // residuo
                    if (memory[operando] == 0) {
                        System.out.println("* ERROR: Division por cero *");
                        System.exit(1);
                    }
                    case 15:
                    String hex = Integer.toHexString( (int) memory[operando]);
                    String resul = hex.toUpperCase();
                    System.out.println(resul);
                    break;
                        
                    case 16:
                         base = acumulador;
                         expo = memory[operando];
                        System.out.println("");
                        break;
                    case 20: // Cargar un número en el acumulador
                        acumulador = (int) memory[operando];
                        break;
                    case 21: // Sumar un número al acumulador
                        acumulador +=  memory[operando];
                        break;
                    case 22: // Restar un número al acumulador
                        acumulador -= memory[operando];
                        break;
                    case 30: // Almacenar el acumulador en la memoria
                        memory[operando] = acumulador;
                        break;
                    case 31: // Cargar un número de la memoria al acumulador
                        acumulador = (int) memory[operando];
                        break;
                    case 32: // Leer una cadena del teclado
                        System.out.print("Ingrese una cadena: ");
                        String inputString = input.nextLine();
                        int stringLength = inputString.length();
                        memory[operando] = stringLength;
                        for (int j = 0; j < stringLength; j++) {
                            char c = inputString.charAt(j);
                            memory[operando + 1 + j / 2] += (int) c * (int) Math.pow(10, 2 - j % 2);
                        }
                        break;
                    case 33: // Imprimir una cadena en pantalla
                        int length = (int) memory[operando];
                        StringBuilder outputString = new StringBuilder(length);
                        for (int j = 0; j < length; j++) {
                            char c = (char) (memory[operando + 1 + j / 2] / (int) Math.pow(10, 2 - j % 2));
                            outputString.append(c);
                        }
                        System.out.println(outputString.toString());
                        break;
                    
                    
                    
                    }

                        contadorDeInstrucciones++;
                    } while (codigoDeOperacion != 99);
                } catch (FileNotFoundException e) {
                    System.out.println("* Error: El archivo " + fileName + " no se pudo encontrar *");
                }
            }
        }

