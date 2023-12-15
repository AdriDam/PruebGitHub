import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generar y mostrar 5 números aleatorios
        System.out.println("Números Aleatorios:");
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt(100); // Números aleatorios entre 0 y 99
            System.out.println(numeroAleatorio);
        }
    }
}
