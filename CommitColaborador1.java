public class EjemploBranch {
    public static void main(String[] args) {
        System.out.println("¡Holii es el Colaborador 1!");
        
        // Agregamos una nueva función en el branch
        saludar("Almendrilla");
    }
    
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ". Bienvenido al branch, acabo de realizar mi primer commit");
    }
}