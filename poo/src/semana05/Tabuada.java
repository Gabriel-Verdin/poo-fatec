package semana05;

public class Tabuada {

    // Método que recebe um número e exibe a tabuada de 0 a 10
    public static void mostrarTabuada(int n) {
        // Laço de repetição de 0 até 10
        for (int i = 0; i<= 10; i++) {
            // Concatenação formatada: "i x n = restultado"
            System.out.println(i + " x " + n + " = " + (i * n));
        }
    }

    public static void main(String[] args) {

        // Executando a tabuada para diferentes valores
        System.out.println("--- Tabuada do 2 ---");
        mostrarTabuada(2);

        System.out.println("\n--- Tabuada do 13 ---");
        mostrarTabuada(13);
    }

}
