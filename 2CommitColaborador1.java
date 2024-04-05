public class Calculadora {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return (double) a / b;
    }
}
