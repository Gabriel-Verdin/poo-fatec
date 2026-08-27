package semana01;

public class ExemploTernario {

    public static void main(String[] args) {
        
        int a = 1, b = 2;

        System.out.println(a > b ? a : b > a? b : "Iguais");

        if(a > b) {
            System.out.println(a);
        }
        else if (b > a) {
            System.out.println(b);
        }
        else {
            System.out.println("Iguais");
        }

    }

}
