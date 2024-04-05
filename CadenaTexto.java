import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
        
        int longitud = texto.length();
        
        System.out.println("La longitud de la cadena es: " + longitud);
        
        scanner.close();
    }
}
