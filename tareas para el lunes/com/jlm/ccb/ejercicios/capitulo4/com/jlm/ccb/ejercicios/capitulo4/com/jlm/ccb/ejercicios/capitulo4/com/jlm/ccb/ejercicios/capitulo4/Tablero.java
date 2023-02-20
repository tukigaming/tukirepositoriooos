
public class Tablero {

    public void imprimir() {
    
        int renglon = 1;
   
        int columna = 1;
  
        while (renglon <= 8) {
            if ((renglon%2) == 0) {
                System.out.print(" ");
            }
            while (columna <= 8) {
                if ((columna%2) != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columna++;
            }
            columna = 1;
            System.out.println();
            renglon++;
        }
    }

 
    public static void main(String[] args) {
       
        Tablero tablero = new Tablero();
        tablero.imprimir();
    }
}