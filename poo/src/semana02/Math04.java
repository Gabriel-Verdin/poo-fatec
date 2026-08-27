package semana02;

import java.util.Random;

public class Math04 {

    public static void main(String[] args) {
        
        // Math.random();

        Random random = new Random(); // Um método não static é chamado a partir do objeto

        for(int i=0;i<=10;i++) {
            System.out.println(random.nextInt(100));
        }
        
    }

}
