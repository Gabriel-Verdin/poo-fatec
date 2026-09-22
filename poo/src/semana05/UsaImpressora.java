package semana05;

public class UsaImpressora {

    public static void main(String[] args) {
        
        // Instanciação do objeto da classe impressora
        Impressora i = new Impressora();

        // Chamada sequecial dos trabalhos de impressão
        i.imprimir("Apostila de Java");
        i.imprimir("Apostila de Python");

    }

}
