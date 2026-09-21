package semana04;

/**
 * Simula o funcionamento de uma impressora
 */
public class Impressora {

    /**
     * Realiza a impressão de um texto N vezes
     * @param texto - O texto a ser impresso
     * @param quantCopias - A quantidade de cópias a ser impresso (>0)
     * @return - Uma mensagem informando o resultado da operação
     */
    public static String imprimir(String texto, int quantCopias) {
        // if (quantCopias <= 0) throw new QuantCopiasInvalidException();

        String mensagem = "Impressão realizada com sucesso!";

        if(quantCopias > 0) {
            for(int i=1; i<= quantCopias; i++) {
                System.out.println(texto);
            }
        }
        else {
            mensagem = "Falha na impressão, o número de cópias deve ser > 0";
        }
        return  mensagem;
    }

    /**
     * Realiza a impressão invertida (espelho) de um texto em console
     * @param texto - O texto recebido
     * @return - Uma mensagem informando o resultado
     */
    public static String imprimirInverso(String texto) {
        String mensagem = "Impressão realizada com sucesso!";
        String invertida = "";

        for(int i=texto.length()-1; i>=0; i--) {
            invertida += texto.charAt(i);
        }
        System.out.println("Original: " + texto);
        System.out.println("Invertido: " + invertida);

        return mensagem;
    } 

}
