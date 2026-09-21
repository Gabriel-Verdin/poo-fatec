package semana04;

/**
 * Essa calsse simula o funcionamento 
 * de uma calculadora de operações básicas
 */
public class Calculadora {

    /**
     * Realiza a soma de dois valores inteiros
     * @param a - Primeiro valor
     * @param b - Segundo valor
     * @return A soma dos valores fornecidos
     */
    public static int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois valores inteiros
     * @param a - Primeiro valor
     * @param b - Segundo valor
     * @return A subtração dos valores fornecidos
     */
    public static int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois valores inteiros
     * @param a - Primeiro valor
     * @param b - Segundo valor
     * @return A multiplicação dos valores fornecidos
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois valores inteiros
     * @param a - Primeiro valor
     * @param b - Segundo valor
     * @return A divisão dos valores fornecidos
     */    
    public static int dividir(int a, int b) {
        return a / b;
    } 

    /**
     * Calcula a raiz quadrada de um valor recebido
     * @param a - Valor recebido
     * @return A raiz quadrada
     */    
    public static double raiz(int a) {
        double resultado = Math.sqrt(a);
        return resultado;
    }

}
