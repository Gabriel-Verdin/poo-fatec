package semana02;

public class Math03 {

    public static void main(String[] args) {
        
        // int n = (int) Math.random()*10; // 0 a 9 
        
        int dado = 0;
        while (dado == 0) {
            dado = (int) (Math.random()*7); // 0 a 6    
        }
        System.out.println(dado);

        int jogador1 = 0;
        for(int i=0;i<=10;i++) {
            int n = 1 + (int) (Math.random()*6);
            jogador1 += n;
            // System.out.println(n);
        }

        int jogador2 = 0;
        for(int i=0;i<=10;i++) {
            int n = 1 + (int) (Math.random()*6);
            jogador2 += n;
            // System.out.println(n);
        }

        System.out.println("Jogador 01 - " + jogador1);
        System.out.println("Jogador 02 - " + jogador2);
    }

}
