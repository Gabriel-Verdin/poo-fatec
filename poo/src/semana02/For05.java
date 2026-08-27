package semana02;

public class For05 {

    public static void main(String[] args) throws InterruptedException {
        
        int[] n = {2, 3, 4, 5, 6, 7};
        
        for(int i=0;i<n.length;i++) {
            System.out.println(i + " = " + n[i]);
            Thread.sleep(500);
        }

        for(int numero:n) {
            System.out.println(numero);
        }
    }

}
