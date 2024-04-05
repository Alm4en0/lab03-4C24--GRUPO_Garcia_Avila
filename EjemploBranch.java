public class EjemploBranch {
    public static void main(String[] args) {
        System.out.println("¡Hola desde el branch!");
        
        // Agregamos una nueva función en el branch
        saludar("Almendra");
        
        // Llamamos al nuevo método agregado
        int resultado = sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ". Bienvenido al branch");
    }
    
    // Nuevo método agregado
    public static int sumar(int a, int b) {
        return a + b;
    }
}
