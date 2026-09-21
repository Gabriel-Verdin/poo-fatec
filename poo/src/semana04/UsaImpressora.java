package semana04;

public class UsaImpressora {

    public static void main(String[] args) {
        
        String retornoImpressora = Impressora.imprimir("Chuva", 2);
        System.out.println(retornoImpressora);

        System.out.println("==============================");

        String retornoIressoraInverso = Impressora.imprimirInverso("Chuva");
        System.out.println(retornoIressoraInverso);
        
    }

}
