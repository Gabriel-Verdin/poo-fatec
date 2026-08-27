package semana02;

public class Math02 {

    public static void main(String[] args) {
        
        double numero = Math.random(); // 0 ..... |1
        System.out.println(numero); // Pseudo Aleatório

        // for(int i=0; i<=10; i++) {
        //     double numSorteio = Math.random();

        //     int x = (int) (numSorteio * 100);
        //     // System.out.println(x + " - " + numSorteio);
        //     System.out.print(x + " ");
        // }

        // Cartão
        for(int a=1; a<=10; a++) {
            System.out.print("Cartão " + a + ": ");

            // Números do cartão
            for(int i=0;i<=6;i++) {
                double n = Math.random();
                int x = (int) (n*60);
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

}
