import java.util.Scanner;
public class NoRepetido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetido = false;
        int posicion = 0;

        System.out.println("Introduce la longitud del array:");
        int longitud = sc.nextInt();

        int[] primero = new int[longitud];
        int[] SinDuplicados = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.println("Introduce el valor numero " +  (i+1) + ":");
            primero[i] = sc.nextInt();
        }

        for (int i = 0; i < longitud; i++) {
            repetido = false;
            for (int j = 0; j < longitud; j++) {
                if (j!=i && primero[i]==SinDuplicados[j]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                SinDuplicados[posicion] = primero[i];
                posicion++;
            }
        }

        System.out.println("Array sin repetidos:");
        for (int i = 0; i < posicion; i++) {
            System.out.print(SinDuplicados[i] + " ");
        }
    }
}