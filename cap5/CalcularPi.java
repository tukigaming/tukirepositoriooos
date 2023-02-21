package cap5;

public class CalcularPi {
    public static void main(String[] args) {
        double pi = 4.0;
        int denominador = 3;
        int signo = -1;
        for (int i = 2; i <= 200000; i++) {
            pi += signo * 4.0 / denominador;
            denominador += 2;
            signo = -signo;
        }
        System.out.println("El valor aproximado de π después de sumar 200,000 términos es: " + pi);
        int terminos = 200000;
        pi = 4.0;
        denominador = 3;
        signo = -1;
        for (int i = 2; i <= 1000000; i++) {
            pi += signo * 4.0 / denominador;
            denominador += 2;
            signo = -signo;
            if (String.valueOf(pi).startsWith("3.14159")) {
                terminos = i;
                break;
            }
        }
        System.out.println("Se necesitaron " + terminos + " términos para obtener un valor que comience con 3.14159");
    }
}