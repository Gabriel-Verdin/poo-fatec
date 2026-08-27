package semana02;

public class For03 {

    public static void main(String[] args) throws InterruptedException {
        
        int total = 0;
        for(int i=0;i<=10;i++) {
            total += i;
            System.out.println(i + " = " + total);
            Thread.sleep(500);
        }

        // for(int i=0;i<=10;i++) {
        //     // 4
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        // 1. int i = 0 (inicialização)
        // 2. i <= 10 (comparação)
        // 4. Execução das instruções
        // 3. i++ (incremento / decremento)

    }

}
