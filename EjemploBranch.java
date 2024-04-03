public class EjemploBranch {
    public static void main(String[] args) {
        System.out.println("¡Hola desde el branch!");
        
        // Agregamos una nueva función en el branch
        saludar("Almendra");
    }
    
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ". Bienvenido al branch");
    }
}
