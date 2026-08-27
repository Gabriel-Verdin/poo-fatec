package semana02;

public class Math01 {

    public static void main(String[] args) {
        
        // Um método static é acessado diretamente pela classe
        // Ex: Math.max() (Classe.método())

        int a = 10, b = 20, c = 30;
        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        System.out.println(Math.PI);
    }

}
