package semana05;

public class Recursividade {

    // Método recursivo que calcula a soma de 1 até N
    // Exemplo: somatoria(5) -> 5 + 4 + 3 + 2 + 1 = 15
    public static int somatoria(int n) {
        // Condição de parada (ponto que impede o estouro da pilha / StackOverFlowError)
        if (n == 1) {
            return 1;
        }

        //Chamada recursiva: empilha a operação pendente n + somatoria(n - 1)
        return n + somatoria(n - 1);
    }

    // Método recursivo para cálculo de Fatorial
    // Exemplo: fatorial(5) -> 5 * 4 * 3 * 2 * 1 = 120
    public static int fatorial(int n) {
        // Condição de parada
        if (n == 1) { 
            return 1;
        }

        // Chamada recursiva com multiplicação
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        
        System.out.println("--- Teste de Somatória ---");
        System.out.println("Somatória de 5: " + somatoria(5));
        System.out.println("Somatória de 10: " + somatoria(10));

        System.out.println("\n--- Teste de Fatorial ---");
        System.out.println("Fatorial de 3: " + fatorial(3));
        System.out.println("Fatorial de 4: " + fatorial(4));
        System.out.println("Fatorial de 5: " + fatorial(5));

    }

}
