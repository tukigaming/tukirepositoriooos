package cap5;

public class ProductoImpares {
    public static void main(String[] args) {
        int producto = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                producto *= i;
            }
        }
        System.out.println("El producto de los enteros impares del 1 al 15 es: " + producto);
    }
}
