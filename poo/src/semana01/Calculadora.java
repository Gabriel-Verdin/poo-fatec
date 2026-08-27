package semana01;

public class Calculadora {

    // Essa é uma aplicação
    public static void main(String[] args) {
        
        if(args.length == 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println("Soma: " + (n1 + n2));
        }
        else {
            System.out.println("Falha na comunicação");
        }
    }

}