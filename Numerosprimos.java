import java.util.Scanner;

public class VerificadorDePrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        
        boolean esPrimo = true;
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (numero <= 1) {
            esPrimo = false;
        }
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
        scanner.close();
    }
}
