package semana02;

public class Senha {

    public static void main(String[] args) {
        
        // Senha numérica
        String senhaNumerica = "";

        for(int i=1;i<=10;i++) {
            int n = (int) (Math.random()*10);
            senhaNumerica += n;
        }

        System.out.println(senhaNumerica);
    }

}
