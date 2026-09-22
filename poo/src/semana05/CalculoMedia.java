package semana05;

public class CalculoMedia {

    // 1. Método que recebe 3 notas e retorna a média (float)
    // Nota: O sulfixo 'f' nos números floats é necessário em Java (ex: 3.2f)
    public static float calcularMedia(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3) / 3.0f;
    }

    // 2. Exemplo de Sobrecarga (Overload): Mesmo nome de método, mas com 2 parâmetros
    public static float calcularMedia(float nota1, float nota2) {
        return (nota1 + nota2 ) / 2.0f;
    }    
    
    // 3. Método Flexível: Recebe um Array de notas de qualquer tamanho
    public static float calcularMedia(float[] notas) {
        // Descobre a quantidade de elementos recebidos através da propriedade .lenght
        int quantidade = notas.length;

        float soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += notas[i];
        }

        return soma / quantidade;
    }

    public static void main(String[] args) {
        
        // Testando o método de 3 notas
        float mediaAluno1 = calcularMedia(3.2f, 5.7f, 4.0f);
        System.out.println("Média de 3 notas: " + mediaAluno1);

        // Testando a sobrecarga de 2 notas
        float mediaAluno2 = calcularMedia(7.5f, 8.5f);
        System.out.println("Média de 2 notas: " + mediaAluno2);

        // Testando o método flexível com Array
        float[] minhasNotas = {8.0f, 7.5f, 9.0f, 6.5f}; // 4 notas
        float mediaAluno3 = calcularMedia(minhasNotas);
        System.out.println("Média de N notas (Array): " + mediaAluno3);

    }

}
